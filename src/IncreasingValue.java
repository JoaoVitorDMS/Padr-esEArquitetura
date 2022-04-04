import java.util.Arrays;

import javax.swing.JOptionPane;

class IncreasingValue{

    float[] values = new float[3];
    public static void main(String[] args)
    {
        IncreasingValue obj = new IncreasingValue();
        obj.getValues();
    }

    void getValues()
    {
        values[0] = Float.parseFloat(JOptionPane.showInputDialog("value1 :"));
        values[1] = Float.parseFloat(JOptionPane.showInputDialog("value2 :"));
        values[2] = Float.parseFloat(JOptionPane.showInputDialog("value3 :"));

        for(float number : values)
            System.out.println(number);

        System.out.println();
        Arrays.sort(values);

        for(float number : values)
            System.out.println(number);
        
        System.out.println();
    }
}