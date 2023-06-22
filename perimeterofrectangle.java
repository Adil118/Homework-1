package corejava;

import java.util.Scanner;

public class perimeterofrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a length");
		float l=sc.nextFloat();
		System.out.println("Enter a Breadth");
		float b=sc.nextFloat();
		float p=2*(l+b);
		System.out.println("Perimete of rectangle= "+p);
		

	}

}
