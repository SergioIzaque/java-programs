package atividade1;

/** Classe para representar os números inteiros.
 * @author Sérgio Izaque
 * @version 1.0
 */
public class Inteiro {
	int i = 0;
	
	/** Construtor padrão para criar Inteiro com o valor 0 (zero). */
	Inteiro()
        {
            int i = 0;
        }
	
	/** Construtor para criar Real com o valor n. 
	 * @param n novo valor inteiro primitivo a ser inserido.
	 * */
	Inteiro(int n)
        { 
            this.i = n; 
        }

	/** Método para realizar a soma do valor i no presente objeto com o valor i no objeto n. 
	 * @param n o objeto Inteiro a ser passado.
	 * */
	void soma (Inteiro n) 
        {
            this.i += n.i;
	}
	
	/** Método para realizar a subtração do valor i no presente objeto com o valor i no objeto n.
	 *  @param n o objeto Inteiro a ser passado. 
	 *  */
	void subtracao (Inteiro n) 
        {
            this.i -= n.i;
	}
	
	/** Método para realizar a multiplicação do valor i no presente objeto com o valor i no objeto n. 
	 * @param n o objeto Inteiro a ser passado. 
	 * */
	void multiplicacao (Inteiro n) 
        {
            this.i *= n.i;
	}
	
	/** Método para realizar a divisão do valor i no presente objeto com o valor i no objeto n.
	 * @param n o objeto Inteiro a ser passado.
	 * @implNote Divisão por zero deve avisar erro.
	 * @implSpec nem toda divisão por inteiros fornece valor inteiro. Assim, certifique-se antes se a 
	 * divisão fornece o valor inteiro, e caso não seja possível, sinalize com a mensagem de texto: "Resultado 
	 * não inteiro (é Racional)!"
	 * */
	void divisao (Inteiro n) 
        {		
            if (n.i == 0)
            {
                System.out.println("ERRO: Divisão por zero!");
            }
            else if (i%n.i == 0)
            {
                this.i /= n.i;
            }
            else 
            {
                System.out.println("Resultado não inteiro (é Racional)!");
            }
            
        }
}