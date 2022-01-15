package br.com.ifma.atividadeDecorator.core;

import br.com.ifma.atividadeDecorator.core.decorators.*;

import java.util.Objects;

public class NumeroUm {

    private Object data;

    public NumeroUm(Object data) {
        this.data = data;
    }

    public void imprime() {
        String dataFormated = null;
        try {
            dataFormated = String.valueOf(this.data);
        } catch (Exception e) {
            System.out.println("Não foi possível tratar valor passado no construtor");
        }

        FormatadorDecorator formatador = new FormataComChavesDecorator(
                new FormataComColchetesDecorator(
                        new FormataComParenteseDecorator(
                                new FormataBaseDecorator()
                        )
                )
        );

        System.out.println(formatador.formata(dataFormated));
    }

}
