package p1;

import java.util.Scanner;

public class Chap02Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input radius 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		
		double radius = input.nextDouble();
		double pie = 3.14159265;
		//calculate area
		double area = radius * radius * pie;
		
		//display area
		System.out.print("Area of cirlce is: " + area);
		
		

	}

}
