package org.cafeteria;

public class Espresso extends CafeteriaDecorator {

    public Espresso(Cafeteria cafeteria) {
        super(cafeteria);
    }

    public float getCusto() {
        return 2.0f;
    }
}
