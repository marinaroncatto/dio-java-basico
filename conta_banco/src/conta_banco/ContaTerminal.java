package conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO: Conhecer e importar a classe Scanner
		
		//Exibir as mensagens para o nosso usuário
		
		//Obter pela classe Scanner os valores digitados no terminal
		
		//Exibir a mensagem de conta criada
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta!");
		int numero = sc.nextInt();
		
		System.out.println("Informe código da Agência:");
		sc.nextLine();
		String agencia = sc.nextLine();
		
		System.out.println("Qual o nome do cliente?");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Informe o saldo: ");
		double saldo = sc.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco,"
				+ " sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");	
		
		sc.close();
	}

}
