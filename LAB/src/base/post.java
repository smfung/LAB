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
		return content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public String toString(){
		return this.date+"\n"+this.content;
	}
	public boolean equals(Object o){
		if (o==null)
			return false;
		
		boolean ans = true;
		if(o.getClass()!=this.getClass())
			return false;
		
		post post=(post) o;
		if(this.content==post.content)
			return true;
		else return false;
	}
	public int hashCode(){
		int a =date.hashCode();
		int b = content.hashCode();
		return a*7+b*3;
	}
	public boolean contains(String keyword){
		
		return this.content.contains(keyword);	
	}
	
	}
