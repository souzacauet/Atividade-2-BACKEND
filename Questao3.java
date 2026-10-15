
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero:");
        int numero3 = entrada.nextInt();

        int soma = numero1 + numero2 + numero3;
        int media = soma / 3;
        int produto = numero1 * numero2 * numero3;

        int menor = Math.min(numero1, Math.min(numero2, numero3));
        int maior = Math.max(numero1, Math.max(numero2, numero3));

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Produto: " + produto);
        System.out.println("Menor numero: " + menor);
        System.out.println("Maior numero: " + maior);

        entrada.close();
    }
}
