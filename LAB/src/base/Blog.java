package base;

import java.util.ArrayList;
import base.*;
public class Blog {
	private User user;
	private ArrayList<base.post> allPost;
	
	public Blog(User user){
		this.user=user;
		this.allPost=new ArrayList<Post>();
	}
	
	public void setUser(User user){
		this.user=user;
	}
	
	public User getUser(){
		return this.user;
	}
	
	public void post(Post p){
		this.allPost.add(p);
		System.out.println("add post succeed");
	}
	
	public void list(){
		for(int a:this.allPost){
			allPost.get(a).toSting();
		}
	}
	
	public void delete(int index){
		if((index<0)||(index>=allPost.size()))
			System.out.println("wrong index");
		else
			allPost.remove(index);
			
	}
	

}
