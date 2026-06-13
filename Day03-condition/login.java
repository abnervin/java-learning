import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("\n================================");
        System.out.println("=========SISTEMA DE LOGIN=========");
        System.out.println("\n================================");
        System.out.println("Digite Seu nome de usuario !? ");
        String user = sc.nextLine();
        
        if (user.equals ("Invictus")) {

            System.out.println("Usuario Encontrado!!");
            System.out.println("Digite Sua senha !? ");
            String pass = sc.nextLine();
            if (pass.equals ("21654")) {

                System.out.println("acesso Liberado!!");
                
            }
            else{
                System.out.println("Senha Incorreta!!!!");
            }

        }

        else{
            System.out.println("Usuario Não Encontrado!!!");
        }
            
        sc.close();



    }
}