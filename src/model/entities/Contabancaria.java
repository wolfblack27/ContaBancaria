/**
 * 
 */
package model.entities;

import model.exceptions.ContaExceptions;

/**
 * 
 */
public abstract class Contabancaria {
	private Integer numeroConta;
	private String cliente;
	protected Double balance;
	private Double limiteConta;
	
	public Contabancaria(Integer numeroConta, String cliente, Double balance, Double limiteConta) {
		
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.balance = balance;
		this.limiteConta=limiteConta;
		
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(Double limiteConta) {
		this.limiteConta = limiteConta;
	}
	public Double getBalance() {
		return balance;
	}

	public abstract void deposito(Double valor);
	
	
	public void retirada(Double valor) {
		if (valor<balance && balance>0) {
			balance-=valor;
				
			
		}else {
			
			throw new ContaExceptions("Valor do saldo menor que o valor solicitado");
		}
		
		
	}

	@Override
	public String toString() {
		return "Contabancaria [numeroConta=" + numeroConta + ", cliente=" + cliente + ", balance=" + balance
				+ ", limiteConta=" + limiteConta + "]";
	}


	
	


}


