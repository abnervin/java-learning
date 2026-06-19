package Routs;
import java.util.Scanner;



public class Routs {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        System.out.print("\n==============================");
        System.out.print("\n======Relatorio do Routs======");
        System.out.println("\n============================");


        


        System.out.println("Oque você deseja realiza ? ");
        int hm = sc.nextInt();

        if (hm == 1) {

            System.out.println("Digite os valores de vibração do mancal ");

            System.out.println("Valores do horizontal LA ");
            double h1 = sc.nextDouble();
            System.out.println("Valores do Vertial LA ");
            double v1 = sc.nextDouble();
            System.out.println("Valores do Axial LA ");
            double a1 = sc.nextDouble();
            
            System.out.println("Agora digite o do lado Oposto ");

            
            System.out.println("Valores do horizontal LOA ");
            double h2 = sc.nextDouble();
            System.out.println("Valores do Vertial LOA ");
            double v2 = sc.nextDouble();
            System.out.println("Valores do Axial LOA ");
            double a2 = sc.nextDouble();

            System.out.println("\n============================");
            System.out.println("\n======Valores De vibração===");
            System.out.println("\n============================");
            System.out.println("==Mancal LA==");
            System.out.println("==Horizontal== "+ h1 );
            System.out.println("==Vertical== " + v1 );
            System.out.println("==Axial== " + a1 );
            System.out.println("Agora o Lado oposto");
            System.out.println("==Mancal LOA==");
            System.out.println("==Horizontal== "+ h2 );
            System.out.println("==Vertical== " + v2 );
            System.out.println("==Axial== " + a2 );
      

            if (h1+v1+v1 > h2+v2+a2 ) {
            System.out.println("Valor elevado no lado do acionamento");
            
                if (h2+v2+a2 > h1+v1+v1 ) {
                    System.out.println("valor elevado no Lado Oposto do Acionamento");
                    if (h1>h2) {
                        System.out.println("Especificamente o horizontal lado Acionado" + h1);
                        
                    }
                    if (h2>h1) {
                        System.out.println("Especificamente o horizontal lado Oposto" + h2);
                        
                    }
                    if (v1>v2) {
                        System.out.println("Especificamente o Vertical lado Acionado" + v1);
                        
                    }
                    if (v2>v1) {
                        System.out.println("Especificamente o Vertialal lado Oposto" + v2);
                        
                    }
                    if (a1>a2) {
                        System.out.println("Especificamente o Axial lado Acionado" + a1);
                        
                    }
                    if (a2>a1) {
                        System.out.println("Especificamente o Axial lado oposto" + a2);
                        
                    }
                }
            }
            else;
            System.out.println("tudo okay");
        }
       
        

        sc.close();


    }
}