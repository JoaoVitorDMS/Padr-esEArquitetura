import javax.swing.JOptionPane;

public class Imc {
    
    String sex;
    Double height, weight, imc;
    public static void main(String[] args)
    {
        Imc obj = new Imc();
        obj.getSex();
    }

    void getSex()
    {
        sex = JOptionPane.showInputDialog("What's your genre?");

        switch(sex){

            case "M":
            case "m":
            case "Male":
            case "male":
                getHeightWeight();
                calcMale();
                break;
            case "F":
            case "f":
            case "Female":
            case "female":
                getHeightWeight();
                calcFemale();
                break;
            default:
                sex = JOptionPane.showInputDialog("What's your genre? ");
                break;
        }
    
    }

    void getHeightWeight()
    {
        height = Double.parseDouble(JOptionPane.showInputDialog("What's your altura? "));
        weight = Double.parseDouble(JOptionPane.showInputDialog("What's your peso? "));
        imc = weight / (height * height);
    }

    void calcMale()
    {
        System.out.println(imc);

        if(imc <= 19.1)
                {
                    System.out.println("Peso: " + weight );
                    System.out.println("Altura: " + height);
                    System.out.println(imc);
                    System.out.println("Abaixo do peso");
                }
                else if(imc > 19.1 && imc <= 25.8)
                {
                    System.out.println("Peso: " + weight );
                    System.out.println("Altura: " + height);
                    System.out.println(imc);
                    System.out.println("No peso normal");
                }
                else if(imc > 25.8 && imc <= 27.3)
                {
                    System.out.println("Peso: " + weight );
                    System.out.println("Altura: " + height);
                    System.out.println(imc);
                    System.out.println("Marginalmente acima do peso");
                }
                else if(imc > 27.3 && imc <= 32.3)
                {
                    System.out.println("Peso: " + weight );
                    System.out.println("Altura: " + height);
                    System.out.println(imc);
                    System.out.println("Acima do peso ideal");
                }
                else if(imc > 32.3)
                {
                    System.out.println("Peso: " + weight );
                    System.out.println("Altura: " + height);
                    System.out.println(imc);
                    System.out.println("Obeso");
                }
    }
    void calcFemale()
    {

        if(imc <= 20.7)
        {
            System.out.println("Peso: " + weight );
            System.out.println("Altura: " + height);
            System.out.println(imc);
            System.out.println("Abaixo do peso");
        }
        else if(imc > 20.7 && imc <= 26.4)
        {
            System.out.println("Peso: " + weight );
            System.out.println("Altura: " + height);
            System.out.println(imc);
            System.out.println("No peso normal");
        }
        else if(imc > 26.4 && imc <= 27.8)
        {
            System.out.println("Peso: " + weight );
            System.out.println("Altura: " + height);
            System.out.println(imc);
            System.out.println("Marginalmente acima do peso");
        }
        else if(imc > 27.8 && imc <= 31.1)
        {
            System.out.println("Peso: " + weight );
            System.out.println("Altura: " + height);
            System.out.println(imc);
            System.out.println("Acima do peso ideal");
        }
        else if(imc > 31.1)
        {
            System.out.println("Peso: " + weight );
            System.out.println("Altura: " + height);
            System.out.println(imc);
            System.out.println("Obeso");
        }
    }
}
