package org.hamburgueria;

public abstract class HamburguerDecorator implements Hamburguer {

    private Hamburguer hamburguer;

    public HamburguerDecorator(Hamburguer hamburguer){
        this.hamburguer = hamburguer;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public abstract float getCusto();

    public float getCustoAdicional(){
        return this.hamburguer.getCustoAdicional() + (this.getCusto());
    }
}
