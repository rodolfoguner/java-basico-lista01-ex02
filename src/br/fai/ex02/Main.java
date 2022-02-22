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
		
		System.out.print("\nValor com casas decimais " + valor);
		System.out.print("| Valor inteiro: " + valorInt);
		
	}
}
