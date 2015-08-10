package raisingteam.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignUp {
	 @Id
	 private  String email;
	 private  String password;
	 private String firstname;
	 private String lastName;
	 private String gender;
	 
	public SignUp (String email,String password,String firstname,String lastName, String gender){
		this.email=email;
		this.password=password;
		this.firstname=firstname;
		this.lastName=lastName;
		this.gender=gender;
		 
	}
	
	public SignUp ()
	{
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
