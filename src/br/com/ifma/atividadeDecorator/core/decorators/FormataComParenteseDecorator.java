package br.com.ifma.atividadeDecorator.core.decorators;

public class FormataComParenteseDecorator extends FormatadorDecorator {

    public FormataComParenteseDecorator(Formatador formatador) {
        super(formatador);
    }

    @Override
    public String formata(String data) {
        return super.formata(formataComParenteses(data));
    }

    private String formataComParenteses(String data) {
        return  String.format("%s%s%s", "(", data, ")");
    }
}
