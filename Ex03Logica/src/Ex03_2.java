/* Ex 3.2: Senha do castelo
 *
 * Peça uma senha e verifique se ela é igual a "dragao". Se estiver
 * correta, permita o acesso; caso contrário, informe que está incorreta.
 * Compare Strings usando equals().
 *
 * Desafio: aceite letras maiúsculas e minúsculas.
 */
import java.util.Scanner;
public class Ex03_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a senha:");
        String senha = scanner.nextLine();
        if(senha.equalsIgnoreCase("dragao")){
            System.out.println("A senha está correta");
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
}
