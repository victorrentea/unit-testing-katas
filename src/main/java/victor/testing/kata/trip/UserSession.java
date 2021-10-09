package victor.testing.kata.trip;

public class UserSession {

	private static final UserSession userSession = new UserSession();
	
	private UserSession() {
	}
	
	public static UserSession getInstance() {
		return userSession;
	}

	public User getLoggedUser() {
		throw new RuntimeException("UserSession.getLoggedUser() should not be called in an unit test");
	}

}