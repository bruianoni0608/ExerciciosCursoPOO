package br.com.meuprojeto.banco;

public class UtilitarioContas {
	
	//Metodos
	
	public void imprimirContas(Conta contas[]) {
		
		for (int i=0; i<contas.length; i++ ) {
			
			if(contas[i]!= null) {
			
				System.out.println("Numero da Conta: " + contas[i].getNumero() + " Saldo: " + contas[i].getSaldo());
			}
		}
	}
	
	public void somaSaldo(Conta contas[]) {
		
		float soma = 0;
		
		for (int i=0; i<contas.length; i++) {
			
			if(contas[i]!= null) {
			
			soma+= contas[i].getSaldo();
			}
		
		}
		
		System.out.println("Soma dos Saldos: " + soma);
	}

}
