import javax.swing.*;

public class Problem4StringTime {
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog("Please enter your full name.");

        analyseName(fullName);

    }

    private static void analyseName(String name)
    {
        int numChar = name.length();
        char initial = name.charAt(0);
        String nameUpper = name.toUpperCase();
        int surnameIndex = name.lastIndexOf(' ');
        String surname = name.substring(surnameIndex);

        System.out.print("Number of Characters: "+numChar
                        +"\nInitial of the firstname: "+initial
                        +"\nCapital name: "+nameUpper
                        +"\nSurname: "+ surname);
    }
}
