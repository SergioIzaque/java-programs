package numero;

public abstract class Real 
{
    protected float valor;

    public Real() {
        this.valor = 0;
    }

    public Real(float valor) 
    {
        this.valor = valor;
    }

    public void imprimeReal() 
    {
        System.out.println(this.valor);
    }
}
