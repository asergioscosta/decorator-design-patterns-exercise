package org.hamburgueria;

public class Presunto extends HamburguerDecorator {

    public Presunto (Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getCusto(){
        return 1.5f;
    }
}
