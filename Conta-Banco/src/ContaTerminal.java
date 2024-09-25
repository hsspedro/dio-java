import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, digite o seu número!");
        int number = input.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = input.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        String name = input.nextLine();
        System.out.println("Por favor, digite o valor do deposito!");
        double saldo = input.nextDouble();

        System.out.println("Olá " + name +", obrigado por criar uma conta em nosso banco, sua agência é" + agencia +", conta"+ number+ " e seu saldo" + saldo + " já está disponível para saque");

    }
}
