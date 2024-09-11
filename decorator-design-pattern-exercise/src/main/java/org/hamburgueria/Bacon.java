package org.hamburgueria;

public class Bacon extends HamburguerDecorator {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    public float getCusto(){
        return 4.0f;
    }
}
