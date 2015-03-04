package base;

import java.util.ArrayList;

import base.*;
public class Blog {
	private User user;
	private ArrayList<base.post> allPost;
	
	public Blog(User user){
		this.user=user;
		this.allPost=new ArrayList<post>();
	}
	
	public void setUser(User user){
		this.user=user;
	}
	
	public User getUser(){
		return this.user;
	}
	
	public void post(post p){
		allPost.add(p);
		System.out.println("A new Post:\n"+p);
	}
	
	public void list(){
		System.out.println("Current posts");
		for(int a=0 ; a<allPost.size();a++){
			int i=a+1;
			System.out.println("Post["+ i +"]:"+allPost.get(a));
			
		}
	}
	
	public void delete(int index){
		if((index<0)||(index>=allPost.size()))
			System.out.println("wrong index");
		else
			allPost.remove(index);
			
	}

	@Override
	public String toString() {
		return "Blog [user=" + user + ", allPost=" + allPost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allPost == null) ? 0 : allPost.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Blog other = (Blog) obj;
		if (allPost == null) {
			if (other.allPost != null)
				return false;
		} else if (!allPost.equals(other.allPost))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	

}

