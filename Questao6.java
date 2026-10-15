
public class Questao6 {
    public static void main(String[] args) {
        int dia = 27;
        int mes = 1;
        int ano = 2000;
        int dias;

        System.out.println(dia + "/" + mes + "/" + ano);

        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;

            case 2:
                dias = 28;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;

            default:
                dias = 0;
                break;
        }

        if (dias == 0) {
            System.out.println("Mes invalido");
        } else {
            System.out.println(dias + " dias no mes");
        }
    }
}
