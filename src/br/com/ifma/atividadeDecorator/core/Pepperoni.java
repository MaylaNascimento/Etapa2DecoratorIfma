package br.com.ifma.atividadeDecorator.core;

public class Pepperoni extends Pizza {
    public Pepperoni() {
        setDescription("Peperoni Pizza");
    }

    public double cost() {
        return 14.90;
    }
}
