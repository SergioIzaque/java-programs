package numero;

public class Inteiro extends Racional 
{

    public Inteiro() 
    {
        this(0);
    }

    public Inteiro(int valor) 
    {
        super(valor, 1);
    }

    public Inteiro(Racional n) 
    {
        super(n.numerador, n.denominador);
        if (!denominadorUnitario()) 
        {
            System.out.println("O denominador não é unitário");
        }
    }

    @Override
    public void imprimeRacional() 
    {
        System.out.println(this.numerador);
    }

    @Override
    public void adicao(Racional n) 
    {
        super.adicao(n);
        if (denominadorUnitario()) 
        {
            this.numerador = this.numerador;
            this.denominador = 1;
        }
    }

    @Override
    public void subtracao(Racional n) 
    {
        super.subtracao(n);
        if (denominadorUnitario()) 
        {
            this.numerador = this.numerador;
            this.denominador = 1;
        }
    }

    @Override
    public void multiplicacao(Racional n) 
    {
        super.multiplicacao(n);
        if (denominadorUnitario()) 
        {
            this.numerador = this.numerador;
            this.denominador = 1;
        }
    }

    @Override
    public void divisao(Racional n) 
    {
        super.divisao(n);
        if (denominadorUnitario()) 
        {
            this.numerador = this.numerador;
            this.denominador = 1;
        }
    }
}
