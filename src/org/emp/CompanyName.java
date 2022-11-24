package org.emp;

public class CompanyName {

	private void compName() {
		
		System.out.println("Greens");
		
	}
	
	private void compName(int a,String b) {
		System.out.println("Greens");

	}
	
    private void compName(double c,int d) {
    	System.out.println("Greens");
    }
	
	private void compName(boolean e) {
		System.out.println("Greens");
	}
	
	public static void main(String[] args) {
		CompanyName c=new CompanyName();
		c.compName();
		c.compName(0, "s");
		c.compName(0, 2);
		c.compName(false);
		
	}
	
}
