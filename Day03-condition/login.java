import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Digite Seu nome de usuario !? ");
        String user = sc.nextLine();
        
        if (user.equals ("Invictus")) {

            System.out.println("Achamos seu User ");
            System.out.println("Agora sua senha  ");
            String pass = sc.nextLine();
            if (pass.equals ("5684asd")) {

                System.out.println("acesso Liberado!!");
                
            }
            else{
                System.out.println("EEEERROOOOOOUUUU A SENHA....");
            }

        }

        else{
            System.out.println("Nao ta liberado nao chefe !!!...");
        }
            
        sc.close();



    }
}