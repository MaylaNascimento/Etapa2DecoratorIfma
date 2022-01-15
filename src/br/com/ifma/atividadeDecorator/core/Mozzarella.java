package br.com.ifma.atividadeDecorator.core;

import br.com.ifma.atividadeDecorator.core.Pizza;

public class Mozzarella extends Pizza {
    public Mozzarella() {
        setDescription("Mozzarella Pizza");
    }


    public double cost() {
        return 11.9;
    }
}
