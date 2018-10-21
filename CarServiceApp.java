/*
CarServiceApp.java
F Heffernan
21Oct18
*/

import javax.swing.*;

	public class CarServiceApp{
		public static void main(String args[]){

			//variables
			String service;
			String location;
			String message;

			//objects
			CarService myCarService;
			myCarService=new CarService();

			//input
			service=JOptionPane.showInputDialog(null,"Please enter the service you require.");
			myCarService.setService(service);

			location=JOptionPane.showInputDialog(null,"Please enter the location you require.");
			myCarService.setLocation(location);

			//process
			myCarService.compute();

			//output
			message=myCarService.getMessage();
			JOptionPane.showMessageDialog(null, message);


			}
		}