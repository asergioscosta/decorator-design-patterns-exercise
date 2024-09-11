package org.hamburgueria;

public class Ovo extends HamburguerDecorator {

    public Ovo (Hamburguer hamburguer){
        super(hamburguer);
    }

    public float getCusto(){
        return 2.0f;
    }
}
