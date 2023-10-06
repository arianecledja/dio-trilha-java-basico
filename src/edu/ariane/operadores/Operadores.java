package edu.ariane.operadores;

public class Operadores {
	public static void main(String[] args) {
		// operador de atribuição =
		int numero = 5;
		boolean variavel = true;
		int a, b;
		a = 5;
		b = 6;
		String nomeUm = "GLEYSON";
		String nomeDois = new String("GLEYSON");
		boolean condicao1 = true;
		boolean condicao2 = false;

		// operadores unários
		numero = -numero;
		System.out.println(numero);
		numero = numero * -1;
		System.out.println(numero);

		// incremento e decremento
		numero++;
		System.out.println(numero++);
		System.out.println(numero);

		System.out.println(!variavel);

		//operador ternário
		String resultado = a==b ? "verdadeiro" : "falso";
		System.out.println(resultado);

		//operadores relacionais == != > >= < <=
		boolean simNao = a == b;
		System.out.println(" a é igual a b? " + simNao);
		System.out.println(nomeUm == nomeDois);
		System.out.println(nomeUm.equals(nomeDois));

		// operadores lógicos && || 
		if(condicao1 && (7 > 4)) {
			System.out.println("As duas condições são verdadeiras");
		}
		if(condicao1 || condicao2) {
			System.out.println("Uma das condições é verdadeira");
		}

	}

}
