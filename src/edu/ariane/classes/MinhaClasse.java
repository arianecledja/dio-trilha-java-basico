package edu.ariane.classes;

public class MinhaClasse {
	public static void main(String[] args) {
		int _ano = 2022; // o nome pode iniciar com letras, _ ou $
		_ano = 2023;
		
		String primeiroNome = "Ariane";
		String segundoNome = "Santos";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		
		boolean verdadeira = true;
		
		final String BR = "Brasil"; // não pode mudar o valor
		
		System.out.println("Olá turma, sejam bem-vindos");
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return "Resultado do método: "+  primeiroNome.concat(" ").concat(segundoNome);
	}
}
