//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		
		
		int count = 0;
		
		Random randomMaker = new Random();
		while (count < 1111111) {
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
			
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null,"My code takes to long!!!! >:)");
		}
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null,"Why does my code never work!!!! >:)");
		}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null,"Why does it take so long to code!!! >:)");	
		}
		if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null,"This code is so inefficient!!! >:) ");
		}
		if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null,"You are so annoying!!!! >:)");
		}
		count +=1;
		
		
	}
		
		// 2. Repeat all the code above 10 times
			
		// 3. Find someone to test out your program. They will like it :)
	}
	
}
