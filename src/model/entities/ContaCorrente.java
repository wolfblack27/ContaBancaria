package model.entities;

import model.exceptions.ContaExceptions;

public class ContaCorrente extends Contabancaria {
	private Double taxaSaque;

	public ContaCorrente(Integer numeroConta, String cliente, Double balance, Double limiteConta,
			Double taxaSaque) {
		super(numeroConta, cliente, balance, limiteConta);
		this.taxaSaque = taxaSaque;
	}

	@Override
	public void deposito(Double valor) {
		super.deposito(valor);
	}

	@Override
	public void retirada(Double valor) {
		super.retirada(valor);
		balance-=(double)5.0;
		
	}

}
