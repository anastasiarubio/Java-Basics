package Wage;

//an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour (return the answer as an integer)

import java.util.Scanner;

public class Wage {
    public static void main(String[] args) {
        //Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Monthly wage
        System.out.print("Enter your monthly wage: ");
        int monthlyWage = sc.nextInt();

        //Number of hours
        System.out.print("Enter the number of hours worked in a month: ");
        int hoursWorked = sc.nextInt();

        //process
        int annualWage = monthlyWage * 12;
        int wagePerHour = annualWage / (hoursWorked*52);

        //output
        System.out.println("Your anual wage is: " + annualWage);
        System.out.println("Your wage per hour is: " + wagePerHour);
    
}
}