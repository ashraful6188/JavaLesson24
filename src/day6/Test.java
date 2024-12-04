package day6;

public class Test {

	public static void main(String[] argd) {
		// Create an Object of student class
		// and save it under a reference variable
		Student student1 = new Student();
		student1.sid = 1001;
		student1.name = "David";
		student1.grade = 'A';
		student1.prinStudentData();
		String s = new String("Welcome");
		s.length();
		s.replace("w", "X");
         // test employee class
		Employee emp1 = new Employee();

		emp1.eid= 7007;
		emp1.name = "Smith";
		emp1.department = "Finance";
		emp1.salary = 130000;

		emp1.display();

//	new Employee().name ="Srvani";
//	new Employee().eid =8000;
//	new Employee().department ="Quality";
//	new Employee().salary = 125000;
//	new Employee().display();

	}

}
