/* Ex 3.10: Pergunte novamente
 *
 * Use while para perguntar "Você quer continuar? (S/N)" novamente
 * enquanto a resposta for S. Ao responder N, imprima "Programa
 * encerrado."
 *
 * Desafio: aceite S e s.
 */
import java.util.Scanner;
public class Ex03_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja continuar?");
        String resposta = scanner.nextLine();
        while (resposta.equalsIgnoreCase("S")){

            System.out.println("Deseja continuar?:");
            resposta = scanner.nextLine();

        }
        if (resposta.equalsIgnoreCase("n")) {
            System.out.println("Programa encerrado");
        }
    }
}
