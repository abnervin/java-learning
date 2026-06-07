import java.util.Scanner;
 public class desafio01{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero Inteiro ");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero ");
        int num2 = sc.nextInt();

        int som = num1+num2;
        int sub = num1-num2;
        int mult = num1*num2;
        double div = (double) num1 / num2;


        System.out.println("\n======================");
        System.out.println("Soma total: "+som);
        System.out.println("Subtração Total:  "+sub);
        System.out.println("Multiplicação total: "+mult);
        System.out.println("Divisão Total: "+div);
        System.out.println("\n======================");

        sc.close();
    }
 }