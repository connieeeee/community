package bit.com.a.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	private int user_seq;
	private String user_email;
	private String password;
	private String nickname;
	private String user_profile_image;
	private String old_proflie_name;
	private int auth;
	
	public UserDto() {}

	public UserDto(int user_seq, String user_email, String password, String nickname, String user_profile_image,
			String old_proflie_name, int auth) {
		super();
		this.user_seq = user_seq;
		this.user_email = user_email;
		this.password = password;
		this.nickname = nickname;
		this.user_profile_image = user_profile_image;
		this.old_proflie_name = old_proflie_name;
		this.auth = auth;
	}

	public UserDto(String user_email, String password, String nickname, String user_profile_image,
			String old_proflie_name) {
		super();
		this.user_email = user_email;
		this.password = password;
		this.nickname = nickname;
		this.user_profile_image = user_profile_image;
		this.old_proflie_name = old_proflie_name;
	}

	public int getUser_seq() {
		return user_seq;
	}

	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUser_profile_image() {
		return user_profile_image;
	}

	public void setUser_profile_image(String user_profile_image) {
		this.user_profile_image = user_profile_image;
	}

	public String getOld_proflie_name() {
		return old_proflie_name;
	}

	public void setOld_proflie_name(String old_proflie_name) {
		this.old_proflie_name = old_proflie_name;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}
	
	
}
