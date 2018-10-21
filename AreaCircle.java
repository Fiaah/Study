/*
AreaCircle.java
F Heffernan
07Oct18
*/

import java.util.*;

public class AreaCircle{

	public static void main(String args[]){

		int r = 0;

		double area = 0;

		double circumference = 0;

		Scanner keyboard;

		keyboard = new Scanner(System.in);

		System.out.println("Please enter the radius");

		r = keyboard.nextInt();

		area = 3.14*(r*r);

		circumference = 3.14*(r+r);

		System.out.println("The area of the circle is" +area);

		System.out.print(" and the circumference is " + circumference);

		}
	}