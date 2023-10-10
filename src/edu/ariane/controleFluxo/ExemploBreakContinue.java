package edu.ariane.controleFluxo;

public class ExemploBreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for( int numero = 1; numero <= 5; numero++) {
			if(numero == 3)
				break; // interrompe aqui
				//continue interrompe uma interação e o restante continua.
			System.out.println(numero);
		}

	}

}
