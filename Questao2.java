
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " e maior");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " e maior");
        } else {
            System.out.println("Os valores sao iguais");
        }

        entrada.close();
    }
}
