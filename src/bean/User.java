package bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class User {
	private String idUser;
	private String username;
	private String password;
	private String phoneNumber;
	private int role;
	private String email;
	private String address;
	private double cost;
}
