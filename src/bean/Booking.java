package bean;

import java.sql.Timestamp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Booking {
	private String idBooking;
	private String idUser;
	private String idRoom;
	private int idStatus;
	private String note;
	private Timestamp timeBooking;
	private Timestamp timeApproved;
}
