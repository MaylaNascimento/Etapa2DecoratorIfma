package br.com.ifma.atividadeDecorator.core.decorators;

public class FormatadorDecorator implements Formatador {
    private Formatador formatador;

    public FormatadorDecorator(Formatador formatador) {
        this.formatador = formatador;
    }

    @Override
    public String formata(String formato) {
        return formatador.formata(formato);
    }


}
