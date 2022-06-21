package tutoringCenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//This class is used to create all the objects to represent instructor availability at each of the working hours
public class InstructorAvailability{
	private int id;
	private int studentID;
	private String day;
	private String time;
	private boolean available;
	

	public InstructorAvailability (int identification, String da, String ti, boolean av) {
		id = identification;
		day = da;
		time = ti;
		available = av;
	}
	
	//if a session is booked, we can tell because it will have a student ID next to the instructor availability. This is not displayed.
	public InstructorAvailability (int identification, String da, String ti, boolean av, int stuID) {
		id = identification;
		day = da;
		time = ti;
		available = av;
		studentID = stuID;
	}
	
	//No argument constructor
	InstructorAvailability() {
	}

	//setters and getters to access private variables in other classes and change the availability
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}