package br.com.ifma.atividadeDecorator.core.decorators;

import br.com.ifma.atividadeDecorator.core.Pizza;

public abstract class CondimentDecorator extends Pizza  {
    protected Pizza decoratedPizza;

    public CondimentDecorator(Pizza pz) {
        this.decoratedPizza = pz;
    }

    public double cost() {
        return decoratedPizza.cost();
    }

    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public String toString() {
        return  getDescription() + " --- " + cost();
    }
}
