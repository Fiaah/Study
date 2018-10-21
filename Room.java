
import java.util.*;

public class Room{

	public static void main(String args[]){

		int length = 0;

		int width = 0;

		int perimeter = 0;

	Scanner keyboard;

	keyboard = new Scanner(System.in);

	System.out.println("Enter length");
		length = keyboard.nextInt();

	System.out.println("Enter Width");

		width = keyboard.nextInt();


		perimeter = 2*( length+width);

		System.out.println(" The perimeter of the room is " +perimeter + " feet");
		}
	}