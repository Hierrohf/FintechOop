package br.com.fintech;

public class ContaInvestimento extends Conta {
	
	
	private double totalInvestimento;
	private String tipoInvestimento;
	/*private int quantidadeInvestimento;*/
	/*private int rendimentoInvestimento;*/
	
	public void realizarInvestimento(double valor) {
		this.totalInvestimento =- valor;
	}
}
/*	public void depositarSaldo(double valor){
		this.saldo=+valor;
	}*/