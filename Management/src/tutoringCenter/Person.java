package tutoringCenter;

import java.util.ArrayList;

//The person class is the "parent" class which gives all members in the system their basic information (name, contact info, ID)
public class Person {
	private int ID;
	private String name;
	private String contactEmail;
	private String contactPhone;
	
	//constructor that only sets person's ID
	public Person (int id) {
		ID = id;
	}

	//constructor that can be used to make a Person object with no contact info
	public Person (int id, String nm) {
		ID = id;
		name = nm;
		contactEmail = "none";
		contactPhone = "none";
	}
	
	//constructor that can be used to make a Person object with all the information possible
	public Person (int id, String nm, String ce, String cp) {
		ID = id;
		name = nm;
		contactEmail = ce;
		contactPhone = cp;
	}

	//setters and getters for all the private variables in this class so that we can access them elsewhere
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
}
