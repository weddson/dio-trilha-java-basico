import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Definição das variáveis que serão utilizadas        
        Scanner scan = new Scanner(System.in);

        // Inicio do recebimento de dados do terminal
        System.out.println("Olá, te pedirei alguns dados para realizar a abertura da sua conta!");
        System.out.println("Por favor, digite o número da conta:");
        int contaBanco = scan.nextInt();
        scan.nextLine();
        
        
        System.out.println("Por favor, digite o número da agência:");
        String agenciaConta = scan.nextLine();
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scan.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial:");
        double saldoConta = scan.nextDouble();
        scan.close();
        
        System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " +  contaBanco + " e seu saldo " +  saldoConta + " já está disponível para saque");
    }
}
