package tutoringCenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//This class is used to imitate what a database would be like. It creates all the objects that are needed for the program to run
public class Data {
	
	//Make the staff
	Instructor Ahmed = new Instructor (0001, "Ahmed", "Ahmed.instructor@gmail.com", "647-892-4835", 14.0);
	Instructor Saniya = new Instructor (0002, "Saniya", "Saniya.instructor@gmail.com", "647-918-3424", 15.5);
	Instructor Ishleen = new Instructor (0003, "Ishleen", "Ishleen.instructor@gmail.com", "647-267-0987", 15.0);
	Instructor Alyssa = new Instructor (0004, "Alyssa", "Alyssa.instructor@gmail.com", "416-485-3920", 14.5);
	Instructor Joe = new Instructor (0005, "Joe", "Joe.instructor@gmail.com", "416-825-3825", 15.0); 
	
	//Make the students
	Student Alex = new Student (1111, "Alex", "Sandra.parent@gmail.com", "916-134-8632", "Sandra", 4, 2);
	Student Shayla = new Student (1112, "Shayla", "Kenzie.parent@gmai.com", "647-231-4913", "Kenzie", 7, 30.0);
	Student Natasha = new Student (1113, "Natasha", "Michael.parent@gmail.com", "647-427-9135", "Michael", 2, 25.0);
	Student Nick = new Student (1114, "Nick", "Trisha.parent@gmail.com", "416-135-7534", "Trisha", 11, 35.0);
	Student Isabella = new Student (1115, "Isabella", "Susan.parent@gmail.com", "647-037-4255", "Susan", 5);
	Student Milan = new Student (1116, "Milan", "George.parent@gmail.com", "647-314-8932", "George", 3);
	Student Diya = new Student (1117, "Diya", "Laura.parent@gmail.com", "647-932-5486", "Laura", 6);
	Student Jiya = new Student (1118, "Jiya", "Laura.parent@gmail.com", "647-932-5486", "Laura", 6);
	Student Joshua = new Student (1119, "Joshua", "Nuha.parent@gmail.com", "416-482-5402", "Nuha", 2, 25.0);
	Student Murtaza = new Student (1120, "Murtaza", "Mariam.parent@gmail.com", "647-254-0978", "Mariam", 1, 25.0);
	Student Lauren = new Student (1121, "Lauren", "Angie.parent@gmail.com", "416-533-2574", "Angie", 7);
	Student Jasleen = new Student (1122, "Jasleen", "Marwa.parent@gmail.com", "647-871,1753", "Marwa", 5);
	Student Raveena = new Student (1123, "Raveena", "Marwa.parent@gmail.com", "647-871,1753", "Marwa", 2, 25.0);
	Student Angelica = new Student (1124, "Angelica", "Marwa.parent@gmail.com", "647-871,1753", "Marwa", 9, 25.0);
	Student Jayden = new Student (1125, "Jayden", "Savannah.parent@gmail.com", "647-713-7536", "Savannah", 6);
	Student Sam = new Student (1126, "Sam", "Bethany.parent@gmail.com", "647-813-2853", "Bethany", 3);
	Student Javeria = new Student (1127, "Javeria", "Sara.parent@gmail.com", "416-714-1456", "Javeria", 6);
	Student Kaylie = new Student (1128, "Kaylie", "Katherine.parent@gmail.com", "647-624-1624", "Katherine", 10, 35.0);
	Student Youssef = new Student (1129, "Youssef", "Kareem.parent@gmail.com", "416-526-3245", "Kareem", 12, 35.0);
	Student Leila = new Student (1130, "Leila", "Rebecca.parent@gmail.com", "416-914-1346", "Rebecca", 4);
	Student Moustafa = new Student (1131, "Moustafa", "Maira.parent@gmail.com", "647-831-1453", "Maira", 12, 35.0);
	Student Sidra = new Student (1132, "Sidra", "Hafsa.parent@gmail.com", "416-3914-1463", "Sidra", 3);
	Student Ryan = new Student (1133, "Ryan", "Jamila.parent@gmail.com", "647-139-1452", "Jamila", 7);
	Student Eric = new Student (1134, "Eric", "Jamila.parent@gmail.com", "647-139-1452", "Jamila", 8);
	
