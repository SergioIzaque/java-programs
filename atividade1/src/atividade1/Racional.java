package atividade1;

/** Classe para representar os números racionais.
 * @author SeuNome
 * @version 1.0
 */
public class Racional {
	int num = 0, // valor do numerador
		den = 1; // valor de denominador
	
	/** Construtor padrão para criar Racional com o valor 0/1 (zero). */
	Racional()
        { 
            int num = 0, den = 1;
        }
	
	/** Construtor para criar Racional com o valor n/d. 
	 * @param n valor inteiro primitivo para o numerador. 
	 * @param n valor inteiro primitivo para o denominador. 
	 * */
	Racional (int n, int d) 
        { 
            num = n; den = d;
        } 

	/** Método para realizar a soma do valor num/den no presente objeto com o valor num/den no objeto n. 
	 *  @param n o objeto Inteiro a ser passado.  
	 *  @implSpec Deve chamar o método arruma sinal após a operação.
	 * */
	void soma (Racional n) 
        {
            
	}
	
	/** Método para realizar a subtração do valor num/den no presente objeto com o valor num/den no objeto n.
	 *  @param n o objeto Inteiro a ser passado. 
	 *  @implSpec Deve chamar o método arruma sinal após a operação.
	 *  */
	void subtracao (Racional n) 
        {
		/* implementar */
	}
	
	/** Método para realizar a multiplicação do valor num/den no presente objeto com o valor num/den no objeto n. 
	 *  @param n o objeto Inteiro a ser passado. 
	 *  @implSpec Deve chamar o método arruma sinal após a operação.
	 *  */
	void multiplicacao (Racional n) 
        {
			/* implementar */
	}
	
	/** Método para realizar a divisão do valor num/den no presente objeto com o valor num/den no objeto n. 
	 * @param n o objeto Inteiro a ser passado.
	 * @implNote Divisão por zero deve avisar erro.
	 * @implSpec Deve chamar o método arruma sinal após a operação.
	 * */
	void divisao (Racional n) 
        {
		/* implementar */
	}
	
	/** Método para fazer sentido a existência do sinal negativo só no numerador.*/
	void arrumaSinal() 
        {
		/* implementar */
	}

	/** Método para simplificar numerador e o denominador pelo seu respectivo máximo divisor comum.
	 * @implNote Use o algoritmo de Euclides para achar o máximo divisor comum para em seguida efetuar
	 * simpliciação. */
	void simplifica() 
        {	
		/* implementar */
	}
}