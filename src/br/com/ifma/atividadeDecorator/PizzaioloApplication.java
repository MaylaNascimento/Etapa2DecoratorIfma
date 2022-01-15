package br.com.ifma.atividadeDecorator;

import br.com.ifma.atividadeDecorator.core.Mozzarella;
import br.com.ifma.atividadeDecorator.core.Pepperoni;
import br.com.ifma.atividadeDecorator.core.Pizza;
import br.com.ifma.atividadeDecorator.core.decorators.*;

public class PizzaioloApplication {

    public static void main(String[] args) {

        System.out.println("Pizza --- Valor");

        System.out.println(new Mozzarella());

        CondimentDecorator tomatoPizza = new TomatoDecorator(new Mozzarella());
        System.out.println(tomatoPizza);

        CondimentDecorator tomatoPizzaCreamChease = new CreamCheeseEdgeDecorator(
                new TomatoDecorator(
                        new Mozzarella()
                )
        );


        System.out.println(tomatoPizzaCreamChease);
        System.out.println(new Pepperoni());

        CondimentDecorator peperoneOreganoBacon = new BaconDecorator(
                new OreganoDecorator(
                        new Pepperoni()
                )
        );

        System.out.println(peperoneOreganoBacon);

        CondimentDecorator peperoneOreganoBaconTomato = new TomatoDecorator(
                new BaconDecorator(
                        new OreganoDecorator(
                            new Pepperoni()
                        )
                )
        );

        System.out.println(peperoneOreganoBaconTomato);

    }
}
