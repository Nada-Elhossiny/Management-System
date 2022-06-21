package tutoringCenter;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

//This is a class dedicating from gathering input from the user in order to perform the functions they want
public class UserInput {
	private String selectedUpdate = "";
	private String preferredInstructor = "";
	private String selectedInstructor = "";
	private String selectedTime = "";
	private String selectedDay = "";
	private int selectedSession;
	private String updatingAction = "";
	private int selectedAction;
	private int selectedInstructorAction;
	private String addedNote = "";
	private int searchingForStudent;

	//Setters and getters are created to save the user's choice and be able to act on it in a different class
	public String getSelectedUpdate() {
		return selectedUpdate;
	}

	public void setSelectedUpdate(String selectedUpdate) {
		this.selectedUpdate = selectedUpdate;
	}

	public String getPreferredInstructor() {
		return preferredInstructor;
	}

	public void setPreferredInstructor(String preferredInstructor) {
		this.preferredInstructor = preferredInstructor;
	}

	public String getSelectedInstructor() {
		return selectedInstructor;
	}

	public void setSelectedInstructor(String selectedInstructor) {
		this.selectedInstructor = selectedInstructor;
	}

	public String getSelectedTime() {
		return selectedTime;
	}

	public void setSelectedTime(String selectedTime) {
		this.selectedTime = selectedTime;
	}

	public String getSelectedDay() {
		return selectedDay;
	}

	public void setSelectedDay(String selectedDay) {
		this.selectedDay = selectedDay;
	}

	public int getSelectedSession() {
		return selectedSession;
	}

	public void setSelectedSession(int selectedSession) {
		this.selectedSession = selectedSession;
	}

	public String getUpdatingAction() {
		return updatingAction;
	}

	public void setUpdatingAction(String updatingAction) {
		this.updatingAction = updatingAction;
	}

	public int getSelectedAction() {
		return selectedAction;
	}

	public void setSelectedAction(int selectedAction) {
		this.selectedAction = selectedAction;
	}

	public int getSelectedInstructorAction() {
		return selectedInstructorAction;
	}

	public void setSelectedInstructorAction(int selectedInstructorAction) {
		this.selectedInstructorAction = selectedInstructorAction;
	}

	public String getAddedNote() {
		return addedNote;
	}

	public void setAddedNote(String addedNote) {
		this.addedNote = addedNote;
	}

	public int getSearchingForStudent() {
		return searchingForStudent;
	}

	public void setSearchingForStudent(int searchingForStudent) {
		this.searchingForStudent = searchingForStudent;
	}

	//Asks a student who previously had scheduled sessions if they would like to update them
	public void wantToUpdateSchedule() {
		Scanner update = new Scanner (System.in);
		System.out.println ("Would you like to update your current schedule? (Y/N)");
		String selectedUp = update.nextLine();
		
		if (selectedUp.toUpperCase().equals("Y")) {
			selectedUpdate = "Y";
		}
		else if (selectedUp.toUpperCase().equals("N")) {
			selectedUpdate = "N";
		}
		else {
			System.out.println("Invalid input");
			wantToUpdateSchedule();
		}
	}

	//Asks a student which instructor they would prefer to work with
	public void selectInstructor() {
		Scanner chooseInstructor = new Scanner (System.in);
		System.out.println ("Select an instructor (Ahmed/Saniya/Ishleen/Alyssa/Joe): ");
		String chosen = chooseInstructor.nextLine();
	
		//The toUpperCase() method is used to ensure that the program understands the user input, regardless of their capitalization. This method is used throughout the program.
		if (chosen.toUpperCase().equals("AHMED")) {
			preferredInstructor = "Ahmed";
		}
		else if (chosen.toUpperCase().equals("SANIYA")) {
			preferredInstructor = "Saniya";
		}
		else if (chosen.toUpperCase().equals("ISHLEEN")) {
			preferredInstructor = "Ishleen";
		}
		else if (chosen.toUpperCase().equals("ALYSSA")) {
			preferredInstructor = "Alyssa";
		}
		else if (chosen.toUpperCase().equals("JOE")) {
			preferredInstructor = "Joe";
		}
		else {
			System.out.println("You have not selected one of the choices.");
			selectInstructor();
		}
	}
	
	//Asks the user to confirm that they want to schedule a session with this instructor once they have viewed their availability
	public void happyWithInstructor() {
		Scanner happy = new Scanner (System.in);
		System.out.println ("Would you like to select a time with this instructor? (Y/N)");
		String select = happy.nextLine();
		
		//If the student chooses this instructor, the variable selectedInstructor gets a value, this will allow it to move on to inputting the day and time they want.
		if (select.toUpperCase().equals("Y")) {
			selectedInstructor = preferredInstructor;
		}
		//If the student wants to select a different instructor, then this option will go back to the selectInstructor() method because it is recursive in the selection class.
		else if (select.toUpperCase().equals("N")) {
			System.out.print("\n");
		}
		//Allows the user to input another input if their input was invalid in order to stop the program from ending. This is used throughout the program.
		else {
			System.out.println("Invalid input");
			happyWithInstructor();
		}
	}
	
