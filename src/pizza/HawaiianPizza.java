package pizza;

import sauce.Sauce;
import topping.Topping;

public class HawaiianPizza extends PizzaBase implements Pizza {

    public HawaiianPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Hawaian pizza (poop)";
    }
}
