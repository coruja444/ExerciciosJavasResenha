/* Ex 3.12: Palavra mágica
 *
 * Use while para pedir uma palavra até que o usuário informe
 * "abracadabra". Enquanto estiver errada, peça novamente; ao acertar,
 * informe que a porta se abriu.
 *
 * Desafio: depois, pergunte se o usuário deseja entrar e apresente um
 * final diferente conforme a resposta.
 */
import java.util.Scanner;
public class Ex03_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma palavra:");
   String palavra = scanner.nextLine();
   while (!palavra.equalsIgnoreCase("abracadabra")){
       System.out.println("A porta não abriu tente denovo:");
   }
   if (palavra.equalsIgnoreCase("Abracadabra")){
       System.out.println("A porta abriu!!!");
   }
    }
}
