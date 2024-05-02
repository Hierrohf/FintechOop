package br.com.fintech;

public class FintechTeste {

	public static void main(String[] args) {
				/*instanciando objetos*/
		
				Conta contaCorrente = new Conta();
				Conta contaPoupanca = new Conta();
				Conta contaInvestimanto = new Conta();
				
				/*Utilizandos os metodos(metodos sao funçoes de uma class)*/
				contaCorrente.depositarSaldo(1000);
				contaPoupanca.depositarSaldo(2000);
				contaInvestimanto.depositarSaldo(3000);
				
				/*utilizando setNumeroconta() E setagencia() (metodo da class Conta) 
				 * para adicionar ou modificar o numero da conta e u numero da agencia*/
				contaCorrente.setNumeroconta(1111);
				contaCorrente.setAgencia(10101010);
				
				contaPoupanca.setNumeroconta(2222);
				contaPoupanca.setAgencia(20202020);
				
				contaInvestimanto.setNumeroconta(3333);
				contaInvestimanto.setAgencia(30303030);
				
				
				System.out.println("------------Dados da Conta------------");
				System.out.println("Numero da Conta Corrente: "+contaCorrente.getNumeroconta()+
						" | Numero da Agencia "+contaCorrente.getAgencia());
				
				System.out.println("Numero da Conta Poupança: "+contaPoupanca.getNumeroconta()+
						" | Numero da Agencia "+contaPoupanca.getAgencia());
				
				System.out.println("Numero da Conta Investimento: "+contaInvestimanto.getNumeroconta()+
						" | Numero da Agencia "+contaInvestimanto.getAgencia());
				
				System.out.println();
				
				System.out.println("------------Saldos de cada Conta------------");
				System.out.println("Conta Corente esta com o saldo de : $"+contaCorrente.getSaldo());
				System.out.println("Conta Poupança esta com um saldo de: $"+contaPoupanca.getSaldo());
				System.out.println("Conta de Investimentos esta com um saldo de: $"+contaInvestimanto.getSaldo());
				
				if(100 < contaCorrente.getSaldo()) {
					contaCorrente.sacarSaldo(100);
					System.out.println("Saque feito com Sucesso!");
					
				}
				else {
					System.out.println("Saldo insuficiente");
					
				}
				
				System.out.println("Saldo da da Conta: $"+contaCorrente.getSaldo());
				
			}
	}
	

