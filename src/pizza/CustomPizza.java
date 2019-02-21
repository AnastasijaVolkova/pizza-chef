package pizza;

import sauce.Sauce;
import topping.Topping;

public class CustomPizza extends PizzaBase implements Pizza {

    public CustomPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Custom pizza ";
    }
}
