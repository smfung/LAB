package base;
import java.util.Date;
public class User {
	private int id;
	private String name;
	private String address;
	
	public User (int id, String name, String address){
		this.id=id;
		this.address=address;
		this.name=name;
		System.out.println("User [userID="+id+", userName="+name+", userEmail="+address+"]");
	}
	

}
