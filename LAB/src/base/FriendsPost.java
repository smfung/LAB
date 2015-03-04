package base;
import java.util.Date;
public class FriendsPost extends post{

	private User friend;
	public FriendsPost (Date date,String content){
		super(date,content);
		
	}
	public FriendsPost (Date date,String content,User user){
		super(date,content);
		this.friend = user;
		
	}

}
