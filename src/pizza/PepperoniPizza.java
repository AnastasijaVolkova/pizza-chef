package pizza;

import sauce.Sauce;
import topping.Topping;

public class PepperoniPizza extends PizzaBase implements Pizza {

    public PepperoniPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Peperoni pizza ";
    }
}
