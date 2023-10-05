
package edu.ariane.tiposvariaveis;

public class TiposVariaveis {
	// tipos primitivos
	byte idade = 123;
	short ano = 2023;
	int cep = 2107333;
	long cpf = 12345678900L;
	float pi = 3.14F;
	double salarioMinimo = 1320.00;
		
	// converter
	short numeroCurto = 1;
	int numeroNormal = numeroCurto;
	short numeroCurto2 = (short) numeroNormal;

	// constante
	final double VALOR_DE_PI = 3.14;
	
	// classe String
	String nome = "Ariane";
}