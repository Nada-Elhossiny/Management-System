package tutoringCenter;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Creates an instance of the selection class, which has the code for most of the program's functions
		Selection selection = new Selection();
		//Loads the data in the selection class
		selection.setup();
		
		//Instances of all data collection used in selection class
		ArrayList<Student> students = selection.getStudents();
		Map <Integer, ArrayList<InstructorAvailability>> availablityList = selection.getAvailablityList();
		ArrayList<Instructor> instructors = selection.getInstructors();
		ArrayList<Student> studentList = selection.getStudents();
		ArrayList<InstructorAvailability> viewList = selection.getViewList();
		
		String again = "y";
		//Allows the user to input another ID if theirs was invalid, instead of ending the program
		while (again.equals("y")) {

		//Prompts user to input their ID in order to determine whether they are a student or an instructor and retrieveg their schedule
		Scanner signIn = new Scanner (System.in);
		System.out.println ("Please input your ID number:");
		String chosenPerson = signIn.nextLine();

		for (int i = 0; i < students.size(); i++) {
				Student student = students.get(i);
				//Enter if the inputted ID is that of a student
				if (student.getID() == Integer.parseInt(chosenPerson)) {
					//Welcome the student
					System.out.println("Welcome " + student.getName() + " :)");
					//retrieve their schedule and display it (if applicable)
					selection.getStudentSchedule(availablityList, instructors, student);
					//Skip retrieving the schedule if the student has no scheduled sessions
					if (!student.getStudentSchedule().isEmpty()) {
						System.out.println("Here is your current schedule:");
						//Traverse the getStudentSchedule() arraylist to show schedule
						for (String session : student.getStudentSchedule()) {
							System.out.println(session);
						}
						//Allows student to make changes to existing schedule (if applicable)
						selection.updateExistingSession(student);
					}
					//Shows that the student ID is valid so a loop is no longer needed
					again = "n";
					System.out.println("\nGet ready to begin the scheduling process!\n");
					//Begin the process of scheduling a new session
					selection.selecting();
					//Allows the student to move on to selecting their day and time only if they are happy with their selected instructor
					if (selection.isCanContinue() == true) {
						selection.dayAndTime(student);
						//Displays the student menu, is a recursive method
						selection.nextAction(availablityList, instructors, student);
					}
				}
			}
		
		for (int i = 0; i < instructors.size(); i++) {
			Instructor instructor = instructors.get(i);
			//Enter if user is an instructor
			if (instructor.getID() == Integer.parseInt(chosenPerson)) {
				//Welcomes the instructor
				System.out.println("Welcome " + instructor.getName() + "!");
				selection.getInstructorSchedule(availablityList, students, instructor);
				if (!instructor.getInstructorSchedule().isEmpty()) {
					System.out.println("Here is your current schedule:");
					//Traverses getInstructorSchedule array to show an instructor their schedule (if applicable)
					for (String session : instructor.getInstructorSchedule()) {
						System.out.println(session);
					}
				}
				//Displays the instructor menu, is a recursive method
				selection.getInstructorNextAction(availablityList, instructor, studentList);
				//Shows that the student ID is valid so a loop is no longer needed
				again = "n";
			}
		}
	}
		//Logs students and instructors out after they have chosen to leave their session.
		System.out.println("\nThank you for your time. You have been logged out and changes have been saved :) ");
	}
}