	//Student chooses what day and time they would like their session with their selected instructor to be
	public void chooseTime() {
		Scanner date = new Scanner (System.in);
		System.out.println ("Select a day (Mon/Tues/Wed/Thurs/Fri): ");
		String chosenDay = date.nextLine();
		
		Scanner time = new Scanner (System.in);
		System.out.println ("Select a time (3-4pm, 4-5pm, 5-6pm, 6-7pm): ");
		String chosenTime = time.nextLine();
		
		//Confirms that day is valid and saves string value
		if (chosenDay.toUpperCase().equals("MON")) {
			selectedDay = "Mon";
		}
		else if (chosenDay.toUpperCase().equals("TUES")) {
			selectedDay = "Tues";
		}
		else if (chosenDay.toUpperCase().equals("WED")) {
			selectedDay = "Wed";
		}
		else if (chosenDay.toUpperCase().equals("THURS")) {
			selectedDay = "Thurs";
		}
		else if (chosenDay.toUpperCase().equals("FRI")) {
			selectedDay = "Fri";
		}
		else {
			System.out.println("Invalid day input");
			chooseTime();
		}
		
		//Confirms that time is valid and saves string value
		if (chosenTime.toUpperCase().equals("3-4PM")) {
			selectedTime = "3-4pm";
		}
		else if (chosenTime.toUpperCase().equals("4-5PM")) {
			selectedTime = "4-5pm";
		}
		else if (chosenTime.toUpperCase().equals("5-6PM")) {
			selectedTime = "5-6pm";
		}
		else if (chosenTime.toUpperCase().equals("6-7PM")) {
			selectedTime = "6-7pm";
		}
		else {
			System.out.println("Invalid time input");
			chooseTime();
		}		
	}
	
	//If a student chooses to update their existing session, they are prompted to select which session they would like to update, then given the option to remove or reschedule it
	public void updateSession() {
		Scanner chooseSession = new Scanner (System.in);
		System.out.println ("Which session would you like to update? (Input session number) ");
		String session = chooseSession.nextLine();
		selectedSession = Integer.parseInt(session);
		
		Scanner update = new Scanner (System.in);
		System.out.println ("Would you like to remove or reschedule this session? (Remove/Reschedule)");
		String chosenUpdate = update.nextLine();
		
		if (chosenUpdate.toUpperCase().equals("REMOVE")) {
			updatingAction = "Remove";
		}
		else if (chosenUpdate.toUpperCase().equals("RESCHEDULE")) {
			updatingAction = "Reschedule";
		}
		else {
			System.out.println("Invalid input");
			updateSession();
		}
	}
	
	//Once the student has initially scheduled their session, they are given the option to access some of the program's other features. This will be used in a recursive method that repeats until option 3 is selected.
	public void chooseAction() {
		Scanner action = new Scanner (System.in);
		System.out.println ("Select an option by inputting a number: \n1) Add another session\n2) View weekly fees\n3) End session and logout\n");
		String sAction = action.nextLine();
		selectedAction = Integer.parseInt(sAction);
	}
	
	//Once an instructor logs in and views their schedule, they are given a "menu" of options to choose from in order to perform the function they would like. This is used in a recursive method that repeats until option 7 is chosen.
	public void chooseInstructorAction() {
		Scanner insAction = new Scanner (System.in);
		System.out.println ("Select an option by inputting a number: \n1) Report unavailability\n2) View weekly earnings\n3) Add note\n4) View notes \n5) View notes for director\n6) View Student Information \n7) End session and logout\n");
		String instAction = insAction.nextLine();
		selectedInstructorAction = Integer.parseInt(instAction);
		
		//Since option one asks the instructor to report their unavailability, they are prompted to input when they are unavailable.
		if (selectedInstructorAction == 1) {
			chooseTime();			
			//If an instructor would like to add a note, they are prompted to add the note they want to add to the ArrayList
		} else if (selectedInstructorAction == 3) {
			Scanner note = new Scanner (System.in);
			System.out.println ("Type the note you would like to add");
			String aNote = note.nextLine();
			addedNote = aNote;
			//If an instructor is searching for student information, they are required to input that student's ID
		} else if (selectedInstructorAction == 6) {
			Scanner student = new Scanner (System.in);
			System.out.println ("Insert the ID of the student you are looking for");
			String search = student.nextLine();
			searchingForStudent = Integer.parseInt(search);
		}
	}
}
