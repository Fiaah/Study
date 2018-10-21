/*
StudyOne.java
F Heffernan
07Oct18
*/

//Stating the class
public class StudyOne{

//Stating the Method
	public static void main(String args[]){ //must always have a main method
//What I want the method to do, which is a statement
		System.out.println("I can do this!!");

//declaring and assigning my variable
	int x = 1;//this wont do anything right now

	System.out.println("Before the Loop");

	System.out.println("x is " +x);

	while (x<4) {

		System.out.println("In the Loop");

		System.out.println("value of x is "+x);

		x = x+1;

			}

			System.out.println("This is after the loop");

			while (x==4) {

			System.out.println("This is the max amount = " +x);

			x = x - 1;

		}

		}

	}