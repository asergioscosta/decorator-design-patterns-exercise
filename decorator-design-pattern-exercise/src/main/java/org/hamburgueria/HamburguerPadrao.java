package org.hamburgueria;

public class HamburguerPadrao implements Hamburguer{

    public float custoAdicional;

    public HamburguerPadrao(){}

    public HamburguerPadrao(float custoAdicional){
        this.custoAdicional = custoAdicional;
    }

    @Override
    public float getCusto() {
        return 0;
    }

    public float getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(float custoAdicional) {
        this.custoAdicional = custoAdicional;
    }
}
