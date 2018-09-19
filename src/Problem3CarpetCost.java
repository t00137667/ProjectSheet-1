/*Determining the cost of carpeting an area based on inputted sides, and cost per square metre.
* */

import javax.swing.*;
import java.awt.*;

public class Problem3CarpetCost {
    public static void main(String[] args) {
        JTextArea jTextArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        jTextArea.setFont(font);
        jTextArea.setText(userInput());

        //System.out.print(userInput());
        JOptionPane.showMessageDialog(null,jTextArea);

    }

    private static String userInput() {
        String name = JOptionPane.showInputDialog("Please enter your name.");
        float roomLength = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the room."));
        float roomWidth = Float.parseFloat(JOptionPane.showInputDialog("Please enter the width of the room."));
        float area = calcArea(roomLength, roomWidth);
        float costArea = Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost per square metre of carpet."));
        float totalCost = calcCost(area, costArea);

        String outputString = String.format("%s%s\n%-35s%.2f%s\n%-35s%.2f%s\n%-35s%.2f%s\n%-35s%.2f%s\n%-35s%.2f%s","Quotation for ",name,
                "Length of room:",roomLength," m.",
                "Breadth of room:",roomWidth," m.",
                "Total area of the room:",area," sq m.",
                "Cost per square metre of carpet:",costArea," euro",
                "Total cost of carpet:",totalCost," euro");

        return outputString;

    }

    private static float calcArea(float length, float width) {
        return length*width;
    }

    private static float calcCost(float a, float c)
    {
        return a*c;
    }

}
