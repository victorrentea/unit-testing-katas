package victor.testing.kata.trip;

import java.util.List;

public class TripRepository {

	public List<Trip> findTripsByUser(User user) {
		throw new RuntimeException("TripDAO should not be invoked on an unit test.");
	}
	
}