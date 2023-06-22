package corejava;

import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle : ");
		 float p = sc.nextFloat();
		System.out.println("Enter the rate of interest : ");
		 float r = sc.nextFloat();
		System.out.println("Enter the time period : ");
		 float t = sc.nextFloat();
		float si;
		si = (p*r*t)/100;
	    System.out.println("Simple interest is : " + si);
		
		
	
		

	}

}
