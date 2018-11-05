package Week1;
import javax.swing.JOptionPane;

public class Exercise4 {
    public static void main(String[] args) {

        int count = 0;
        double number;
        double sum = 0;
        String numberAsString;

        numberAsString = JOptionPane.showInputDialog("Enter a number: ");

        while(!numberAsString.equals("q"))
        {
            numberAsString = JOptionPane.showInputDialog("Enter a number: ");
            number = Double.parseDouble(numberAsString);

            sum = sum + number;
            count ++;
        }

        JOptionPane.showMessageDialog(null, "Grand total: " + sum + "Number of entries typed: "
                + count,"numbers", JOptionPane.INFORMATION_MESSAGE);


    }
}
