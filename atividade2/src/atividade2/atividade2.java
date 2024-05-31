package atividade2;

import numero.*;

public class atividade2 {
	public static void main(String[] args) {
		Racional display = new Inteiro(7);
		Racional memoria = display;
		
		System.out.println("*************** 7 ***************");
		display.imprimeRacional();
		display.imprimeReal();
			
		display = new Racional(12,5);
		/* Subtração */
		if (display.getClass() == memoria.getClass())// verifica se pertencem à mesma classe
			memoria.subtracao(display);
		else {
				display = new Racional(display);
				memoria = new Racional(memoria);
				memoria.subtracao(display);
				// verifica se o resultado é inteiro, isto é, se denominador é unitário.
				if (memoria.denominadorUnitario()) 
					memoria = new Inteiro(memoria);
				display = memoria;		
		}
		System.out.println("*************** (7 - 12/5) ***************");
		display.imprimeRacional();
		display.imprimeReal();
		
		display = new Inteiro(5);
		/* Multiplicação */
		if (display.getClass() == memoria.getClass())// verifica se pertencem à mesma classe
			memoria.multiplicacao(display);
		else {
				display = new Racional(display);
				memoria = new Racional(memoria);
				memoria.multiplicacao(display);
				// verifica se o resultado é inteiro, isto é, se denominador é unitário.
				if (memoria.denominadorUnitario()) 
					memoria = new Inteiro(memoria);
				display = memoria;		
		}
		System.out.println("*************** (23/5 x 5) ***************");
		display.imprimeRacional();
		display.imprimeReal();
		
		display = new Inteiro(7);
		/* divisão - melhor converter tudo para racional*/
		display = new Racional(display);
		memoria = new Racional(memoria);
		memoria.divisao(display);
		// verifica se o resultado é inteiro, isto é, se denominador é unitário.
		if (memoria.denominadorUnitario())
			memoria = new Inteiro(memoria);
		display = memoria;	
		System.out.println("*************** (23 / 7) ***************");
		display.imprimeRacional();
		display.imprimeReal();
		
		display = new Inteiro(2);
		/* adicao */
		if (display.getClass() == memoria.getClass())// verifica se pertencem a mesma classe
			memoria.adicao(display);
		else {
				display = new Racional(display);
				memoria = new Racional(memoria);
				memoria.adicao(display);
				// verifica se o resultado é inteiro, isto é, se denominador é unitário.
				if (memoria.denominadorUnitario()) 
					memoria = new Inteiro(memoria);
				display = memoria;		
		}
		System.out.println("*************** (23/7 + 2) ***************");
		display.imprimeRacional();
		display.imprimeReal();
	}
}