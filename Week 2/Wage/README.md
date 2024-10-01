an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour (return the answer as an integer).

For example given the input: 

3500
12

The returned print statement should read:

Annual wage: 42000
Per hour rate: 67

For this question use Java's standard input to accept the user's input (instead of using the swing library). For example: 

import java.util.Scanner;
public class Wage{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int monthlyWage = sc.nextInt();
 int hoursWorked = sc.nextInt();

 // TODO: Write the rest of the code yourself
 }
}