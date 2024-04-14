package atividade1;
/* Semana 2 */

/** Classe para efetuar os testes da Atividade 1.
 * @author Sérgio Izaque
 * @version 1.0
 */
public class Atividade1 {
	public static void main(String[] args) {
		/*----- Testa número real -----*/
                
                System.out.println("Reais:\n");
                
		Real num1 = new Real();
		num1.soma(new Real(4f));
		System.out.println(num1.r); // 4.0
		num1.divisao(new Real(9f));
		System.out.println(num1.r); // 0.44444445
                
                System.out.println("");
		
		/*----- Testa número racional -----*/
                
                System.out.println("Racionais\n");
                
		Racional num2= new Racional();
		num2.subtracao(new Racional(3,6));
		System.out.println(num2.num + "/" + num2.den); // -3/6
		num2.simplifica();
		System.out.println(num2.num + "/" + num2.den); // -1/2
		num2.soma(new Racional(7,14));
		System.out.println(num2.num + "/" + num2.den); // 0/28
		num2.simplifica();
		System.out.println(num2.num + "/" + num2.den); // 0/1
		
                System.out.println("");
                
		/*----- Testa número inteiro -----*/
                
                System.out.println("Inteiros:\n");
                
		Inteiro num3 = new Inteiro(7);
		System.out.println(num3.i); // 7
		num3.divisao(new Inteiro());// ERRO: Divisão por zero!
		num3.multiplicacao(new Inteiro(3)); 
		System.out.println(num3.i); // 21
		num3.divisao(new Inteiro(2)); // Resultado não inteiro (é Racional)!
		System.out.println(num3.i); // 21
                
                System.out.println("");
                
	}
}
