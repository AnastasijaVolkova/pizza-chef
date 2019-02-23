package pizza.creator;

import pizza.Dough;
import pizza.FunghiPizza;
import pizza.Pizza;
import sauce.Sauce;
import topping.*;

public class FunghiPizzaCreator extends PizzaCreator {

    @Override
    public Pizza bakePizza(Sauce sauce, Dough dough) {
        Topping topping = new Mushroom(new Mozzarella(new Garlic(new EmptyTopping())));
        return new FunghiPizza(dough, sauce, topping);
    }
}
