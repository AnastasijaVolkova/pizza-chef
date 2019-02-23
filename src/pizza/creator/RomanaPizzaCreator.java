package pizza.creator;

import pizza.Dough;
import pizza.Pizza;
import pizza.RomanaPizza;
import sauce.Sauce;
import topping.*;

public class RomanaPizzaCreator extends PizzaCreator {

    @Override
    public Pizza bakePizza(Sauce sauce, Dough dough) {
        Topping topping = new Anchovy(new Oregano(new Mozzarella(new EmptyTopping())));
        return new RomanaPizza(dough, sauce, topping);
    }
}
