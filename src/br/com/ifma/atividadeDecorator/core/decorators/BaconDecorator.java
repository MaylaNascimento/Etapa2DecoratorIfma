package br.com.ifma.atividadeDecorator.core.decorators;

import br.com.ifma.atividadeDecorator.core.Pizza;

public class BaconDecorator extends CondimentDecorator{
    public BaconDecorator(Pizza pz) {
        super(pz);
    }

    public String getDescription() {
        return super.getDescription() + ", Bacon";
    }

    @Override
    public double cost() {
        return super.cost() + 0.80;
    }
}
