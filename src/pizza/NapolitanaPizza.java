package pizza;

import sauce.Sauce;
import topping.Topping;

public class NapolitanaPizza extends PizzaBase implements Pizza {

    public NapolitanaPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Napolitana pizza " + (getSauce() == null ? "without delicious sauce" : "with best sauce in your life");
    }
}
