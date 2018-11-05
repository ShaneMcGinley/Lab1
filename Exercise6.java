package Week1;
import javax.swing.JOptionPane;

public class Exercise6 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int answer = 0;
        char choice;
        String choiceAsString;
        String num1AsString;
        String num2AsString;

        choiceAsString = JOptionPane.showInputDialog("Pick One - A (addition), S (subtraction), M (multiply), D (devide): ");
        choice = choiceAsString.charAt(0);

        while(choice != 'Q') {
            num1AsString = JOptionPane.showInputDialog("Enter Number: ");
            num1 = Integer.parseInt(num1AsString);

            num2AsString = JOptionPane.showInputDialog("Enter Another Number: ");
            num2 = Integer.parseInt(num2AsString);

            switch (choice) {
                case 'A':
                    answer = num1 + num2;
                    break;
                case 'S':
                    answer = num1 - num2;
                    break;
                case 'M':
                    answer = num1 * num2;
                    break;
                case 'D':
                    answer = num1 / num2;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"You did not enter A, S, M or D");
            }

            JOptionPane.showMessageDialog(null,"Result: " + answer);

            choiceAsString = JOptionPane.showInputDialog("Pick One - A (addition), S (subtraction), M (multiply), D (devide): ");
            choice = choiceAsString.charAt(0);

        }


    }
}
