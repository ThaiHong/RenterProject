package bo;

import dao.RoomDAO;

public class RoomBO {
	private RoomDAO mRoomDAO;

	public RoomBO() {
		super();
		mRoomDAO = new RoomDAO();
	}

}
