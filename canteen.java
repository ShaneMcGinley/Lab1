package Week1;
import javax.swing.JOptionPane;

public class canteen {
    public static void main(String[] args) {

        String name, className, snacksAsString;
        int snacks;
        float price;

        name = JOptionPane.showInputDialog("Enter your name: ");
        className  = JOptionPane.showInputDialog("Enter your class name: ");
        snacksAsString  = JOptionPane.showInputDialog("How many snacks would you like? ");
        snacks = Integer.parseInt(snacksAsString);

        price = snacks * 2;

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nYour Class: " + className + "\nNumber of snacks: " + snacks + "\nCost: €" + price, "Canteen", JOptionPane.INFORMATION_MESSAGE);

    }
}
