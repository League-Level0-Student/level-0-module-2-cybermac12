package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votesPriviteNOPEEKING {
	public static void main(String[] args) {
	
	
	String PersoNV = JOptionPane.showInputDialog("how old are you");
	int PersonV = Integer.parseInt(PersoNV);
	
if (PersonV >= 18 ) {
	String Vote = JOptionPane.showInputDialog("Who should be the next presndent");
}

else {
	String kid = JOptionPane.showInputDialog("No one loves you KID!!!!!");
}
	}
}
