package br.com.meuprojeto.banco;

public class Conta {
	
	//Atributos
	private String numero;
	private float saldo;
	
	//Construtor
	public Conta (String numeroInicial, float saldoInicial){
	    
	  numero = numeroInicial;
	  saldo = saldoInicial;
	}
	
	//Métodos
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	  public void debitar (float valor){
	    
	    saldo -= valor;
	  }
	    
	  public void creditar (float valor){
	    
	    saldo += valor;
	  }
	  

	  public static void main (String [] args){
		  
		Conta contas[]= new Conta[100];
		
		contas[0] = new Conta("123456-8", 1500);
		System.out.println(contas[0].getSaldo());
		
		contas[1] = new Conta("125123-9", 1200);
		contas[1].creditar(3000);
		System.out.println(contas[1].getSaldo());
		
		UtilitarioContas uc = new UtilitarioContas();
		
		uc.imprimirContas(contas);
		uc.somaSaldo(contas);
;	    
		
		/*Conta c = new Conta("123456-7", 2500);
	    
	    c.setSaldo(200);
	    System.out.println("Saldo atual: " + c.getSaldo());
	    c.creditar(100);
	    System.out.println("Saldo após o crédito: " + c.getSaldo());
	    c.setNumero("123-4");
	    System.out.println("Número da conta: " + c.getNumero());
	    
	    /*int [] a = new int [100];
	    
	    for(int i = 0; i<a.length; i+= 2) {
	    	
	    	a[i] = i;
	    }
	    
	    System.out.println(a[]);*/
	    
	  }
	  
	  

}
