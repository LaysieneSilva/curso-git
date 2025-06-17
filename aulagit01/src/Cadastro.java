import java.sql.SQLOutput;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // CADASTRO

        System.out.println("CADASTRO");

        System.out.println("Digite seu nome completo: ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu e-mail: ");
        String email = teclado.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = teclado.nextLine();
        System.out.println("Cadastro concluído! ");
    }
}
