package resumo;

import java.util.Locale;
import java.util.Scanner;

import entities2.ContaBanco;

public class ProgramAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaBanco conta;

		System.out.println("Olá, Digite o numero da conta: ");
		int numerAccount = sc.nextInt();
		sc.nextLine();
		System.out.println("Olá, Digite o nome do titular da conta: ");
		String nome = sc.nextLine();
		System.out.println("Deseja fazer um deposito inicial ? S/N");
		char sn = sc.next().charAt(0);
		if (sn == 's' || sn == 'S') {
			System.out.println("Digite o valor inicial:");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBanco(numerAccount, nome, depositoInicial);

		} else {
			conta = new ContaBanco(numerAccount, nome);
		}

		System.out.println(conta.toString());

		int opcao = 1;

		while (opcao > 0 && opcao < 3) {
			System.out.println("Posso ajudar mais em algo ?\n1.Deposito\n2.Saque\n3.Não");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Qual valor deseja depositar ?");
				double deposit = sc.nextDouble();
				conta.deposit(deposit);
				break;
			case 2:
				System.out.println("Qual valor deseja sacar2 ?");
				double withdraw = sc.nextDouble();
				conta.withdraw(withdraw);
				break;
			default:
				System.out.println("Volte Sempre");
				break;

			}

		}

		sc.close();

	}

}
