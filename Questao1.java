
public class Questao1 {
    public static void main(String[] args) {
        double item1 = 2.95;
        double item2 = 3.50;

        System.out.println("O Item 1 custa " + item1);
        System.out.println("O Item 2 custa " + item2);

        double custoTotal = item1 + item2;
        System.out.println("O custo total e: " + custoTotal);

        final double TAXA = 0.0825;
        double taxaCalculada = custoTotal * TAXA;

        System.out.println("A taxa calculada e: " + taxaCalculada);

        item1 += taxaCalculada;
        item2 += taxaCalculada;

        double novoCusto = item1 + item2;
        System.out.println("O novo custo e: " + novoCusto);
    }
}
