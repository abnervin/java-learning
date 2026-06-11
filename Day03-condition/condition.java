import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero ");
        int a = sc.nextInt();

        if (a==5) {

            System.out.println("é igual");
            
        }

        else if (a!=1) {

            System.out.println("Caramba!");
            
        }

        sc.close();

    }
}