package org.emp;

import java.util.*;

public class Employee {

	private void empId() {
		// TODO Auto-generated method stub
    System.out.println("vasu8890");
    
	}
	private void empName() {
		// TODO Auto-generated method stub
    System.out.println("Vasumathi");
	}
	
	private void empDob() {
		// TODO Auto-generated method stub
    System.out.println("08/10/90");
	}
	private void empPhone() {
		// TODO Auto-generated method stub
    System.out.println("8144");
	}
	private void empMail() {
		// TODO Auto-generated method stub
     System.out.println("vas@gmail.com");
	}
	private void empAddress() {
		// TODO Auto-generated method stub
    System.out.println("Madambakkam,chennai");
	}
	public static void main(String[] args) {
		Employee n=new Employee();
		n.empId();
		n.empName();
	    n.empDob();
	    n.empPhone();
	    n.empMail();
	    n.empAddress();
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("empid");
	int id=s.nextInt();
	s.nextLine();
	
	System.out.println("empName");
	String empName=s.next();
	
	System.out.println("empEmail");
	char email=s.next().charAt(7);
	
	System.out.println("empPhone");
	long empPh=s.nextLong();
	
	System.out.println("empSalary");
	double empSal=s.nextDouble();
	
	System.out.println("empGender");
	String gen=s.next();
	
	System.out.println("empcity");
	String empCity=s.next();
	
	System.out.println("Employee Details");
	
	System.out.println("=================");
	System.out.println("Empid"+id);
	System.out.println("EmpName"+empName);
	System.out.println("Empmail"+email);
	System.out.println("Empphone"+empPh);
	System.out.println("Empsalary"+empSal);
	System.out.println("Empgender"+gen);
	System.out.println("Empcity"+empCity);
	
	}
	
	
	
	
	
	
	
	
}