	//Fill in the instructor availability
	InstructorAvailability ahmedAvailability1 = new InstructorAvailability (Ahmed.getID(), "Mon", "3-4pm", true);
	InstructorAvailability ahmedAvailability2 = new InstructorAvailability (Ahmed.getID(), "Mon", "4-5pm", true);
	InstructorAvailability ahmedAvailability3 = new InstructorAvailability (Ahmed.getID(), "Mon", "5-6pm", true);
	InstructorAvailability ahmedAvailability4 = new InstructorAvailability (Ahmed.getID(), "Mon", "6-7pm", true);
	InstructorAvailability ahmedAvailability5 = new InstructorAvailability (Ahmed.getID(), "Tues", "3-4pm", false);
	InstructorAvailability ahmedAvailability6 = new InstructorAvailability (Ahmed.getID(), "Tues", "4-5pm", false);
	InstructorAvailability ahmedAvailability7 = new InstructorAvailability (Ahmed.getID(), "Tues", "5-6pm", true);
	InstructorAvailability ahmedAvailability8 = new InstructorAvailability (Ahmed.getID(), "Tues", "6-7pm", true);
	InstructorAvailability ahmedAvailability9 = new InstructorAvailability (Ahmed.getID(), "Wed", "3-4pm", true);
	InstructorAvailability ahmedAvailability10 = new InstructorAvailability (Ahmed.getID(), "Wed", "4-5pm", true);
	InstructorAvailability ahmedAvailability11 = new InstructorAvailability (Ahmed.getID(), "Wed", "5-6pm", false);
	InstructorAvailability ahmedAvailability12 = new InstructorAvailability (Ahmed.getID(), "Wed", "6-7pm", true);
	InstructorAvailability ahmedAvailability13 = new InstructorAvailability (Ahmed.getID(), "Thurs", "3-4pm", false);
	InstructorAvailability ahmedAvailability14 = new InstructorAvailability (Ahmed.getID(), "Thurs", "4-5pm", false);
	InstructorAvailability ahmedAvailability15 = new InstructorAvailability (Ahmed.getID(), "Thurs", "5-6pm", true);
	InstructorAvailability ahmedAvailability16 = new InstructorAvailability (Ahmed.getID(), "Thurs", "6-7pm", true);
	InstructorAvailability ahmedAvailability17 = new InstructorAvailability (Ahmed.getID(), "Fri", "3-4pm", false);
	InstructorAvailability ahmedAvailability18 = new InstructorAvailability (Ahmed.getID(), "Fri", "4-5pm", true);
	InstructorAvailability ahmedAvailability19 = new InstructorAvailability (Ahmed.getID(), "Fri", "5-6pm", true);
	InstructorAvailability ahmedAvailability20 = new InstructorAvailability (Ahmed.getID(), "Fri", "6-7pm", true);
	
