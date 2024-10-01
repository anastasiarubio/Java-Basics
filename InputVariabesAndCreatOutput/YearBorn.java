package InputVariabesAndCreatOutput;

import javax.swing.JOptionPane;
import java.util.Calendar;

public class YearBorn {
    
    public static void main(String[] args) {

		//declare variable
		int age, currentYear, yearBorn;
		//inputs
        age=Integer.parseInt(JOptionPane.showInputDialog(null,"Add your age"));
		currentYear=Calendar.getInstance().get(Calendar.YEAR);
		//process
		yearBorn=currentYear-age;
		//output
		JOptionPane.showMessageDialog (null, "You were born in "+yearBorn);
    
}
}
