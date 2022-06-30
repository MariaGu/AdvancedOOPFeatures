import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {

    }

    public static boolean isFlightOk(Flight flight) {

        LocalDateTime flightTime = Instant.ofEpochMilli(flight.getDate().getTime())
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        return (flight.getType() == Flight.Type.DEPARTURE)
                && (flightTime.isAfter(LocalDateTime.now()))
                && (flightTime.isBefore(LocalDateTime.now().plusHours(2)));
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        return airport.getTerminals().stream().flatMap(terminal -> terminal.getFlights().stream()).filter(Main::isFlightOk).collect(Collectors.toList());

    }
}