package lighting;

import primitives.*;

import java.util.List;

/**
 * An interface for light sources
 */
public interface LightSource {
    /**
     * Calculate the intensity of the light source at the given point
     *
     * @param p the point
     * @return the calculated intensity
     */
    Color getIntensity(Point p);

    /**
     * Calculates the distance between the light source and a point
     *
     * @param p a point
     * @return the distance
     */
    double getDistance(Point p);

    /**
     * Gets vector from the given point to the light source
     *
     * @param p the point
     * @return The vector
     */
    Vector getL(Point p);

    /**
     * Gets vectors from the given point to the light source
     *
     * @param p the point
     * @return all vectors who created
     */
    List<Vector> getL2(Point p);
}
