package Aplication;

import java.util.Scanner;

import model.entities.ContaCorrente;
import model.exceptions.ContaExceptions;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Numero da Conta: ");
			Integer numeroConta = sc.nextInt();
			System.out.println("");

			System.out.print("Cliente da Conta: ");
			String cliente = sc.next();
			System.out.println("");

			System.out.print("Saldo Inicial da Conta: ");
			Double balance = (double) sc.nextDouble();
			System.out.println("");

			System.out.print("Limite de Saque: ");
			Double limiteConta = (double) sc.nextDouble();
			System.out.println("");
			ContaCorrente cc = new ContaCorrente(numeroConta, cliente, balance, limiteConta, 5.0);
			System.out.println(cc);
			cc.retirada(100.0);
			System.out.println(cc);

		} catch (ContaExceptions e) {
			System.out.println("Erro: " + e.getMessage());

		} finally {

			sc.close();
		}

	}

}
