import javax.swing.JOptionPane;

public class AgeUser {
    public static void main(String[] args) throws Exception {
        
        int age;

        try{
        
            age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));

        if(age > 0 && age < 12)
        {
            System.out.println("Childreen!");
        }
        else if(age >= 12 && age < 18)
        {
            System.out.println("Teenager!");
        }
        else if(age >= 18 && age < 60)
        {
            System.out.println("Adult!");
        }
        else if(age >= 60 && age < 115)
        {
            System.out.println("Oldman!");
        }
        else
        {
            System.out.println("Invalid!");
        }
            }
        catch(Exception e){
            System.out.println("error!");
        }
    }
}
