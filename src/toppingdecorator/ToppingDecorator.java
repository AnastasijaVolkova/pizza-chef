package toppingdecorator;

import topping.Topping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class ToppingDecorator implements Topping {
    protected List<Topping> toppings;

    public ToppingDecorator(Topping... toppings) {
        this.toppings = toppings.length == 0 ? Collections.emptyList() : Arrays.asList(toppings);
    }

    @Override
    public String addTopping() {
        return String.join(", ", (CharSequence) toppings);
    }
}
