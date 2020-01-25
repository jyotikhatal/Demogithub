package com.csi.oops;

class Department{
	String dName;
	public Department() {
		System.out.println("******Constructor*****");
	}
	public Department(String dName)
	{
	System.out.println("\n Product Name : " +dName);
	}
}
class Employee extends Department
{
	String eName;
	public Employee(String dName, String eName) {
		super(dName);
		System.out.println("Employee Name : " + eName);
		
		
		
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		Department d1 = new Department();
		//Department d2 = new Department(123, "HR");*/
		Employee e1 = new Employee("HR", "JYOTI");
		

	}

}