	InstructorAvailability saniyaAvailability1 = new InstructorAvailability (Saniya.getID(), "Mon", "3-4pm", false);
	InstructorAvailability saniyaAvailability2 = new InstructorAvailability (Saniya.getID(), "Mon", "4-5pm", false);
	InstructorAvailability saniyaAvailability3 = new InstructorAvailability (Saniya.getID(), "Mon", "5-6pm", false);
	InstructorAvailability saniyaAvailability4 = new InstructorAvailability (Saniya.getID(), "Mon", "6-7pm", false);
	InstructorAvailability saniyaAvailability5 = new InstructorAvailability (Saniya.getID(), "Tues", "3-4pm", true);
	InstructorAvailability saniyaAvailability6 = new InstructorAvailability (Saniya.getID(), "Tues", "4-5pm", true);
	InstructorAvailability saniyaAvailability7 = new InstructorAvailability (Saniya.getID(), "Tues", "5-6pm", true);
	InstructorAvailability saniyaAvailability8 = new InstructorAvailability (Saniya.getID(), "Tues", "6-7pm", true);
	InstructorAvailability saniyaAvailability9 = new InstructorAvailability (Saniya.getID(), "Wed", "3-4pm", false, 1112);
	InstructorAvailability saniyaAvailability10 = new InstructorAvailability (Saniya.getID(), "Wed", "4-5pm", false);
	InstructorAvailability saniyaAvailability11 = new InstructorAvailability (Saniya.getID(), "Wed", "5-6pm", false);
	InstructorAvailability saniyaAvailability12 = new InstructorAvailability (Saniya.getID(), "Wed", "6-7pm", false);
	InstructorAvailability saniyaAvailability13 = new InstructorAvailability (Saniya.getID(), "Thurs", "3-4pm", true);
	InstructorAvailability saniyaAvailability14 = new InstructorAvailability (Saniya.getID(), "Thurs", "4-5pm", true);
	InstructorAvailability saniyaAvailability15 = new InstructorAvailability (Saniya.getID(), "Thurs", "5-6pm", true);
	InstructorAvailability saniyaAvailability16 = new InstructorAvailability (Saniya.getID(), "Thurs", "6-7pm", true);
	InstructorAvailability saniyaAvailability17 = new InstructorAvailability (Saniya.getID(), "Fri", "3-4pm", true);
	InstructorAvailability saniyaAvailability18 = new InstructorAvailability (Saniya.getID(), "Fri", "4-5pm", true);
	InstructorAvailability saniyaAvailability19 = new InstructorAvailability (Saniya.getID(), "Fri", "5-6pm", true);
	InstructorAvailability saniyaAvailability20 = new InstructorAvailability (Saniya.getID(), "Fri", "6-7pm", true);

	InstructorAvailability ishleenAvailability1 = new InstructorAvailability (Ishleen.getID(), "Mon", "3-4pm", true);
	InstructorAvailability ishleenAvailability2 = new InstructorAvailability (Ishleen.getID(), "Mon", "4-5pm", true);
	InstructorAvailability ishleenAvailability3 = new InstructorAvailability (Ishleen.getID(), "Mon", "5-6pm", true);
	InstructorAvailability ishleenAvailability4 = new InstructorAvailability (Ishleen.getID(), "Mon", "6-7pm", true);
	InstructorAvailability ishleenAvailability5 = new InstructorAvailability (Ishleen.getID(), "Tues", "3-4pm", false, 1114);
	InstructorAvailability ishleenAvailability6 = new InstructorAvailability (Ishleen.getID(), "Tues", "4-5pm", true);
	InstructorAvailability ishleenAvailability7 = new InstructorAvailability (Ishleen.getID(), "Tues", "5-6pm", true);
	InstructorAvailability ishleenAvailability8 = new InstructorAvailability (Ishleen.getID(), "Tues", "6-7pm", false);
	InstructorAvailability ishleenAvailability9 = new InstructorAvailability (Ishleen.getID(), "Wed", "3-4pm", true);
	InstructorAvailability ishleenAvailability10 = new InstructorAvailability (Ishleen.getID(), "Wed", "4-5pm", true);
	InstructorAvailability ishleenAvailability11 = new InstructorAvailability (Ishleen.getID(), "Wed", "5-6pm", true);
	InstructorAvailability ishleenAvailability12 = new InstructorAvailability (Ishleen.getID(), "Wed", "6-7pm", true);
	InstructorAvailability ishleenAvailability13 = new InstructorAvailability (Ishleen.getID(), "Thurs", "3-4pm", false);
	InstructorAvailability ishleenAvailability14 = new InstructorAvailability (Ishleen.getID(), "Thurs", "4-5pm", true);
	InstructorAvailability ishleenAvailability15 = new InstructorAvailability (Ishleen.getID(), "Thurs", "5-6pm", true);
	InstructorAvailability ishleenAvailability16 = new InstructorAvailability (Ishleen.getID(), "Thurs", "6-7pm", false);
	InstructorAvailability ishleenAvailability17 = new InstructorAvailability (Ishleen.getID(), "Fri", "3-4pm", false, 1112);
	InstructorAvailability ishleenAvailability18 = new InstructorAvailability (Ishleen.getID(), "Fri", "4-5pm", false);
	InstructorAvailability ishleenAvailability19 = new InstructorAvailability (Ishleen.getID(), "Fri", "5-6pm", false);
	InstructorAvailability ishleenAvailability20 = new InstructorAvailability (Ishleen.getID(), "Fri", "6-7pm", false);
	
