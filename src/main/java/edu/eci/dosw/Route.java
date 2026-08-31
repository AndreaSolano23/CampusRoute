package edu.eci.dosw;

import java.util.List;

public class Route {
    private final String name;
    private final List<segment> segments;

    public Route(String name, List<segment> segments) {
    this.name = name;
    this.segments = segments;
}

    public String getName() { return name; }

    public boolean isBlocked() {
    return segments.stream().anyMatch(s -> !s.isAvailable());
}

    public boolean hasStairs() {
    return segments.stream().anyMatch(segment:: hasStairs);
}

    public int totalTimeMinutes() {
    return segments.stream().mapToInt(segment:: getEstimatedTimeMinutes).sum();
}

    public int totalDistanceMeters() {
    return segments.stream().mapToInt(segment:: getDistanceMeters).sum();
}

    public double averageSecurity() {
    return segments.stream().mapToInt(segment:: getSecurityLevel).average().orElse(0);
}
}
