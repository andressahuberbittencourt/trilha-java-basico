import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat arredondar = new DecimalFormat("0.00");

        //Variaveis Locais
        int numeroConta;
        String agencia, nomeCliente;
        double saldo = 100.00;

        //Lógica
        System.out.print("Digite seu nome: ");
        nomeCliente = teclado.nextLine();
        System.out.print("Digite o número da agência: ");
        agencia = teclado.nextLine();
        System.out.print("Digite o número da sua conta: ");
        numeroConta = teclado.nextInt();

        System.out.println("------------------------");
        System.out.println("   Seja bem-vindo(a)!   ");
        System.out.println("------------------------");

        System.out.println("Caro cliente " + nomeCliente + ", obrigada por criar uma conta conosco! Sua agência é: " + agencia + ", o número da sua conta é: " + numeroConta + " e o saldo disponível para saque é de " + arredondar.format(saldo) + " reais.");
    }
}
