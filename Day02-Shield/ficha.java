import java.util.Scanner;

public class ficha {
    public static void main(String[] args){

        Scanner nn = new Scanner (System.in);
        Scanner p = new Scanner(System.in);
        Scanner idd = new Scanner (System.in);
        Scanner alt = new Scanner(System.in);


        System.out.println("Digite seu nome ...");
        String nome = nn.nextLine();

        System.out.println("Digite sua profissão ");
        String Prof = p.nextLine();

        System.out.println("Digite Sua idade... ");
        int ida = idd.nextInt();


        System.out.println("Qual sua altura ");
        double al = alt.nextDouble();
       
        int soma = ida + 10;

        System.out.println("\n=======Perfil======");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + ida);
        System.out.println("Altura: " + al);
        System.out.println("Sua profissao é " + Prof);
        System.out.println(" Daqui a 10 anos voce terá " + soma ) ;
        System.out.println("\n======================");
        nn.close();

    }
}
