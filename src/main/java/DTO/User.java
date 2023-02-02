package DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
@Id

int id;
String name;
long mobile;
String email;
String password;
String gender;
String address;
String hobbies;

public int getId() {
	return id;
}
public void setId(int string) {
	this.id = string;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public void setId(String parameter) {
	// TODO Auto-generated method stub
	
}

}

