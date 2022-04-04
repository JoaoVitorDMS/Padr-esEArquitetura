import java.util.Scanner;

class Sum
{
        public static void main(String[] args)
        {
            
            Scanner scanner = new Scanner(System.in);
            
            try
            {
                System.out.print("Digite um número para A: ");
                int A= scanner.nextInt();
                System.out.print("Digite um número para B: ");
                int B = scanner.nextInt();
                System.out.print("Resultado da soma: " + (A + B));
            }
            catch(Exception e)
            {
                System.out.println("Inválido");
            }
        }
}