package numero;

public class Racional extends Real implements operacaoAritmetica {
    protected int numerador;
    protected int denominador;

    public Racional() 
    {
        this(0, 1);
    }

    public Racional(int numerador, int denominador) 
    {
        super((float) numerador / denominador);
        this.numerador = numerador;
        this.denominador = denominador;
        arrumaSinal();
        simplifica();
    }

    public Racional(Racional n) 
    {
        this(n.numerador, n.denominador);
    }

    public void imprimeRacional() 
    {
        System.out.println(this.numerador + "/" + this.denominador);
    }

    public void arrumaSinal() 
    {
        if (this.denominador < 0) 
        {
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    public void simplifica() 
    {
        int gcd = gcd(numerador, denominador);
        this.numerador /= gcd;
        this.denominador /= gcd;
    }

    private int gcd(int a, int b) 
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public boolean denominadorUnitario() 
    {
        return this.denominador == 1;
    }

    @Override
    public void adicao(Racional n) 
    {
        this.numerador = this.numerador * n.denominador + n.numerador * this.denominador;
        this.denominador *= n.denominador;
        simplifica();
        arrumaSinal();
        this.valor = (float) this.numerador / this.denominador;
    }

    @Override
    public void subtracao(Racional n) 
    {
        this.numerador = this.numerador * n.denominador - n.numerador * this.denominador;
        this.denominador *= n.denominador;
        simplifica();
        arrumaSinal();
        this.valor = (float) this.numerador / this.denominador;
    }

    @Override
    public void multiplicacao(Racional n) 
    {
        this.numerador *= n.numerador;
        this.denominador *= n.denominador;
        simplifica();
        arrumaSinal();
        this.valor = (float) this.numerador / this.denominador;
    }

    @Override
    public void divisao(Racional n) 
    {
        if (n.numerador == 0) 
        {
            System.out.println("Divisão por zero");
        }
        this.numerador *= n.denominador;
        this.denominador *= n.numerador;
        simplifica();
        arrumaSinal();
        this.valor = (float) this.numerador / this.denominador;
    }
}
