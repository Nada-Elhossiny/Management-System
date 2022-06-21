package tutoringCenter;

import java.util.ArrayList;
import java.util.Map;

public class Selection {
	//Data variables
	private boolean canContinue = false;
	private Data data;
	private ArrayList<ArrayList> list;
	private ArrayList<Instructor> instructors;
	private ArrayList<Student> students;
	private Map <Integer, ArrayList<InstructorAvailability>> availablityList;
	private ArrayList<InstructorAvailability> viewList;
	private UserInput userInput;
	
	//Setters and getters for the private variables in order to be accessed in the main method
	public boolean isCanContinue() {
		return canContinue;
	}

	public void setCanContinue(boolean canContinue) {
		this.canContinue = canContinue;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public ArrayList<ArrayList> getList() {
		return list;
	}

	public void setList(ArrayList<ArrayList> list) {
		this.list = list;
	}

	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(ArrayList<Instructor> instructors) {
		this.instructors = instructors;
	}

	public Map<Integer, ArrayList<InstructorAvailability>> getAvailablityList() {
		return availablityList;
	}

	public void setAvailablityList(Map<Integer, ArrayList<InstructorAvailability>> availablityList) {
		this.availablityList = availablityList;
	}

	public ArrayList<InstructorAvailability> getViewList() {
		return viewList;
	}

	public void setViewList(ArrayList<InstructorAvailability> viewList) {
		this.viewList = viewList;
	}

	public UserInput getUserInput() {
		return userInput;
	}

	public void setUserInput(UserInput userInput) {
		this.userInput = userInput;
	}
	
	public UserInput getScheduling() {
		return userInput;
	}

	public void setScheduling(UserInput scheduling) {
		this.userInput = scheduling;
	}

	//Loads the data from the data class and arranges it in collection variables
	public void setup() {
		data = new Data();
		list = data.loadData();
		instructors = list.get(0);
		students = list.get(1);
		availablityList = data.loadAvailability();
		viewList = availablityList.get(instructors.get(0).getID());
		userInput = new UserInput();
	}
	
	//Student selects the instructor that they would like to work with
	public void selecting() {
		//Get student input for userInput class
	userInput.selectInstructor();
	
	//Displays the avaiability in a table
	if (userInput.getPreferredInstructor().equals("Ahmed")) {
		System.out.println("Ahmed's availability...\n");
		ArrayList<InstructorAvailability> viewList1 = getAvailablityList().get(instructors.get(0).getID());
		data.viewAvailability(viewList1);
	}
	else if (userInput.getPreferredInstructor().equals("Saniya")) {
		System.out.println("Saniya's availability...\n");
		ArrayList<InstructorAvailability> viewList2 = getAvailablityList().get(instructors.get(1).getID());
		data.viewAvailability(viewList2);

	}
	else if (userInput.getPreferredInstructor().equals("Ishleen")) {
		System.out.println("Ishleen's availability...\n");
		ArrayList<InstructorAvailability> viewList3 = getAvailablityList().get(instructors.get(2).getID());
		data.viewAvailability(viewList3);

	}
	else if (userInput.getPreferredInstructor().equals("Alyssa")) {
		System.out.println("Alyssa's availability...\n");
		ArrayList<InstructorAvailability> viewList4 = getAvailablityList().get(instructors.get(3).getID());
		data.viewAvailability(viewList4);

	}
	else if (userInput.getPreferredInstructor().equals("Joe")) {
		System.out.println("Joe's availability...\n");
		ArrayList<InstructorAvailability> viewList5 = getAvailablityList().get(instructors.get(4).getID());
		data.viewAvailability(viewList5);
	}
	
		//Asks for user input to conform that they would like to work with that instructor
	userInput.happyWithInstructor();
	if (!userInput.getSelectedInstructor().equals("")) {
		//Allows the student to progress to selecting the day and time (required for progression in the main method)
		canContinue = true;
	}
	else if (userInput.getSelectedInstructor().equals("")) {
		selecting();
	}
}
	
	//Student selects what day and what time they want their session to be
	public void dayAndTime(Student student) {
		//Calls the chooseTime() method in the userInput class 
		userInput.chooseTime();
		for (int i = 0; i < getAvailablityList().size(); i++) {
			Instructor instructor = getInstructors().get(i);
			if (instructor.getName().toLowerCase().equals(userInput.getSelectedInstructor().toLowerCase())) {
				ArrayList<InstructorAvailability> viewList = getAvailablityList().get(instructor.getID());
				boolean found = false;
				for (int j = 0; j < viewList.size(); j++) {
					if (viewList.get(j).getDay().equals(userInput.getSelectedDay()) && viewList.get(j).getTime().equals(userInput.getSelectedTime()) && viewList.get(j).isAvailable() == true) {
						//If the day and time the user inputs are valid and the instructor is available, then the session is scheduled. Availability is set to false, the student ID is added to the instructor availability, and the session is added to both their schedules.
						viewList.get(j).setAvailable(false);
						viewList.get(j).setStudentID(student.getID());
						String displayForStudent = "You have a session with " + instructor.getName() + " on " + userInput.getSelectedDay() + " from " + userInput.getSelectedTime() + ".";
						student.getStudentSchedule().add(displayForStudent);
						String displayForInstructor = "You have a session with " + student.getName() + " on " + userInput.getSelectedDay() + " from " + userInput.getSelectedTime() + ".";
						instructor.getInstructorSchedule().add(displayForInstructor);
						System.out.println("You have successfully scheduled a session with " + instructor.getName() + " on " + userInput.getSelectedDay() + " from " + userInput.getSelectedTime() + ".");
						found = true;
						break;
					}
				} 
				
				//If the instructor is not available during the selected time, the student selects another day and time.
				if (!found) {
					System.out.println("Not available");
					dayAndTime(student);
				} else {
					//once a session is scheduled, the map is removed and re-added, in order to save the changes made during scheduling.
					getAvailablityList().remove(instructor.getID());
					getAvailablityList().put(instructor.getID(), viewList);
				}
			}
		}
	}
	
	//Shows the student their schedule (if applicable) when they first log in. It adds the session in the arrayList that can be displayed in the main method
	public void getStudentSchedule (Map <Integer, ArrayList<InstructorAvailability>> avlMap, ArrayList<Instructor> instructorList, Student student) {
		int StudentID = student.getID();
		ArrayList <String> studentScheduleList = student.getStudentSchedule();
		for (int i = 0; i < avlMap.size(); i++) {
			Instructor instructor = instructorList.get(i);
			ArrayList<InstructorAvailability> viewList = avlMap.get(instructor.getID());
			for (int j = 0; j < viewList.size(); j++) {
				InstructorAvailability instructorAvailability = viewList.get(j);
				if (StudentID == instructorAvailability.getStudentID()) {
					int index = studentScheduleList.size() + 1;
					String displayForStudent = "Session " + index + " is with " + instructor.getName() + " on " + instructorAvailability.getDay() + " at " + instructorAvailability.getTime() + ".";
					studentScheduleList.add(displayForStudent);
				} 
			}
		}
	}

	//If a student chooses to update their existing session, they can either remove or reschedule it. This removes it from both the instructor & student schedules, sets instructor availability to true, and removes the student ID from instructor availability.
	public void updateExistingSession (Student student) {
		ArrayList<Instructor> instructorList = getInstructors();
		userInput.wantToUpdateSchedule();
		if (userInput.getSelectedUpdate().equals("Y")) {
			userInput.updateSession();
			for (int i = 0; i < student.getStudentSchedule().size(); i++) {
				//Find the selected session in the arrayList
				if (userInput.getSelectedSession() == i+1) {
					String name = student.getStudentSchedule().get(i);
					//use the indexOf() method in order to retrieve the instructor name from the studentSchedule() arrayList
					int index1 = name.indexOf("with");
					int index2 = name.indexOf(" on");
					String instructorName = name.substring(index1+5, index2);
					Instructor instructor = null;
					for (Instructor tempInstructor : instructorList) {
						if (tempInstructor.getName().equals(instructorName.trim())) {
							//Save the instructor name once found
							instructor = tempInstructor;
							break;
						}	
					}
					
					ArrayList<InstructorAvailability> viewList = getAvailablityList().get(instructor.getID());
					String day = student.getStudentSchedule().get(i);
					//use the indexOf() method in order to retrieve the session day from the studentSchedule() arrayList
					int in1 = day.indexOf(" on ");
					int in2 = day.indexOf(" at");
					//Save the session day in a variable
					String sessionDay = day.substring(in1+4, in2);
					
					String time = student.getStudentSchedule().get(i);
					//use the indexOf() method in order to retrieve the session time from the studentSchedule() arrayList
					int i1 = time.indexOf("at ");
					int i2 = time.indexOf(".");
					//Save the session time in a variable 
					String sessionTime = day.substring(i1+3, i2);
					
					//If an instructor was found, remove the session from the student schedule (regardless of remove or reschedule options)
					if (instructor != null) {
						student.getStudentSchedule().remove(i);
						
						for (int j = 0; j < viewList.size(); j++) {
							InstructorAvailability instructorAvailability = viewList.get(j);
							//if the time, day, and student matches the requested session, then set instructor availability to true and remove student ID from instructor availability (regardless of remove or reschedule options)
							if ((instructorAvailability.getDay().equals(sessionDay.trim())) && (instructorAvailability.getTime().equals(sessionTime.trim())) && (instructorAvailability.getStudentID() == student.getID())) {
								viewList.get(j).setAvailable(true);
								viewList.get(j).setStudentID(0);
								break;
							}
						}
						//Remove and re-add the map to save the changes made
						getAvailablityList().remove(instructor.getID());
						getAvailablityList().put(instructor.getID(), viewList);
					}

					//if the student chooses to remove the session. They are shown their new schedule. 
					if (userInput.getUpdatingAction().equals("Remove")) {
						System.out.println("Your session has been removed. \nHere is your updated schedule: ");	
						for (String session : student.getStudentSchedule()) {
							System.out.println(session);
						}
						//if the student chooses to reschedule the session. They are promoted to reschedule a replacement session.
					} else if (userInput.getUpdatingAction().equals("Reschedule")) {
						System.out.println("The selected session has been removed, please reschedule your replacement session. ");
					}
				}
			}
		}
	}
		
	//A menu for students allowing them to select what they would like to do next. Repeats until the student ends the session (option 3)
	public void nextAction (Map <Integer, ArrayList<InstructorAvailability>> avlMap, ArrayList<Instructor> instructorList, Student student) {
		userInput.chooseAction();
		//resets to false to ensure that the student only chooses day and time when they have confirmed they are happy with their instrutor.
		canContinue = false;
		//Selects another session, takes them to the selecting() method, then allows them to progress to choosing day and time only if they are happy with their selected instructor
		if (userInput.getSelectedAction() == 1) {
			selecting();
			if (canContinue == true) {
				dayAndTime(student);
				//calls the method again- recursive.
				nextAction(avlMap, instructorList, student);
			}
			//calls the weeklyFees() method in the Student class to display how much the current number of sessions will cost per week.
		} else if (userInput.getSelectedAction() == 2) {
			System.out.println("Your weekly charges for " + student.getStudentSchedule().size() + " hour(s) per week is $" + student.weeklyFees() + ".");
			nextAction(avlMap, instructorList, student);
			//Prints the final schedule and logs the student out.
		} else if (userInput.getSelectedAction() == 3) {
			System.out.println("Here is your final schedule:\n");
			for (String session : student.getStudentSchedule()) {
				System.out.println(session);
			}
		} else {
			System.out.println("Invalid input");
			nextAction(avlMap, instructorList, student);
		}
	}
	
	//Displays the instructor's schedule when they initially log in.
	public void getInstructorSchedule (Map <Integer, ArrayList<InstructorAvailability>> avlMap, ArrayList<Student> studentList, Instructor instructor) {
		int instructorID = instructor.getID();
		ArrayList <String> instructorScheduleList = instructor.getInstructorSchedule();
		for (int i = 0; i < avlMap.size(); i++) {
			Student student = studentList.get(i);
			ArrayList<InstructorAvailability> viewInstList = avlMap.get(instructor.getID());
			for (int j = 0; j < viewInstList.size(); j++) {
				InstructorAvailability instructorAvailability = viewInstList.get(j);
				//enters if a studentID is found in the InstructorAvailability class and the instructor ID is consistent with the inputted ID.
				if ((instructorID == instructorAvailability.getId()) && (instructorAvailability.getStudentID() ==  student.getID())) {
					int index = instructorScheduleList.size() + 1;
					//Adds the session to the instructorSchedule arrayList that is traversed in the main method once an instructor inputs their valid ID. 
					String displayForInstructors = "Session " + index + " is with " + student.getName() + " on " + instructorAvailability.getDay() + " from " + instructorAvailability.getTime() + ".";
					instructorScheduleList.add(displayForInstructors);
				} 
			}
		}
	}
	
	//A menu for instructors allowing them to select what they would like to do next. Repeats until the instructor ends the session (option 7)
	public void getInstructorNextAction (Map <Integer, ArrayList<InstructorAvailability>> avlMap, Instructor instructor, ArrayList<Student> studentList) {
		userInput.chooseInstructorAction();
		//Report their unavailability
		if (userInput.getSelectedInstructorAction() == 1) {
			ArrayList<InstructorAvailability> viewList = getAvailablityList().get(instructor.getID());
			for (int i = 0; i < viewList.size(); i++) {
				//if the time and day they input is valid, then the availability is set to false
				if (viewList.get(i).getDay().equals(userInput.getSelectedDay()) && viewList.get(i).getTime().equals(userInput.getSelectedTime())) {
					viewList.get(i).setAvailable(false);
					//if a student was scheduled at that time. A note is saved for them to send to the director, telling the director to reschedule that session.
					if (viewList.get(i).getStudentID() != 0) {
						instructor.getNotesForDirector().add("A session for the student with the ID " + viewList.get(i).getStudentID() + " needs to be rescheduled.");
						//set the studentID to 0 
						viewList.get(i).setStudentID(0);
						for (int j = 0; j < instructor.getInstructorSchedule().size(); j++) {
							if (instructor.getInstructorSchedule().get(j).contains(userInput.getSelectedDay()) && instructor.getInstructorSchedule().get(j).contains(userInput.getSelectedTime())) {
								//remove the correct session from the instructorSchedule arrayList.
							instructor.getInstructorSchedule().remove(j);
						}
					}
				}
			}
		}
			//remove and re-add viewList to save the changes.
				getAvailablityList().remove(instructor.getID());
				getAvailablityList().put(instructor.getID(), viewList);
				//recursive method
			getInstructorNextAction (avlMap, instructor, studentList);
		} else if (userInput.getSelectedInstructorAction() == 2) {
			//calls the weekly earnings method in the Instructor class to show how much they make in the hours they work that week.
			System.out.println("Your weekly earnings for " + instructor.getInstructorSchedule().size() + " hour(s) per week is $" + instructor.earningsPerWeek() + ".");
			getInstructorNextAction (avlMap, instructor, studentList);
			//adds a note to the notes ArrayList
		} else if (userInput.getSelectedInstructorAction() == 3) {
			instructor.getNotes().add(userInput.getAddedNote());
			getInstructorNextAction (avlMap, instructor, studentList);
			//views the notes in the notes ArrayList
		} else if (userInput.getSelectedInstructorAction() == 4) {
			for (String notes : instructor.getNotes()) {
				System.out.println(notes);
			}
			//recursive method
			getInstructorNextAction (avlMap, instructor, studentList);
			//view notes for director about unavailability
		} else if (userInput.getSelectedInstructorAction() == 5) {

			for (String notes : instructor.getNotesForDirector()) {
				System.out.println(notes);
			}
			getInstructorNextAction (avlMap, instructor, studentList);
			//retrieve student info once a valid studentID is inputted
		} else if (userInput.getSelectedInstructorAction() == 6) {
			for (int i = 0; i < studentList.size(); i++) {
				if (userInput.getSearchingForStudent() == studentList.get(i).getID()) {
					System.out.println("Student Name: " + studentList.get(i).getName());
					System.out.println("Grade Level: " + studentList.get(i).getGradeLevel());
					System.out.println("Parent Name: " + studentList.get(i).getParentName());
					System.out.println("Parent Email: " + studentList.get(i).getContactEmail());
					System.out.println("Parent Phone: " + studentList.get(i).getContactPhone());
				}
			}
			getInstructorNextAction (avlMap, instructor, studentList);
			//end the session and logout
		} else if (userInput.getSelectedInstructorAction() == 7) {
			System.out.println("Here is your final schedule:\n");
			for (String session : instructor.getInstructorSchedule()) {
				System.out.println(session);
			}
			//allow them to enter a different input if the initial one is invalid.
		} else {
			System.out.println("Invalid Input");
			getInstructorNextAction (avlMap, instructor, studentList);
		}
	}	
}