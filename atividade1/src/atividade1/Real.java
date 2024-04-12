package atividade1;

/** Classe para representar os números reais.
 * @author SeuNome
 * @version 1.0
 */
public class Real {
	float r = 0f; // valor real
	
	/** Construtor padrão para criar Real com o valor 0 (zero). */
	Real()
        { 
            float r = 0f;
        }
      	
	/** Construtor para criar Real com o valor n.
	 * @param n novo valor real primitivo a ser inserido.
	 */
	Real(float n)
        { 
            r = n; 
        }
	
	/** Método para realizar a soma do valor r no presente objeto com o valor r no objeto n.
	 *  @param n o objeto Real a ser passado.
	 */
	void soma (Real n) 
        {
            r += n.r;
	}
	
	/** Método para realizar a subtração do valor r no presente objeto com o valor r no objeto n. 
	 * @param n o objeto Real a ser passado.
	 */
	void subtracao (Real n) 
        {
            r -= n.r;
	}
	
	/** Método para realizar a multiplicação do valor r no presente objeto com o valor r no objeto n. 
	 * @param n o objeto Real a ser passado.
	 */
	void multiplicacao (Real n) 
        {
            r *= n.r;
	}
	
	/** Método para realizar a divisão do valor r no presente objeto com o valor r no objeto n.
	 * @param n o objeto Real a ser passado.
	 * @implNote Divisão por zero deve avisar erro.
	 */
	void divisao (Real n) 
        {
            if (n.r == 0)
            {
                System.out.println("ERRO: Divisão por zero!");
            }
            else
            {
                r /= n.r;
            }
	}
}