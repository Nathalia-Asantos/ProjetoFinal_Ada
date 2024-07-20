import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("=== Calculadora de Salário ===");
            System.out.println("Digite o salário que deseja calcular:");
            double salarioBruto = sc.nextDouble();

            double inss = calculaInss(salarioBruto);
            double salarioBase = salarioBruto - inss;
            double impostoRenda = calculaImpostoRenda(salarioBase);
            double salarioLiquido = salarioBruto - inss - impostoRenda;

            System.out.println("===============");
            System.out.println("Salário Bruto: " + salarioBruto);
            System.out.println("Desconto INSS: " + inss);
            System.out.println("Desconto Imposto de Renda: " + impostoRenda);
            System.out.println("---------------");
            System.out.println("Salário Líquido: " + salarioLiquido);
            System.out.println("===============");
        }
        sc.close();
    }

     // Calcula desconto INSS
    private static double calculaInss(double salarioBruto) {
        double descontoInss = 0;
        if (salarioBruto > 0 && salarioBruto <= 1212.00) {
            descontoInss = salarioBruto * 0.075;
        } else if (salarioBruto > 1212.01 && salarioBruto <= 2427.35) {
            descontoInss = salarioBruto * 0.09;
        } else if (salarioBruto > 2427.36 && salarioBruto <= 3641.03) {
            descontoInss = salarioBruto * 0.12;
        } else {
             descontoInss = salarioBruto * 0.14;
        }
        return descontoInss;
    }

    // Calcula desconto imposto de renda
    private static double calculaImpostoRenda(double salarioBruto) {
        double descontoImpostoRenda = 0;
        if (salarioBruto > 0 && salarioBruto <= 1903.98) {
            descontoImpostoRenda = salarioBruto * 0;
        } else if (salarioBruto > 1903.99 && salarioBruto <= 2826.65) {
            descontoImpostoRenda = salarioBruto * 0.075;
        } else if (salarioBruto > 2826.66 && salarioBruto <= 3751.05) {
            descontoImpostoRenda = salarioBruto * 0.15;
        } else if (salarioBruto > 3751.06 && salarioBruto <= 4664.68) {
            descontoImpostoRenda = salarioBruto * 0.225;
        } else {
             descontoImpostoRenda = salarioBruto * 0.227;
        }
        return descontoImpostoRenda;
    }
}
