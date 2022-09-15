package CursoJavaLoiane;
import java.util.Scanner;


public class SomaDeDoisNumeros_2_15_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();

        sum = number1 + number2;
        System.out.printf("O resultado é " + sum);

    }
}
