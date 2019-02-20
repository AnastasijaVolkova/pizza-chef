package pizza;

import topping.Topping;

public class NapolitanaPizza extends PizzaBase implements Pizza {

    public NapolitanaPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Napolitana pizza ";
    }
}
