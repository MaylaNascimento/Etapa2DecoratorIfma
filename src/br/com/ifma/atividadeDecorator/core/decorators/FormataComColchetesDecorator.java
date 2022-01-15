package br.com.ifma.atividadeDecorator.core.decorators;

public class FormataComColchetesDecorator extends FormatadorDecorator {

    public FormataComColchetesDecorator(Formatador formatador) {
        super(formatador);
    }

    @Override
    public String formata(String data) {
        return super.formata(formataComColchetes(data));
    }

    private String formataComColchetes(String data) {
        return String.format("%s%s%s", "[", data, "]");
    }
}
