/* Ex 3.11: Senha até acertar
 *
 * Use while para pedir uma senha até que o usuário informe "banana".
 * Enquanto estiver errada, informe para tentar novamente; ao acertar,
 * permita o acesso. Compare Strings usando equals().
 *
 * Desafio: aceite letras maiúsculas e minúsculas.
 */
import java.util.Scanner;
public class Ex03_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Usuario informe a senha:");
     String senha = scanner.nextLine();
     while (!senha.equalsIgnoreCase("banana")){
         System.out.println("Senha incorreta");
         System.out.println("Dica é uma fruta:");
         senha = scanner.nextLine();
     }
     if (senha.equalsIgnoreCase("banana")){
         System.out.println("Você acertou!");
     }
scanner.close();
    }
}
