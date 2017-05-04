import java.util.Date;

public class User {
	int userId;
	String username;
	String password;
	String email;
	String motto;
	
	public User(){
		
	}
	public int getUserId(){
		return userId;
	}
	public void setUserId(int userId){
		//use the keyword this to refer to the class variable 
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotto() {
		return motto;
	}
	public void setMotto(String motto) {
		this.motto = motto;
	}
}
