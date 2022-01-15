package br.com.ifma.atividadeDecorator;

import br.com.ifma.atividadeDecorator.core.NumeroUm;
import br.com.ifma.atividadeDecorator.core.decorators.*;

public class MainApplication {

    public static void main(String[] args) {
        NumeroUm numeroUm = new NumeroUm(1);
        numeroUm.imprime();

    }
}
