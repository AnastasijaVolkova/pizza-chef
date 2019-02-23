package pizza;

import sauce.Sauce;
import topping.Topping;

public class SicilianPizza extends PizzaBase implements Pizza {

    public SicilianPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Sicilian pizza " + (getSauce() == null ? "without delicious sauce" : "with best sauce in your life");
    }
}
