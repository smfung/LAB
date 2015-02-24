package base;
import java.util.Date;
public class post {
	private Date date;
	private String content;
	
	public post(Date date,String content){
		this.date =date;
		this.content=content;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String toSting(){
		return this.date+"\n"+this.content;
	}
	public boolean equals(Object o){
		boolean ans = true;
		
		o.getClass();
		post post=(post) o;
		return ans;
	}
	public int hashCode(){
		int hashCode=0;
		//TODO
		date.hashCode();
		return hashCode;
	}
	public boolean contains(String keyword){
	//TODO
		return ture;	
	}
	
	}
	