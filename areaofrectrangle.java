package corejava;

import java.util.Scanner;

public class areaofrectrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length & breadth");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		float area=l*b;
		System.out.println("area of rectangle= "+area);

	}

}
