import java.util.Optional;
import java.util.Scanner;

public class controleFluxo {

    public static void main(String[] args){

        //System.out.println("Mês:");
        //mes();
        System.out.println("Semana");
        semana();

    }

    private static void mes() {

        System.out.println("Digite o número do mês: ");
        Scanner mes = new Scanner(System.in);
        int i = mes.nextInt();

        if (i > 0 && i < 13){

            switch (i) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
            }
                if (i == 1 || i == 7 || i == 12) {
                    System.out.println("Férias!");
                }else{
                    System.out.println("Continue a trabalhar!");
                }
        }else{
            System.out.println("Este mês não existe. Tente novamente!");
        }



    }

    private static void semana(){

        System.out.println("Qual o dia da semana? ");
        Scanner semana = new Scanner(System.in);
        String i = semana.nextLine();

        switch (i) {
            case "domingo":
                System.out.println("1");
                break;
            case "segunda":
                System.out.println("2");
                break;
            case "terça":
                System.out.println("3");
                break;
            case "quarta":
                System.out.println("4");
                break;
            case "quinta":
                System.out.println("5");
                break;
            case "sexta":
                System.out.println("6");
                break;
            case "sábado":
                System.out.println("7");
                break;
            default:
                System.out.println("Tente novamente!");
        }

    }

}
