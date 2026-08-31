package edu.eci.dosw;

import java.util.Comparator;
import java.util.List;

public class FastestEstrategy implements routePreferency {
    @Override
    public Route selectBest(List<Route> routes) {
    return routes.stream()
        .filter(r -> !r.isBlocked())
        .min(Comparator.comparingInt(Route:: totalTimeMinutes))
        .orElse(null);
}
}
