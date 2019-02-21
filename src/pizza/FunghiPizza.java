package pizza;

import sauce.Sauce;
import topping.Topping;

public class FunghiPizza extends PizzaBase implements Pizza {

    public FunghiPizza(Dough dough, Sauce sauce, Topping topping) {
        super(dough, sauce, topping);
    }

    @Override
    public String getWonderfulPizza() {
        return "Funghi pizza ";
    }
}
