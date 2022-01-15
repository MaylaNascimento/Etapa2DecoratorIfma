package br.com.ifma.atividadeDecorator.core;

public abstract class Pizza {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return String.format("%s --- %,.1f", description, cost());
    }
}
