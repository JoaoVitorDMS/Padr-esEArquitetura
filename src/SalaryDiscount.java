import javax.swing.JOptionPane;

public class SalaryDiscount {
    public static void main(String[] args)
    {
        int hour, valueHour;
        double salaryGross1, salaryGross2, salaryGross3;

        hour = Integer.parseInt(JOptionPane.showInputDialog("worked hours: "));
        valueHour = Integer.parseInt(JOptionPane.showInputDialog("Value hours worked:"));

        double salaryGross = hour * valueHour;

        System.out.println("Worked hour: " + hour);
        System.out.println("Hour worked value: " + valueHour);
        System.out.println("salaryGross: " + salaryGross);
        
        if(salaryGross <= 900)
        {
            salaryGross1 = salaryGross;
            salaryGross2 = salaryGross * 0.10;
            System.out.println("INSS: " + salaryGross2);
            salaryGross3 = salaryGross * 0.11;
            System.out.println("FGTS: " + salaryGross3);

            System.out.println("Discount total: " + salaryGross2);
            System.out.println("SALARY: " + (salaryGross - salaryGross2));
        }
        else if(salaryGross <= 1500)
        {
            salaryGross1 = salaryGross * 0.05;
            System.out.println("IR: " + salaryGross1);
            salaryGross2 = salaryGross * 0.10;
            System.out.println("INSS: " + salaryGross2);
            salaryGross3 = salaryGross * 0.11;
            System.out.println("FGTS: " + salaryGross3);

            System.out.println("Discount total: " + (salaryGross1 + salaryGross2));
            System.out.println("SALARY: " + (salaryGross - (salaryGross1 + salaryGross2)));
        }
        else if(salaryGross <= 2500)
        {
            salaryGross1 = salaryGross * 0.10;
            System.out.println("IR: " + salaryGross1);
            salaryGross2 = salaryGross * 0.10;
            System.out.println("INSS: " + salaryGross2);
            salaryGross3 = salaryGross * 0.11;
            System.out.println("FGTS: " + salaryGross3);

            System.out.println("Discount total: " + (salaryGross1 + salaryGross2));
            System.out.println("SALARY: " + (salaryGross - (salaryGross1 + salaryGross2)));
        }
        else if(salaryGross > 2500)
        {
            salaryGross1 = salaryGross * 0.20;
            System.out.println("IR: " + salaryGross1);
            salaryGross2 = salaryGross * 0.10;
            System.out.println("INSS: " + salaryGross2);
            salaryGross3 = salaryGross * 0.11;
            System.out.println("FGTS: " + salaryGross3);

            System.out.println("Discount total: " + (salaryGross1 + salaryGross2));
            System.out.println("SALARY: " + (salaryGross - (salaryGross1 + salaryGross2)));
        }
        else
        {
            System.out.println("error");
        }

        
    }   
}
