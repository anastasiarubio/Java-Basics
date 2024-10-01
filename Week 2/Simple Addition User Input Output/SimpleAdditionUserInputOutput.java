//importing a JOptionPane to use dialog box in java [How to make dialogs](https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html)
import javax.swing.JOptionPane;

public class SimpleAdditionUserInputOutput {
	public static void main (String[] args){
	
		//addition
		int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		int ans=x+y;
		//print
		JOptionPane.showMessageDialog (null,ans);
		//System.out.println(ans);
	}
}
    
