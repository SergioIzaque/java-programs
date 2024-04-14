package atividade1;

/** Classe para representar os números racionais.
 * @author Sérgio Izaque
 * @version 1.0
 */
public class Racional {
	int num = 0; // valor do numerador
        int den = 1; // valor de denominador
	
	/** Construtor padrão para criar Racional com o valor 0/1 (zero). */
	Racional()
        { 
            int num = 0;
            int den = 1;
        }
	
	/** Construtor para criar Racional com o valor n/d. 
	 * @param n valor inteiro primitivo para o numerador. 
	 * @param n valor inteiro primitivo para o denominador. 
	 * */
	Racional (int n, int d) 
        { 
            num = n; 
            den = d;
        } 

	/** Método para realizar a soma do valor num/den no presente objeto com o valor num/den no objeto n. 
	 *  @param n o objeto Inteiro a ser passado.  
	 *  @implSpec Deve chamar o método arruma sinal após a operação.
	 * */
	void soma (Racional n) 
        {
            this.num = (this.num * n.den) + (n.num * this.den);
            this.den *= n.den;
            arrumaSinal();
        }
	
	/** Método para realizar a subtração do valor num/den no presente objeto com o valor num/den no objeto n.
	 *  @param n o objeto Inteiro a ser passado. 
	 *  @implSpec Deve chamar o método arruma sinal após a operação.
	 *  */
	void subtracao (Racional n) 
        {
            this.num = (this.num * n.den) - (n.num * this.den);
            this.den *= n.den;
            arrumaSinal();
	}
	
	/** Método para realizar a multiplicação do valor num/den no presente objeto com o valor num/den no objeto n. 
	 *  @param n o objeto Inteiro a ser passado. 
	 *  @implSpec Deve chamar o método arruma sinal após a operação.
	 *  */
	void multiplicacao (Racional n) 
        {
            this.num *= n.num;
            this.den *= n.den;
            arrumaSinal();
	}
	
	/** Método para realizar a divisão do valor num/den no presente objeto com o valor num/den no objeto n. 
	 * @param n o objeto Inteiro a ser passado.
	 * @implNote Divisão por zero deve avisar erro.
	 * @implSpec Deve chamar o método arruma sinal após a operação.
	 * */
	void divisao (Racional n) 
        {
            if (n.num == 0)
            {
                System.out.println("ERRO: Divisão por zero!");
            }
            this.num *= n.den;
            this.den *= n.num;
            arrumaSinal();
	}
	
	/** Método para fazer sentido a existência do sinal negativo só no numerador.*/
	void arrumaSinal() 
        {
            if (this.den < 0) {
                this.den *= -1;
                this.num *= -1;
            }
	}

	/** Método para simplificar numerador e o denominador pelo seu respectivo máximo divisor comum.
	 * @implNote Use o algoritmo de Euclides para achar o máximo divisor comum para em seguida efetuar
	 * simpliciação. */
	void simplifica() 
        {	
            int numAbs = (this.num < 0) ? -this.num : this.num;
            int denAbs = (this.den < 0) ? -this.den : this.den;
            int mdc = calcularMDC(numAbs, denAbs);
            this.num /= mdc;
            this.den /= mdc;
        }

        int calcularMDC(int a, int b) {
            while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
            }   
            return a;
	}
}