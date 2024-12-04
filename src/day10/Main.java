package day10;

public class Main {

	public static void main(String[] args) {
		Group group = new Group(1001);
		group.addEmployee(new Employee(101, "Abraham"));
		group.addEmployee(new Employee(102, "Jonathon"));
		group.addEmployee(new Employee(103, "Samantha"));
		group.addEmployee(new Employee(104, "Inleayn"));
		group.addEmployee(new Employee(105, "Tony"));
		
		System.out.println("Before sorting"+ group);
		group.sortEmloyeesBtName();
		System.out.println("After sorting"+ group);
	}

}