	InstructorAvailability alyssaAvailability1 = new InstructorAvailability (Alyssa.getID(), "Mon", "3-4pm", true);
	InstructorAvailability alyssaAvailability2 = new InstructorAvailability (Alyssa.getID(), "Mon", "4-5pm", true);
	InstructorAvailability alyssaAvailability3 = new InstructorAvailability (Alyssa.getID(), "Mon", "5-6pm", false);
	InstructorAvailability alyssaAvailability4 = new InstructorAvailability (Alyssa.getID(), "Mon", "6-7pm", false);
	InstructorAvailability alyssaAvailability5 = new InstructorAvailability (Alyssa.getID(), "Tues", "3-4pm", false);
	InstructorAvailability alyssaAvailability6 = new InstructorAvailability (Alyssa.getID(), "Tues", "4-5pm", false);
	InstructorAvailability alyssaAvailability7 = new InstructorAvailability (Alyssa.getID(), "Tues", "5-6pm", true);
	InstructorAvailability alyssaAvailability8 = new InstructorAvailability (Alyssa.getID(), "Tues", "6-7pm", true);
	InstructorAvailability alyssaAvailability9 = new InstructorAvailability (Alyssa.getID(), "Wed", "3-4pm", true);
	InstructorAvailability alyssaAvailability10 = new InstructorAvailability (Alyssa.getID(), "Wed", "4-5pm", true);
	InstructorAvailability alyssaAvailability11 = new InstructorAvailability (Alyssa.getID(), "Wed", "5-6pm", false, 1115);
	InstructorAvailability alyssaAvailability12 = new InstructorAvailability (Alyssa.getID(), "Wed", "6-7pm", false);
	InstructorAvailability alyssaAvailability13 = new InstructorAvailability (Alyssa.getID(), "Thurs", "3-4pm", true);
	InstructorAvailability alyssaAvailability14 = new InstructorAvailability (Alyssa.getID(), "Thurs", "4-5pm", true);
	InstructorAvailability alyssaAvailability15 = new InstructorAvailability (Alyssa.getID(), "Thurs", "5-6pm", true);
	InstructorAvailability alyssaAvailability16 = new InstructorAvailability (Alyssa.getID(), "Thurs", "6-7pm", true);
	InstructorAvailability alyssaAvailability17 = new InstructorAvailability (Alyssa.getID(), "Fri", "3-4pm", true);
	InstructorAvailability alyssaAvailability18 = new InstructorAvailability (Alyssa.getID(), "Fri", "4-5pm", true);
	InstructorAvailability alyssaAvailability19 = new InstructorAvailability (Alyssa.getID(), "Fri", "5-6pm", true);
	InstructorAvailability alyssaAvailability20 = new InstructorAvailability (Alyssa.getID(), "Fri", "6-7pm", true);
	
