/*
AreaCircle2.java
F Heffernan
07Oct18
*/

import java.util.*;

public class AreaCircle2{

	public static void main(String args[]){

		int diameter = 0;

		double radius = 0;

		double circumference = 0;

		Scanner keyboard;

		keyboard = new Scanner(System.in);

		System.out.println("Please enter the diameter");

		diameter = keyboard.nextInt();

		radius = diameter/2;


		System.out.println("The radius of the circle is" +radius);


		}
	}