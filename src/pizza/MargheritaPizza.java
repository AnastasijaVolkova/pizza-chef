package pizza;

import topping.Topping;

public class MargheritaPizza extends PizzaBase implements Pizza {

    public MargheritaPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Margherita pizza ";
    }
}
