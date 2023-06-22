package corejava;

import java.util.Scanner;

public class compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pricnipal Amount:");
		float P=sc.nextFloat();
		System.out.println("Enter Time Period:");
		float T=sc.nextFloat();
		System.out.println("Enter Interest Rate:");
		float R=sc.nextFloat();
		System.out.println("Enter number of times interest is compounded:");
		float n=sc.nextFloat();
		double CI=P*(Math.pow((1+R/100),(T*n)))-P;
		System.out.println("Compound Interest is= "+CI);

	}

}
