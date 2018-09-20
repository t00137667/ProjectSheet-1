import javax.swing.*;

public class Problem9ArrayAlgorithms {
    static double[] array = {234.2,123.0,344.8,455.4,150.6,354.8,421.6,168.7,115.6,327.5};

    public static void main(String[] args) {
        String weights="Weights: ";

        for(int i = 0; i<10;i++)
        {
            weights += array[i] + ", ";
        }

        JOptionPane.showMessageDialog(null,weights+"\nNumber under 250kgs: "+ getUnder250()+
                "\nPercentage over 400kg: " + getPercentOver400()+
                "\nLightest animal: " + getLightest()+" kg"+
                "\nAverage Weight: " + getAverageWeight()+" kg");
    }
    private static int getUnder250()
    {
        int count = 0;
        for(int i=0; i<10; i++)
        {
            if (array[i]<250)
            {
                count++;
            }
        }
        return count;
    }
    private static String getPercentOver400()
    {
        int total = array.length;
        int count = 0;
        float percent=0;

        System.out.print(array.length);

        for(int i=0; i<array.length; i++)
        {
            if (array[i]>400)
            {
                count++;
            }
        }

        percent = (count*100)/total;
        //System.out.print(percent);

        String output = String.format("%.0f%s",percent,"%");

        return output;
    }
    private static double getLightest()
    {
        double lightest = array[0];

        for(int i=0; i<array.length; i++)
        {
            if(array[i]<lightest)
            {
                lightest = array[i];
            }
        }

        return lightest;
    }
    private static String getAverageWeight()
    {
        double totalWeight=0;
        for(int i=0; i<array.length; i++)
        {
            totalWeight += array[i];
        }

        String average = String.format("%.1f",totalWeight/array.length);

        return average;
    }
}
