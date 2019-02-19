package toppingdecorator;

import topping.ChickenBreast;
import topping.Pineapple;
import topping.Topping;

import java.util.Arrays;

public class HawaianPizzaTopping extends ToppingDecorator {

    public HawaianPizzaTopping(Topping... toppings) {
        super(toppings);
        Arrays.asList(toppings).addAll(Arrays.asList(new ChickenBreast(), new Pineapple()));
    }

    @Override
    public String addTopping() {
        return super.addTopping();
    }
}
