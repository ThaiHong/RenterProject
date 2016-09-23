package bo;

import dao.BookingDAO;

public class BookingBO {
	private BookingDAO mBookingDAO;

	public BookingBO() {
		super();
		mBookingDAO = new BookingDAO();
	}

}
