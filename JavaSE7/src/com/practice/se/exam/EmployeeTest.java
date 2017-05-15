package com.practice.se.exam;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object called emp and assign values to it and display the values
		Employee emp = new Employee();
		
		//assign values
		emp.setEmpId(101);
		emp.setEmpName("Jane Smith");
		emp.setEmpSON("012-34-4567");
		emp.setEmpSalary(120345.27);
		
		//display the values for the employee instance
		System.out.println("Employee ID: "+ emp.getEmpId());
		System.out.println("Employee Name: "+ emp.getEmpName());
		System.out.println("Employee Soc Sec #: "+ emp.getEmpSON());
		System.out.println("Employee Salary: "+ emp.getEmpSalary());
		
		
		

	}

}
