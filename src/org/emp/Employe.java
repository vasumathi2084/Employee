package org.emp;

public class Employe {

	private void empId1() {
		System.out.println("2345");

	}

	private void empId1(int a) {
		System.out.println("2345");

	}
	

	private void empId1(String a) {
		System.out.println("2345");
	}
	

	private void empId1(double b) {
		System.out.println("2345");

	}
	
	public static void main(String[] args) {
		
		Employe e=new Employe();
		e.empId1();
		e.empId1(0);
		e.empId1(null);
		e.empId1(0);
	}
}
