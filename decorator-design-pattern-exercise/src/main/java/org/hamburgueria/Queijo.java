package org.hamburgueria;

public class Queijo extends HamburguerDecorator{

    public Queijo (Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getCusto(){
        return 1.5f;
    }

}
