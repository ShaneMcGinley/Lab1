package Week1;
import javax.swing.JOptionPane;

public class Exercise3 {
    public static void main(String[] args) {

        String name = getName();
        float grossIncome = taxableIncome();
        double taxDue;
        double taxRate;
        double netIncome;

        if(grossIncome <= 20000) {
            taxDue = 0;
            taxRate = 0;
        }
        else if(grossIncome > 20000 && grossIncome <= 36000) {
            taxDue = grossIncome * 0.2;
            taxRate = 20;
        }
        else
            taxDue = grossIncome * 0.41;
            taxRate = 41;

        netIncome = grossIncome - taxDue;

        JOptionPane.showMessageDialog(null, "Gross Income: € " + String.format("%.2f",grossIncome)
                        + "\nTax Rate: " + taxRate + "%"+ "\nTax: € " + String.format("%.2f",taxDue) + "\nNet Income: € "
                        + String.format("%.2f",netIncome), "Income", JOptionPane.INFORMATION_MESSAGE);

    }

    public static String getName()
    {
        String name;
        name = JOptionPane.showInputDialog("Please enter your name: ");
        return name;
    }

    public static float taxableIncome()
    {
        float taxIncome;
        String taxIncomeAsString;
        taxIncomeAsString = JOptionPane.showInputDialog("Enter your taxable income: ");
        taxIncome = Float.parseFloat(taxIncomeAsString);
        return taxIncome;
    }


}
