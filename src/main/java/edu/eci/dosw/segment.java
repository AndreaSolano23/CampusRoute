package edu.eci.dosw;

public class segment {
    private final String origin;
    private final String destination;
    private final int distanceMeters;
    private final int estimatedTimeMinutes;
    private final int securityLevel;
    private final boolean hasStairs;
    private final boolean isAvailable;

    public segment(String origin, String destination, int distanceMeters,
        int estimatedTimeMinutes, int securityLevel,
        boolean hasStairs, boolean isAvailable) {
            this.origin = origin;
            this.destination = destination;
            this.distanceMeters = distanceMeters;
            this.estimatedTimeMinutes = estimatedTimeMinutes;
            this.securityLevel = securityLevel;
            this.hasStairs = hasStairs;
            this.isAvailable = isAvailable;
}

    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }
    public int getDistanceMeters() { return distanceMeters; }
    public int getEstimatedTimeMinutes() { return estimatedTimeMinutes; }
    public int getSecurityLevel() { return securityLevel; }
    public boolean hasStairs() { return hasStairs; }
    public boolean isAvailable() { return isAvailable; }
}