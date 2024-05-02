package br.com.fintech;

import java.time.LocalDate;

public class CartaoCredito extends Conta {

	
	private double limiteCredito;
	/*private double limiteDisponivel;*/
	private LocalDate dataVencimento = LocalDate.of(12,01,2002);
	
	public void pagamentoCredito(double valor) {
		if(limiteCredito >= valor) {
		this.limiteCredito=-valor;
		}
		else{
			System.out.println("Sem limite! ");
		}
		}
	}

