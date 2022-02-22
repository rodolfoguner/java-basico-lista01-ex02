package br.fai.ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start() {
		Scanner scanner = new Scanner(System.in);
		double valor;
		int valorInt;
		
		System.out.print("Digite o valor do produto: ");
		
		valor = scanner.nextDouble();
		
		valorInt = (int) valor;
		
		System.out.println("Valor com casas decimais " + valor + 
				"| Valor inteiro: " + valorInt);
		
		int novoValor = 10;
		double valorConvertidoImplicitamente = novoValor;
		
		System.out.println("Novo valor: " + novoValor + "| Convertido: " 
				+ valorConvertidoImplicitamente);
	}
}
