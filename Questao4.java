
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1 numero:");
        int numero = entrada.nextInt();

        int maior = numero;
        int menor = numero;

        for (int i = 2; i <= 5; i++) {
            System.out.println("Digite o " + i + " numero:");
            numero = entrada.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);

        entrada.close();
    }
}