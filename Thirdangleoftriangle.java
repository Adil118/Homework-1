package corejava;

import java.util.Scanner;

public class Thirdangleoftriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st angle");
		float a= sc.nextFloat();
		System.out.println("Enter 2nd angle");
		float b=sc.nextFloat();
		float c=180-(a+b);
		System.out.println("3rd angle is= "+c);
		
		

	}

}
