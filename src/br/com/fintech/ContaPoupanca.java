package br.com.fintech;
import java.time.LocalDate;
public class ContaPoupanca extends Conta  {

	
	private double saldoPoupanca;
	private double taxaJuros;
	private double rendimento;
	private LocalDate data = LocalDate.of(13,03,2003 );
	
	
	/*public double calcularRendimento(double taxaJuros, double saldoPoupanca) {
		return this.saldoPoupanca=-taxaJuros;
		}*/
	
		public ContaPoupanca(double saldoInicial, double taxaDeJuros) {
				this.saldoPoupanca = saldoInicial;
				this.taxaJuros = taxaDeJuros;
			}

			public void calcularRendimento(int meses) {
				this.rendimento = saldoPoupanca * (taxaJuros / 100) * meses;
				saldoPoupanca += rendimento;
				
			}
		
			
	}
