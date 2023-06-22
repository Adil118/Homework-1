package corejava;

import java.util.Scanner;

public class areaoftrianglr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of triangle=");
		float b=sc.nextFloat();
		System.out.println("Enter height of triangle=");
		float h=sc.nextFloat();
		float A=(b*h)/2;
		System.out.println("Area of triangle is= "+A);
		
		

	}

}
