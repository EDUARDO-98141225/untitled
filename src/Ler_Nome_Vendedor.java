import java.util.Scanner;
public class Ler_Nome_Vendedor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeVendedor;
        double salarioFixo;
        double totalVendas;        // total de vendas no mes
        double comissao;
        double salarioFinalDoMes;

        System.out.print("Digite o nome do vendedor: ");
        nomeVendedor = input.nextLine();

        System.out.print("Digite o salario fixo do vendedor: ");
        salarioFixo = input.nextDouble();

        System.out.print("Digite o total de vendas efetuadas no mes: ");
        totalVendas = input.nextDouble();

        comissao = (totalVendas * 15) / 100;

        salarioFinalDoMes = comissao + salarioFixo;

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salario fixo: " + salarioFixo + "reais");
        System.out.println("Salario final do mes: " + salarioFinalDoMes + "reais");

    }
}
