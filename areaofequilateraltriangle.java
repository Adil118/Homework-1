package corejava;

import java.util.Scanner;

public class areaofequilateraltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of a triangle:");
		float a=sc.nextFloat();
		float A=(1.7320f/4)*a*a;
		System.out.println("Area of equilateral triangle is= "+A);
		

	}

}
