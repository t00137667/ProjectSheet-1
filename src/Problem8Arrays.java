import java.util.Scanner;

public class Problem8Arrays {
    static int[] array = new int[10];

    public static void main(String[] args) {
        arrayInput(array);
        System.out.print("The first value in the array is "+array[0]);
        System.out.print("\n\nThe fifth value in the array is "+array[4]);
    }
    private static void arrayInput(int[] array)
    {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Please enter an integer: ");
            array[i] = input.nextInt();
        }
    }
}
