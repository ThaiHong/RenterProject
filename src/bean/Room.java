package bean;

import java.sql.Timestamp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Room {
	private String idRoom;
	private String idUser;
	private String idCategory;
	private double cost;
	private String description;
	private int status;
	private Timestamp timeCreated;
	private Timestamp timeUpdated;
	private boolean isEmpty;
	private String roomName;
	private String street;
	private String district;
}
