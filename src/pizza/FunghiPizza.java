package pizza;

import topping.Topping;

public class FunghiPizza extends PizzaBase implements Pizza {

    public FunghiPizza(Dough dough, Souce souce, Topping topping) {
        super(dough, souce, topping);
    }

    @Override
    public String bakePizza() {
        return "Funghi pizza ";
    }
}
