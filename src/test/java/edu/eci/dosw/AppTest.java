package edu.eci.dosw;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RouteTest {

    @Test
    void shouldDetectBlockedRoute() {
        segment segment = new segment(
                "A", "B", 100, 2, 4, false, false
        );

        Route route = new Route("Ruta bloqueada", List.of(segment));

        assertTrue(route.isBlocked());
    }

    @Test
    void shouldCalculateTotalTime() {
        segment s1 = new segment("A", "B", 100, 5, 4, false, true);
        segment s2 = new segment("B", "C", 200, 3, 4, false, true);

        Route route = new Route("Ruta", List.of(s1, s2));

        assertEquals(8, route.totalTimeMinutes());
    }

    @Test
    void shouldCalculateTotalDistance() {
        segment s1 = new segment("A", "B", 100, 5, 4, false, true);
        segment s2 = new segment("B", "C", 200, 3, 4, false, true);

        Route route = new Route("Ruta", List.of(s1, s2));

        assertEquals(300, route.totalDistanceMeters());
    }

}
