package br.com.ifma.atividadeDecorator.core.decorators;

public class FormataBaseDecorator implements Formatador {

    @Override
    public String formata(String data) {
        return formataBase(data);
    }

    private String formataBase(String data) {
        return String.format("Problema - \"%s\"", data);
    }
}
