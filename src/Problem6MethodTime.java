import javax.swing.*;
import java.awt.*;

public class Problem6MethodTime {
    public static void main(String[] args) {

        JTextArea displayBox = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN, 12);
        displayBox.setFont(font);
        displayBox.setText(String.format("%-15s%s\n%-15s%s","Number","Cube","------","----"));

        for(int i = 1; i<=15; i++)
        {
            displayBox.append(String.format("\n%-15s%.0f",i,cube(i)));
        }
        JOptionPane.showMessageDialog(null,displayBox);
    }

    private static double cube(int i)
    {
        return Math.pow(i,3);
    }
}
