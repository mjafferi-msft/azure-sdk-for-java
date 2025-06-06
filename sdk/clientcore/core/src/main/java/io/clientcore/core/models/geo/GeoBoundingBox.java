// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.models.geo;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.MetadataProperties;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/**
 * Represents a geometric bounding box.
 *
 * <p>This class encapsulates a bounding box defined by west, south, east, and north coordinates, and optionally
 * minimum and maximum altitude. It provides methods to access these properties.</p>
 *
 * <p>This class is useful when you want to work with a bounding box in a geographic context. For example, you can use
 * it to define the area of interest for a map view, or to specify the spatial extent of a geographic dataset.</p>
 */
@Metadata(properties = MetadataProperties.IMMUTABLE)
public final class GeoBoundingBox implements JsonSerializable<GeoBoundingBox> {
    // GeoBoundingBox is a commonly used model, use a static logger.
    private static final ClientLogger LOGGER = new ClientLogger(GeoBoundingBox.class);

    private final double west;
    private final double south;
    private final double east;
    private final double north;

    private final Double minAltitude;
    private final Double maxAltitude;

    /**
     * Constructs a bounding box.
     *
     * @param west West longitudinal boundary.
     * @param south South latitudinal boundary.
     * @param east East longitudinal boundary.
     * @param north North latitudinal boundary.
     */
    public GeoBoundingBox(double west, double south, double east, double north) {
        this(west, south, east, north, null, null, null);
    }

    /**
     * Constructs a bounding box.
     *
     * @param west West longitudinal boundary.
     * @param south South latitudinal boundary.
     * @param east East longitudinal boundary.
     * @param north North latitudinal boundary.
     * @param minAltitude Minimum altitude boundary.
     * @param maxAltitude Maximum altitude boundary.
     */
    public GeoBoundingBox(double west, double south, double east, double north, double minAltitude,
        double maxAltitude) {
        this(west, south, east, north, minAltitude, maxAltitude, null);
    }

    /*
     * This constructor allows the one above to require both min altitude and max altitude to be non-null.
     */
    private GeoBoundingBox(double west, double south, double east, double north, Double minAltitude, Double maxAltitude,
        String ignored) {
        this.west = west;
        this.south = south;
        this.east = east;
        this.north = north;
        this.minAltitude = minAltitude;
        this.maxAltitude = maxAltitude;
    }

    /**
     * The west longitudinal boundary of the bounding box.
     *
     * @return The west longitudinal boundary.
     */
    public double getWest() {
        return west;
    }

    /**
     * The south latitudinal boundary of the bounding box.
     *
     * @return The south latitudinal boundary.
     */
    public double getSouth() {
        return south;
    }

    /**
     * The east longitudinal boundary of the bounding box.
     *
     * @return The east longitudinal boundary.
     */
    public double getEast() {
        return east;
    }

    /**
     * The north latitudinal boundary of the bounding box.
     *
     * @return The north latitudinal boundary.
     */
    public double getNorth() {
        return north;
    }

    /**
     * The minimum altitude boundary of the bounding box.
     *
     * @return The minimum altitude boundary.
     */
    public Double getMinAltitude() {
        return minAltitude;
    }

    /**
     * The maximum altitude boundary of the bounding box.
     *
     * @return The maximum altitude boundary.
     */
    public Double getMaxAltitude() {
        return maxAltitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(west, south, east, north, minAltitude, maxAltitude);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GeoBoundingBox)) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        GeoBoundingBox other = (GeoBoundingBox) obj;
        return Double.compare(west, other.west) == 0
            && Double.compare(south, other.south) == 0
            && Double.compare(east, other.east) == 0
            && Double.compare(north, other.north) == 0
            && Objects.equals(minAltitude, other.minAltitude)
            && Objects.equals(maxAltitude, other.maxAltitude);
    }

    /**
     * Accesses the coordinates of the {@link GeoBoundingBox} as if it were in a JSON representation.
     *
     * @param i Index to access.
     * @return The double value of the index.
     * @throws IndexOutOfBoundsException If the {@link GeoBoundingBox} doesn't have altitude coordinates and {@code i}
     * is greater than {@code 3} or {@link GeoBoundingBox} has altitude coordinates and {@code i} is greater than
     */
    double get(int i) {
        if (minAltitude != null && maxAltitude != null) {
            switch (i) {
                case 0:
                    return west;

                case 1:
                    return south;

                case 2:
                    return minAltitude;

                case 3:
                    return east;

                case 4:
                    return north;

                case 5:
                    return maxAltitude;

                default:
                    throw LOGGER.throwableAtWarning().log("Index out of range: " + i, IndexOutOfBoundsException::new);
            }
        } else {
            switch (i) {
                case 0:
                    return west;

                case 1:
                    return south;

                case 2:
                    return east;

                case 3:
                    return north;

                default:
                    throw LOGGER.throwableAtWarning().log("Index out of range: " + i, IndexOutOfBoundsException::new);
            }
        }
    }

    @Override
    public String toString() {
        return (minAltitude != null && maxAltitude != null)
            ? String.format("[%s, %s, %s, %s, %s, %s]", west, south, minAltitude, east, north, maxAltitude)
            : String.format("[%s, %s, %s, %s]", west, south, east, north);
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartArray().writeDouble(west).writeDouble(south);

        if (minAltitude != null) {
            jsonWriter.writeDouble(minAltitude);
        }

        jsonWriter.writeDouble(east).writeDouble(north);

        if (maxAltitude != null) {
            jsonWriter.writeDouble(maxAltitude);
        }

        return jsonWriter.writeEndArray();
    }

    /**
     * Reads a JSON stream into a {@link GeoBoundingBox}.
     *
     * @param jsonReader The {@link JsonReader} being read.
     * @return The {@link GeoBoundingBox} that the JSON stream represented, or null if it pointed to JSON null.
     * @throws IllegalStateException If the {@link GeoBoundingBox} doesn't have four or six positions in the array.
     * @throws IOException If a {@link GeoBoundingBox} fails to be read from the {@code jsonReader}.
     */
    public static GeoBoundingBox fromJson(JsonReader jsonReader) throws IOException {
        List<Number> coordinates = jsonReader.readArray(reader -> {
            if (reader.currentToken() == JsonToken.NUMBER) {
                return reader.getDouble();
            } else {
                return null;
            }
        });

        if (coordinates == null) {
            return null;
        }

        int coordinateCount = coordinates.size();
        if (coordinateCount != 4 && coordinateCount != 6) {
            throw LOGGER.throwableAtError()
                .log("Only 2 or 3 dimension bounding boxes are supported.", IllegalStateException::new);
        }

        double west = coordinates.get(0).doubleValue();
        double south = coordinates.get(1).doubleValue();
        double east = coordinates.get((coordinateCount == 6) ? 3 : 2).doubleValue();
        double north = coordinates.get((coordinateCount == 6) ? 4 : 3).doubleValue();
        Double minAltitude = (coordinateCount == 6) ? coordinates.get(2).doubleValue() : null;
        Double maxAltitude = (coordinateCount == 6) ? coordinates.get(5).doubleValue() : null;

        return new GeoBoundingBox(west, south, east, north, minAltitude, maxAltitude, null);
    }
}
