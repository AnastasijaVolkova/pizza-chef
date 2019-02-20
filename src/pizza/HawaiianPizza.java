package pizza;

import topping.Topping;

public class HawaiianPizza extends PizzaBase implements Pizza {

    public HawaiianPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Hawaian pizza ";
    }
}
