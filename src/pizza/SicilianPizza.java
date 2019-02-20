package pizza;

import topping.Topping;

public class SicilianPizza extends PizzaBase implements Pizza {

    public SicilianPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Sicilian pizza ";
    }
}
