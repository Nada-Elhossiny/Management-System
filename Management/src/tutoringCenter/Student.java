package tutoringCenter;

import java.util.ArrayList;

//A subclass of Person that inherits basic qualities and adds qualities unique to a student such as their grade level and fees
public class Student extends Person {
	private String parentName;
	private int gradeLevel;
	private double feesPerHour;
	private ArrayList <String> studentSchedule = new ArrayList();
	
	//super used to inherit from Person class
	Student (int id, String nm, int gL, int fpw) {
		super (id, nm);
		gradeLevel = gL;
		feesPerHour = fpw;
	}
	
	//gives the student the standard $30.00 cost per hour session
	Student (int id, String nm, String ce, String cp, String pn, int gL) {
		super (id, nm, ce, cp);
		parentName = pn;
		gradeLevel = gL;
		feesPerHour = 30.0;
	}
	
	//input the cost per hour which is helpful if cost is unique to that student
	Student (int id, String nm, String ce, String cp, String pn, int gL, double fph) {
		super (id, nm, ce, cp);
		parentName = pn;
		gradeLevel = gL;
		feesPerHour = fph;
	}

	//setters and getters create for private variables, in order to access them elsewhere
	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public double getFeesPerHour() {
		return feesPerHour;
	}

	public void setFeesPerHour(double feesPerHour) {
		this.feesPerHour = feesPerHour;
	}

	public ArrayList<String> getStudentSchedule() {
		return studentSchedule;
	}

	public void setStudentSchedule(ArrayList<String> studentSchedule) {
		this.studentSchedule = studentSchedule;
	}
	
	//calculates the weekly fees a student has to pay based on their rate per hour multiplied by the size of their schedule array (number of sessions a week).
	public double weeklyFees() {
		double fees = feesPerHour * studentSchedule.size();
		return fees;
	}
}
