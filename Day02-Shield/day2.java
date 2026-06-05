import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nome = scanner.nextLine();
        System.out.print("Ola "+ nome); 
        scanner.close();
    }
}


// import java.util.Scanner;
//Scanner é uma classe que permite ler a entrada do usuário a partir do console. Ela é parte do pacote java.util, que contém várias classes úteis para manipulação de dados e entrada/saída.
//Scanner scannner = new Scanner(system.in); - Esta linha cria um objeto Scanner chamado "scanner" que está configurado para ler a entrada do usuário a partir do console (System.in).
//scanner.close(); - Esta linha fecha o objeto Scanner após seu uso. É uma boa prática fechar recursos como Scanner para liberar os recursos do sistema associados a ele.
// saber como quebrar llinha kskkask