package in.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Student
{
	@Value("Sia")
	private String name;
	@Value ("101")
	private int rollno;
	@Value("sia12@gmail.com")
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollno);
		System.out.println("Email : "+email);
	
	}	
}
