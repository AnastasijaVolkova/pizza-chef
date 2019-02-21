package pizza;

import sauce.Sauce;
import topping.Topping;

public class RomanaPizza extends PizzaBase implements Pizza {

    public RomanaPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Romana pizza ";
    }
}
