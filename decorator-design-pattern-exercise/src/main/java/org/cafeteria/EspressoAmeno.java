package org.cafeteria;

public class EspressoAmeno extends CafeteriaDecorator {

    public EspressoAmeno(Cafeteria cafeteria) {
        super(cafeteria);
    }

    public float getCusto() {
        return 1.5f;
    }

}
