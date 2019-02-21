package pizza;

import sauce.Sauce;
import topping.Topping;

public class MargheritaPizza extends PizzaBase implements Pizza {

    public MargheritaPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Margherita pizza ";
    }
}
