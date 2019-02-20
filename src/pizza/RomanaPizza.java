package pizza;

import topping.Topping;

public class RomanaPizza extends PizzaBase implements Pizza {

    public RomanaPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Romana pizza ";
    }
}
