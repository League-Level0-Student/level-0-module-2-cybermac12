package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
	public static void main(String[] args) {
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
	String heighttoRide = JOptionPane.showInputDialog("please enter your hieght in inches");
		// Uncomment the line below...
	int heightToRide = Integer.parseInt(heighttoRide);
	
	if( heightToRide > 48 ) {
		System.out.println("Hurray!!!! you are tall enough to ride alone");
	}
		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane

		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	  	else if (heightToRide >= 42) {
	  		
	  		System.out.println("You can ride with an adault");
	  		
	  	}
	  	
		// 6) else print: "You must {be at least 42 inches tall to ride the roller coaster pal!"
	  	else {
	  		System.out.println("you are not tall nor smart enogh to ride the coster");
	  		
	  	}
	}
	} 
