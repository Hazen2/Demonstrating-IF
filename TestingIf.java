import javax.swing.JOptionPane;

/**
 * This program demonstrates the IF statement.
 * If the average of three test scores is over 95%
 * congratulate the user.
 */

public class TestingIf
{
  public static void main(String[] args)
  {
    
   // Declare variables.
   String keyboardInput; // To hold the user's input.
   String nameStr;        // The user's name.
   double score1;         // To hold test score 1.
   double score2;         // To hold test score 2.
   double score3;         // To hold test score 3.
   double averageScore;   // The average of 3 test scores.
   
   // Get user's name.
   nameStr = JOptionPane.showInputDialog("Please enter your name.");
      
   // Get the first test score and convert to Double.
   keyboardInput = JOptionPane.showInputDialog(nameStr + ", enter your first test score.");
   score1 = Double.parseDouble(keyboardInput);
   
   // Get the second test score and conver to Double.
   keyboardInput = JOptionPane.showInputDialog(nameStr + ", enter your second test score.");
   score2 = Double.parseDouble(keyboardInput);
   
   // Get the third test score and convert to Double.
   keyboardInput = JOptionPane.showInputDialog(nameStr + ", enter your third test score.");
   score3 = Double.parseDouble(keyboardInput);
   
   // Get the average of the three test scores.
   averageScore = (score1 + score2 + score3) / 3;
   
   // If average score is over 95%, congratulate user.
   if (averageScore >= 95)
   {
     JOptionPane.showMessageDialog(null, nameStr + ", that's a great score!");
     JOptionPane.showMessageDialog(null, "Click OK to end the program.");
   }
   
   // Safely exit
   System.exit(0);
   
   // Show input
   // System.out.println(averageScore);
  }
}