	InstructorAvailability joeAvailability1 = new InstructorAvailability (Joe.getID(), "Mon", "3-4pm", false);
	InstructorAvailability joeAvailability2 = new InstructorAvailability (Joe.getID(), "Mon", "4-5pm", false);
	InstructorAvailability joeAvailability3 = new InstructorAvailability (Joe.getID(), "Mon", "5-6pm", false);
	InstructorAvailability joeAvailability4 = new InstructorAvailability (Joe.getID(), "Mon", "6-7pm", false);
	InstructorAvailability joeAvailability5 = new InstructorAvailability (Joe.getID(), "Tues", "3-4pm", true);
	InstructorAvailability joeAvailability6 = new InstructorAvailability (Joe.getID(), "Tues", "4-5pm", true);
	InstructorAvailability joeAvailability7 = new InstructorAvailability (Joe.getID(), "Tues", "5-6pm", true);
	InstructorAvailability joeAvailability8 = new InstructorAvailability (Joe.getID(), "Tues", "6-7pm", true);
	InstructorAvailability joeAvailability9 = new InstructorAvailability (Joe.getID(), "Wed", "3-4pm", true);
	InstructorAvailability joeAvailability10 = new InstructorAvailability (Joe.getID(), "Wed", "4-5pm", true);
	InstructorAvailability joeAvailability11 = new InstructorAvailability (Joe.getID(), "Wed", "5-6pm", true);
	InstructorAvailability joeAvailability12 = new InstructorAvailability (Joe.getID(), "Wed", "6-7pm", true);
	InstructorAvailability joeAvailability13 = new InstructorAvailability (Joe.getID(), "Thurs", "3-4pm", true);
	InstructorAvailability joeAvailability14 = new InstructorAvailability (Joe.getID(), "Thurs", "4-5pm", true);
	InstructorAvailability joeAvailability15 = new InstructorAvailability (Joe.getID(), "Thurs", "5-6pm", true);
	InstructorAvailability joeAvailability16 = new InstructorAvailability (Joe.getID(), "Thurs", "6-7pm", true);
	InstructorAvailability joeAvailability17 = new InstructorAvailability (Joe.getID(), "Fri", "3-4pm", false);
	InstructorAvailability joeAvailability18 = new InstructorAvailability (Joe.getID(), "Fri", "4-5pm", false);
	InstructorAvailability joeAvailability19 = new InstructorAvailability (Joe.getID(), "Fri", "5-6pm", false);
	InstructorAvailability joeAvailability20 = new InstructorAvailability (Joe.getID(), "Fri", "6-7pm", false);

	public ArrayList<ArrayList> loadData() {
		//Add instructors in an arrayList
		ArrayList<Instructor> instructors = new ArrayList<Instructor>();
		instructors.add(Ahmed);
		instructors.add(Saniya);
		instructors.add(Ishleen);
		instructors.add(Alyssa);
		instructors.add(Joe);
		
		//Add students in an arrayList
		ArrayList <Student> students = new ArrayList <Student>();
		students.add(Alex);
		students.add(Shayla);
		students.add(Natasha);
		students.add(Nick);
		students.add(Isabella);
		students.add(Milan);
		students.add(Diya);
		students.add(Jiya);
		students.add(Joshua);
		students.add(Murtaza);
		students.add(Lauren);
		students.add(Jasleen);
		students.add(Raveena);
		students.add(Angelica);
		students.add(Jayden);
		students.add(Sam);
		students.add(Javeria);
		students.add(Kaylie);
		students.add(Youssef);
		students.add(Leila);
		students.add(Moustafa);
		students.add(Sidra);
		students.add(Ryan);
		students.add(Eric);
		
		//Add instructors and students in an arrayList together that makes it easy to access in another class by returning the list
		ArrayList<ArrayList> list = new ArrayList<ArrayList>();
		list.add(instructors);
		list.add(students);
		return list;
	}

