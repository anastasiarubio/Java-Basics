package InputVariabesAndCreatOutput;

import javax.swing.JOptionPane;

public class InputVariablesAndCreatOutput {
    
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Add your age"));
		int y=Integer.parseInt(JOptionPane.showInputDialog(null,"What is current year"));
		int ans=y-x;
		//print
		JOptionPane.showMessageDialog (null, "You were born in "+ans);
    
}
}
