package br.com.ifma.atividadeDecorator.core.decorators;

import br.com.ifma.atividadeDecorator.core.Pizza;

public class CreamCheeseEdgeDecorator extends CondimentDecorator{
    public CreamCheeseEdgeDecorator(Pizza pz) {
        super(pz);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", CreamcheeseEdge";
    }

    @Override
    public double cost() {
        return super.cost() + 1.20;
    }
}
