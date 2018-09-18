import javax.swing.*;

public class Problem1WhileLoop {
    public static void main(String[] args) {
        final double conversion = 0.89; //Accurate on date: 18/09/2018
        double userConversion, userInput, userOutput;
        int loops=5, i = 0;
        String twoDecimal;
        String userConversionAsString = JOptionPane.showInputDialog("Please enter the conversion rate");
        userConversion = Double.parseDouble(userConversionAsString);

        while(i<loops)
        {
            userInput = Double.parseDouble(JOptionPane.showInputDialog("Please enter a sum of £"));
            userOutput = userInput/userConversion;
            twoDecimal = String.format("%s%.2f%s%.2f","GB: £",userInput," EUR:  €",userOutput);
            JOptionPane.showMessageDialog(null,twoDecimal,"Conversion Rate: "+userConversionAsString,JOptionPane.PLAIN_MESSAGE);
            i++;
        }

    }
}
