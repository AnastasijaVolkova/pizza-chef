package pizza;

import topping.Topping;

public class CustomPizza extends PizzaBase implements Pizza {

    public CustomPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Custom pizza ";
    }
}
