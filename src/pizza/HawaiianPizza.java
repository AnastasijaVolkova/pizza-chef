package pizza;

import sauce.Sauce;
import topping.Topping;

public class HawaiianPizza extends PizzaBase implements Pizza {

    public HawaiianPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Hawaiian pizza" + (getSauce() == null ? "without delicious sauce" : "with best sauce in your life");
    }
}
