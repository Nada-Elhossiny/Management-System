package tutoringCenter;

import java.util.ArrayList;

//A subclass of the Person class that inherits its basic characteristics but adds characteristics unique to instructors such as their pay rate
public class Instructor extends Person {
	private double payRate;
	//ArrayLists are used to store the data that instructors will need for personal reference such as their schedule, any notes they want to keep and messages to relay to their center director.
	private ArrayList <String> instructorSchedule = new ArrayList();
	private ArrayList <String> notes = new ArrayList();
	private ArrayList <String> notesForDirector = new ArrayList();
	
	//Constructors that inherit basic qualities from the Person superclass and add on unique qualities.
	Instructor (int id, String nm, double pr) {
		super (id, nm);
		payRate = pr;
		}
	
	Instructor (int id, String nm, String ce, String cp, double pr) {
		super (id, nm, ce, cp);
		payRate = pr;
	}

	public Instructor (int id) {
		super (id);
	}

	//Setters and getters in order to access data outside this class
	public double getPayRate() {
		return payRate;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	public ArrayList<String> getInstructorSchedule() {
		return instructorSchedule;
	}

	public void setInstructorSchedule(ArrayList<String> instructorSchedule) {
		this.instructorSchedule = instructorSchedule;
	}

	public ArrayList<String> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<String> notes) {
		this.notes = notes;
	}

	public ArrayList<String> getNotesForDirector() {
		return notesForDirector;
	}

	public void setNotesForDirector(ArrayList<String> notesForDirector) {
		this.notesForDirector = notesForDirector;
	}

	//Method that calculates the weekly earnings of an instructor by multiplying their pay rate by the size of their schedule (number of hours per week)
	public double earningsPerWeek() {
		double earnings = payRate * instructorSchedule.size();
		return earnings;
	}
}
