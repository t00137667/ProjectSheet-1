import javax.swing.*;

public class Problem7MoreMethodTime {
    public static void main(String[] args) {
        int input;

        input = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer"));

        while (input !=-1) {
            if (isEven(input)) {
                JOptionPane.showMessageDialog(null, input + " is even");
            } else {
                JOptionPane.showMessageDialog(null, input + " is odd");
            }
            input = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer"));
        }
    }
    private static boolean isEven(int i)
    {
        if(i%2==0)
        {
            return true;
        }
        else
            return false;
    }
}
