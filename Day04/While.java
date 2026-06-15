import java.util.Scanner;

public class While {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu usuario ");
        String usr = sc.nextLine();

       
        if (usr.equals("abner")) {

            System.err.println("Congratularion!!!!");
            

        }

        else{
            for(int i = 1000000; i <= 1000000000 ; i--){
            System.out.println(i);
        }

        }
        

    }
}

// estrutura do for é
//for (acelerador, embreagem, freio);