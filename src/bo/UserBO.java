package bo;

import dao.UserDAO;

public class UserBO {
	private UserDAO mUserDAO;

	public UserBO() {
		super();
		mUserDAO = new UserDAO();
	}

}