	//Creating a map to store all the availability for each instructor. We can later use this data to display availability and allow for scheduling.
	public Map <Integer, ArrayList<InstructorAvailability>> loadAvailability() {
		
		Map <Integer, ArrayList<InstructorAvailability>> availabilityMap = new HashMap <Integer, ArrayList<InstructorAvailability>>();

		//Add first instructor's availability to an array
		ArrayList<InstructorAvailability> ahmedAvailability = new ArrayList<InstructorAvailability>();
		ahmedAvailability.add(ahmedAvailability1);
		ahmedAvailability.add(ahmedAvailability2);
		ahmedAvailability.add(ahmedAvailability3);
		ahmedAvailability.add(ahmedAvailability4);
		ahmedAvailability.add(ahmedAvailability5);
		ahmedAvailability.add(ahmedAvailability6);
		ahmedAvailability.add(ahmedAvailability7);
		ahmedAvailability.add(ahmedAvailability8);
		ahmedAvailability.add(ahmedAvailability9);
		ahmedAvailability.add(ahmedAvailability10);
		ahmedAvailability.add(ahmedAvailability11);
		ahmedAvailability.add(ahmedAvailability12);
		ahmedAvailability.add(ahmedAvailability13);
		ahmedAvailability.add(ahmedAvailability14);
		ahmedAvailability.add(ahmedAvailability15);
		ahmedAvailability.add(ahmedAvailability16);
		ahmedAvailability.add(ahmedAvailability17);
		ahmedAvailability.add(ahmedAvailability18);
		ahmedAvailability.add(ahmedAvailability19);
		ahmedAvailability.add(ahmedAvailability20);
		//Add the instructor's availability array to the map that will later be used to retrieve availability.
		availabilityMap.put(Ahmed.getID(), ahmedAvailability);

		//Add second instructor's availability to an array
		ArrayList<InstructorAvailability> saniyaAvailability = new ArrayList<InstructorAvailability>();
		saniyaAvailability.add(saniyaAvailability1);
		saniyaAvailability.add(saniyaAvailability2);
		saniyaAvailability.add(saniyaAvailability3);
		saniyaAvailability.add(saniyaAvailability4);
		saniyaAvailability.add(saniyaAvailability5);
		saniyaAvailability.add(saniyaAvailability6);
		saniyaAvailability.add(saniyaAvailability7);
		saniyaAvailability.add(saniyaAvailability8);
		saniyaAvailability.add(saniyaAvailability9);
		saniyaAvailability.add(saniyaAvailability10);
		saniyaAvailability.add(saniyaAvailability11);
		saniyaAvailability.add(saniyaAvailability12);
		saniyaAvailability.add(saniyaAvailability13);
		saniyaAvailability.add(saniyaAvailability14);
		saniyaAvailability.add(saniyaAvailability15);
		saniyaAvailability.add(saniyaAvailability16);
		saniyaAvailability.add(saniyaAvailability17);
		saniyaAvailability.add(saniyaAvailability18);
		saniyaAvailability.add(saniyaAvailability19);
		saniyaAvailability.add(saniyaAvailability20);
		//Add the instructor's availability array to the map that will later be used to retrieve availability.
		availabilityMap.put(Saniya.getID(), saniyaAvailability);

		//Add third instructor's availability to an array
		ArrayList<InstructorAvailability> ishleenAvailability = new ArrayList<InstructorAvailability>();
		ishleenAvailability.add(ishleenAvailability1);
		ishleenAvailability.add(ishleenAvailability2);
		ishleenAvailability.add(ishleenAvailability3);
		ishleenAvailability.add(ishleenAvailability4);
		ishleenAvailability.add(ishleenAvailability5);
		ishleenAvailability.add(ishleenAvailability6);
		ishleenAvailability.add(ishleenAvailability7);
		ishleenAvailability.add(ishleenAvailability8);
		ishleenAvailability.add(ishleenAvailability9);
		ishleenAvailability.add(ishleenAvailability10);
		ishleenAvailability.add(ishleenAvailability11);
		ishleenAvailability.add(ishleenAvailability12);
		ishleenAvailability.add(ishleenAvailability13);
		ishleenAvailability.add(ishleenAvailability14);
		ishleenAvailability.add(ishleenAvailability15);
		ishleenAvailability.add(ishleenAvailability16);
		ishleenAvailability.add(ishleenAvailability17);
		ishleenAvailability.add(ishleenAvailability18);
		ishleenAvailability.add(ishleenAvailability19);
		ishleenAvailability.add(ishleenAvailability20);
		//Add the instructor's availability array to the map that will later be used to retrieve availability.
		availabilityMap.put(Ishleen.getID(), ishleenAvailability);

		//Add fourth instructor's availability to an array
		ArrayList<InstructorAvailability> alyssaAvailability = new ArrayList<InstructorAvailability>();
		alyssaAvailability.add(alyssaAvailability1);
		alyssaAvailability.add(alyssaAvailability2);
		alyssaAvailability.add(alyssaAvailability3);
		alyssaAvailability.add(alyssaAvailability4);
		alyssaAvailability.add(alyssaAvailability5);
		alyssaAvailability.add(alyssaAvailability6);
		alyssaAvailability.add(alyssaAvailability7);
		alyssaAvailability.add(alyssaAvailability8);
		alyssaAvailability.add(alyssaAvailability9);
		alyssaAvailability.add(alyssaAvailability10);
		alyssaAvailability.add(alyssaAvailability11);
		alyssaAvailability.add(alyssaAvailability12);
		alyssaAvailability.add(alyssaAvailability13);
		alyssaAvailability.add(alyssaAvailability14);
		alyssaAvailability.add(alyssaAvailability15);
		alyssaAvailability.add(alyssaAvailability16);
		alyssaAvailability.add(alyssaAvailability17);
		alyssaAvailability.add(alyssaAvailability18);
		alyssaAvailability.add(alyssaAvailability19);
		alyssaAvailability.add(alyssaAvailability20);
		//Add the instructor's availability array to the map that will later be used to retrieve availability.
		availabilityMap.put(Alyssa.getID(), alyssaAvailability);

		//Add fifth instructor's availability to an array
		ArrayList<InstructorAvailability> joeAvailability = new ArrayList<InstructorAvailability>();
		joeAvailability.add(joeAvailability1);
		joeAvailability.add(joeAvailability2);
		joeAvailability.add(joeAvailability3);
		joeAvailability.add(joeAvailability4);
		joeAvailability.add(joeAvailability5);
		joeAvailability.add(joeAvailability6);
		joeAvailability.add(joeAvailability7);
		joeAvailability.add(joeAvailability8);
		joeAvailability.add(joeAvailability9);
		joeAvailability.add(joeAvailability10);
		joeAvailability.add(joeAvailability11);
		joeAvailability.add(joeAvailability12);
		joeAvailability.add(joeAvailability13);
		joeAvailability.add(joeAvailability14);
		joeAvailability.add(joeAvailability15);
		joeAvailability.add(joeAvailability16);
		joeAvailability.add(joeAvailability17);
		joeAvailability.add(joeAvailability18);
		joeAvailability.add(joeAvailability19);
		joeAvailability.add(joeAvailability20);
		//Add the instructor's availability array to the map that will later be used to retrieve availability.
		availabilityMap.put(Joe.getID(), joeAvailability);

		return availabilityMap;
	}
	
	//This method prints out the availability of the selected instructor in an organized table that is user friendly.
	public void viewAvailability(ArrayList <InstructorAvailability> instructorAv) {
		
		System.out.println("Day\tTime\tAvailable?\n" );
		for (int i = 0; i < instructorAv.size(); i++) {			
			System.out.println(instructorAv.get(i).getDay() +"\t" + instructorAv.get(i).getTime() + "\t" + instructorAv.get(i).isAvailable());
    		if (i != 0 && (i+1)%4 == 0) {
    			System.out.println(" ");
    		}
		}
	}
}