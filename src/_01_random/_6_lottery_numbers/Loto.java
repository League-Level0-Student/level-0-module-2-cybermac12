package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Loto {

public static void main(String[] args) {
  String lottoNumbers= "";
	Random ran = new Random();
	for (int i=0; i<6; i++) {
	int lotto = ran.nextInt(99);
	System.out.println(lotto);
	lottoNumbers = lottoNumbers + lotto + ", ";
	}
	
	
	JOptionPane.showMessageDialog(null," "  + lottoNumbers );
	
	
	
	
	
	
	
	
	
}
	
}
