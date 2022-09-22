/*CRIE UM PROGRAMA QUE O USUARIO DIGITE UM NUMERO ENTRE 1 A 7, QUE CORRESPONDE
A SEMANA DE SABADO A DOMINGO, CADA NUMERO CORRESPONDE A UM DIA DA SEMANA,SE
DIGITAR UM NUMERO INVALIDO DEVE IMPRIMIR UMA MENSAGEM DE ALERTA  A SUA ESCOLHA,
É DEPOIS QUE O USUARIO DIGITAR O NUMERO ESCOLHIDO IMPRIMA NA TELA QUE DIA
 DA SEMANA ELE ESCOLHEU. */



package CursoLoiane;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um dia da semana (1-7): ");

        int diaDaSemana = scanner.nextInt();

        if (diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaDaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaDaSemana == 3) {
            System.out.println("Terca");
        } else if (diaDaSemana == 4) {
            System.out.println("Quarta");

        } else if (diaDaSemana == 5) {
            System.out.println("Quinta");

        } else if (diaDaSemana == 6) {
            System.out.println("Sexta");

        } else if (diaDaSemana == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Não é um dia da semana valido");
        }

        switch (diaDaSemana) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça");   break;
            case 4: System.out.println("Quarta");  break;
            case 5: System.out.println("Quinta");  break;
            case 6: System.out.println("Sexta");   break;
            case 7: System.out.println("Sabado");  break;
            default:System.out.println("Não é um dia da semana valido");
        }


    }

}

