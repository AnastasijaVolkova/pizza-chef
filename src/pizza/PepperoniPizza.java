package pizza;

import topping.Topping;

public class PepperoniPizza extends PizzaBase implements Pizza {

    public PepperoniPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Peperoni pizza ";
    }
}
