package Week1;
import javax.swing.JOptionPane;

public class cyclist {
    public static void main(String[] args) {

    String firstName = getFirstName();
    String initial = getInitial();
    String lastName = getLastName();
    float distanceCycled = getDistanceCycled();
    float moneyDue;

    }
    public static String getFirstName()
    {
        String firstName;
        firstName = JOptionPane.showInputDialog("Enter your first name: ");
        return firstName;
    }

    public static String getInitial()
    {
        String initial;
        initial = JOptionPane.showInputDialog("Enter your middle name initial: ");
        return initial;
    }

    public static String getLastName()
    {
        String lastName;
        lastName = JOptionPane.showInputDialog("Enter your last name: ");
        return lastName;
    }

    public static float getDistanceCycled()
    {
        float distanceCycled;
        String distanceCycledAsString;
        distanceCycledAsString = JOptionPane.showInputDialog("Distance Cycled (km): ");
        distanceCycled = Float.parseFloat(distanceCycledAsString);
        return distanceCycled;
    }


}
