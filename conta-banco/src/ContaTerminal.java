import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo o número da conta
        System.out.println("Por favor, digite o numero da conta:");
        int numero = scanner.nextInt();

        // Consumir a linha nova deixada pelo nextInt()
        scanner.nextLine();

        // Solicitando e lendo a agência
        System.out.println("Por favor, digite o numero da agencia:");
        String agencia = scanner.nextLine();

        // Solicitando e lendo o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitando e lendo o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Fechando o scanner
        scanner.close();

        // Mensagem final
        String mensagem = String.format("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque.", 
                                        nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem); 
    }
}
