/*
AreaCircle3.java
F Heffernan
07Oct18
*/
import javax.swing.JOptionPane;

import java.util.*;

public class AreaCircle3{

	public static void main(String args[]){

		String inputDiameter;

		inputDiameter =JOptionPane.showInputDialog(null, "Enter diameter");

		int diameter;
		diameter = Integer.parseInt(inputDiameter);

		JOptionPane.showMessageDialog(null, "The Diameter is "+diameter);


		}
	}