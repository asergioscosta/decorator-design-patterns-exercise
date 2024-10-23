package org.cafeteria;

public class Latte extends CafeteriaDecorator {

    public Latte(Cafeteria cafeteria) {
        super(cafeteria);
    }

    public float getCusto() {
        return 1.5f;
    }
}
