package org.hamburgueria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburguerTest {

    @Test
    void deveRetornarValorHamburguer(){
        Hamburguer hamburguer = new HamburguerPadrao(10.0f);

        assertEquals(10.0f, hamburguer.getCustoAdicional());
    }

    @Test
    void deveRetornarValorHamburguerComOvo(){
        Hamburguer hamburguer = new Ovo(new HamburguerPadrao(10.0f));

        assertEquals(12.0f, hamburguer.getCustoAdicional());
    }

    @Test
    void deveRetornarValorHamburguerComQueijo(){
        Hamburguer hamburguer = new Queijo(new HamburguerPadrao(10.0f));

        assertEquals(11.5f, hamburguer.getCustoAdicional());
    }

    @Test
    void deveRetornarValorHamburguerComPresunto(){
        Hamburguer hamburguer = new Presunto(new HamburguerPadrao(10.0f));

        assertEquals(11.5f, hamburguer.getCustoAdicional());
    }

    @Test
    void deveRetornarValorHamburguerComBacon(){
        Hamburguer hamburguer = new Bacon(new HamburguerPadrao(10.0f));

        assertEquals(14.0f, hamburguer.getCustoAdicional());
    }

    @Test
    void deveRetornarValorHamburguerComTodosComplementos(){
        Hamburguer hamburguer = new Bacon(new Presunto(new Queijo(new Ovo(new HamburguerPadrao(10.0f)))));

        assertEquals(19.0f, hamburguer.getCustoAdicional());
    }
}