package EggBoxCalculator;
//takes in a number of eggs that has been laid.  
//calculate and output how many 6-egg boxes the farmer needs to purchase to hold the eggs, and how many eggs will be left over.

import javax.swing.JOptionPane;

public class EggBoxCalculator {
    public static void main(String[] args) {
        //variables
        int eggs;
        int boxSize;
        int numBoxes;
        int leftOverEggs;
        
        //inputs
        eggs=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of eggs: "));
        boxSize=6;

        //process
        numBoxes=eggs/boxSize;
        leftOverEggs=eggs%boxSize;
        //output
        JOptionPane.showMessageDialog(null, "Number of boxes needed: " +numBoxes);
        JOptionPane.showMessageDialog(null, "Number of eggs left over: " +leftOverEggs);
    }
}

// function to sum two integers



