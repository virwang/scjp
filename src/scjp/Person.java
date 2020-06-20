package scjp;

public class Person {

	String name = "No Name";

	public Person(String nm) {
		name = nm;
	}
}

class Employee extends Person{
	String empID = "0000";
	
	public Employee(String id) {
		empID = id;
	}
}

class EmployeeTest{
	public static void main(String args[]) {
		Employee employee = new Employee("4321");
		System.out.println(employee.empID);
	}
}