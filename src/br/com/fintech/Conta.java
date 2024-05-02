package br.com.fintech;

public class Conta {

	
	/*atributos da class (conta) */
	private String tipoConta;
	private int numeroconta;
	private int agencia;
	private double saldo;
	private boolean status; 
	
	
	
	/*construtor padrao*/
	public Conta() {}
	
	/*construtor*/
	public Conta(int numeroconta, int agencia, double saldo ) {
		
		this.numeroconta = numeroconta;
		this.agencia = agencia;
		this.saldo = saldo;	
	}
	
	
	
	/*metodo GET(retorna o numero da conta) */
	public int getNumeroconta() {
		return numeroconta;
	}
	/*metodo SET(atera um valor)*/
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	/*METODOS//FUNÇÕES*/
	public void depositarSaldo(double valor){
		this.saldo=+valor;
	}
	
	public void sacarSaldo(double valor) {
		this.saldo -= valor;
	}
	
	public void transferirSaldo(double valor) {
		this.saldo -= valor;
	}
	
	public void StatusSaldo(boolean status) {
		this.status = status;
	}

	
}

/*
 * public StatusSaldo(boolean initialStatus) {
        this.status = initialStatus;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean newStatus) {
        this.status = newStatus;
    }*/




/*public Conta(int agencia, int numero, double saldo) {
	
	this.agencia = agencia;
	this.numero = numero;
	this.saldo = saldo;
}*/