import javax.swing.*;
import java.awt.*;

public class Problem2ForLoop {
    public static void main(String[] args) {
        JTextArea jTextArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        String userInput="";

        jTextArea.setFont(font);
        jTextArea.setText("Yards    Inches\n------      -------");

        for(int i=0;i<10;i++)
        {
            userInput = JOptionPane.showInputDialog("Please enter the distance in yards");
            int yards = Integer.parseInt(userInput);
            int inches = (yards*3)*12;
            jTextArea.append("\n"+yards+"     "+inches);
        }
        JOptionPane.showMessageDialog(null,jTextArea,"Output",JOptionPane.PLAIN_MESSAGE);
    }
}
