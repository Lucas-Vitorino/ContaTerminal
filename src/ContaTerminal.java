import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
            System.out.println("Digite o numero da conta: ");
            numero= entrada.nextInt();

            System.out.println("Digite o numero da Agencia: ");
            agencia= entrada.next();

            System.out.println("Digite o nome do Cliente: ");
            nomeCliente= entrada.next();

            System.out.println("Digite o saldo: ");
            saldo= entrada.nextDouble();


            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomeCliente,agencia,numero,saldo);
        entrada.close();
    }
}
