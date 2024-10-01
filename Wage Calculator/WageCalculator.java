//user's monthly wage and weekly hours and calculates how much they make per year and per hour
import javax.swing.JOptionPane;

public class WageCalculator {

    public static void main(String[] args) {
        //variables
        double monthlyWage, weeklyHours, yearlyWage, hourlyWage;

        //inputs
        monthlyWage = Double.parseDouble(JOptionPane.showInputDialog("Enter your monthly wage"));
        weeklyHours = Double.parseDouble(JOptionPane.showInputDialog("Enter your weekly hours"));

        //process
        yearlyWage = monthlyWage * 12;
        hourlyWage = yearlyWage / (weeklyHours * 12);
    
        //output
        JOptionPane.showMessageDialog(null, "Your yearly wage is €" + yearlyWage + " and your hourly wage is €" + hourlyWage);

        

    }



}