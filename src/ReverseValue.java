import javax.swing.JOptionPane;

public class ReverseValue {

    float value;
    public static void main(String[] args)
    {
        ReverseValue obj = new ReverseValue();
        
        obj.value();
        
    }

    void value()
    {
    
        value = Float.parseFloat(JOptionPane.showInputDialog("Values: "));

        float dive = value;
        String st = String.valueOf(dive);

        String str[] = st.split("\\.");

        int before = Integer.parseInt(str[0]);
        int after = Integer.parseInt(str[1]);

        String str1 = String.valueOf(reverse(before));
        String str2 = String.valueOf(reverse(after));
        String str3 = str1.concat(".").concat(str2);

        float rev = Float.parseFloat(str3);
        
        System.out.println("\n Reverse: " + rev);
    }
    
    int reverse(int valor)
    {
        int mod;
        int sum = 0;

        while(valor != 0)
        {
            mod = valor % 10;
            sum = sum * 10 + mod;
            valor = valor / 10;
        }
        
        return sum;
    }
}
