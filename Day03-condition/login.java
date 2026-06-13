import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String USUARIO_CORRETO = "Invictus";
        final String SENHA_CORRETA = "abner";

        System.out.println("=================================");
        System.out.println("      SISTEMA DE LOGIN");
        System.out.println("=================================");

        System.out.print("Usuário: ");
        String usuario = sc.nextLine();

        if (usuario.equals(USUARIO_CORRETO)) {

            System.out.println("\n✅ Usuário encontrado!");

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("\n🔓 Acesso liberado!");
                System.out.println("Bem-vindo, " + usuario + "!");
            } else {
                System.out.println("\n❌ Senha incorreta!");
                System.out.println("Acesso negado.");
            }

        } else {
            System.out.println("\n❌ Usuário não encontrado!");
            System.out.println("Acesso negado.");
        }

        sc.close();
    }
}