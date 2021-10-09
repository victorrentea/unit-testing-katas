package victor.testing.kata.trip;

import java.util.ArrayList;
import java.util.List;

public class TripService {
	private final TripRepository tripRepository;

	public TripService(TripRepository tripRepository) {
		this.tripRepository = tripRepository;
	}

	public List<Trip> getTripsByUser(User user, User loggedUser) throws UserNotLoggedInException {
		List<Trip> tripList = new ArrayList<>();
		boolean isFriend = false;
		if (loggedUser != null) {
			for (User friend : user.getFriends()) {
				if (friend.equals(loggedUser)) {
					isFriend = true;
					break;
				}
			}
			if (isFriend) {
				tripList = tripRepository.findTripsByUser(user);
			}
			return tripList;
		} else {
			throw new UserNotLoggedInException();
		}
	}
	
}