package aplicativo;

import java.util.Locale;
import java.util.Scanner;
import entidade.Conta;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("insira o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("insira o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("tem deposito inical? [s/n]: ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("digite o valor do deposito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(conta);

		System.out.println();
		System.out.print("insira o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("dados atualizados da conta:");
		System.out.println(conta);
		System.out.println("");

		System.out.print("insira o valor de saque: ");
		double valorsaque = sc.nextDouble();
		conta.saque(valorsaque);
		System.out.println();
		System.out.println("dados atualizados da conta:");
		System.out.println(conta);

		sc.close();
	}
}
