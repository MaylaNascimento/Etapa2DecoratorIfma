package br.com.ifma.atividadeDecorator.core.decorators;

import br.com.ifma.atividadeDecorator.core.Pizza;

public class TomatoDecorator extends CondimentDecorator {
    public TomatoDecorator(Pizza pz) {
        super(pz);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato";
    }

    @Override
    public double cost() {
        return super.cost() + 0.10;
    }
}
