package br.com.ifma.atividadeDecorator.core.decorators;

import br.com.ifma.atividadeDecorator.core.Pizza;

public class OreganoDecorator extends CondimentDecorator {
    public OreganoDecorator(Pizza pz) {
        super(pz);
    }

    public String getDescription() {
        return super.getDescription() + ", Oregano";
    }

    @Override
    public double cost() {
        return super.cost() + 0.50;
    }
}
