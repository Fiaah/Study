/*
* Repetition3.java
*Author: F heffernan
* 21Oct18
*/

import javax.swing.*;

public class Repetition3{

	public static void main(String args[]){

		int number;
		int sum;

		sum=0;
		number=1;
//Sentinel Controlled Loop
		while(number !=0){
			number=Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number or 0 to exit"));
			sum=sum+number;
			}
		JOptionPane.showMessageDialog(null, " The sum of those numbers is " +sum);
		}
	}