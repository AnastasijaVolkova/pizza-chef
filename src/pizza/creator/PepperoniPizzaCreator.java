package pizza.creator;

import pizza.Dough;
import pizza.PepperoniPizza;
import pizza.Pizza;
import sauce.Sauce;
import topping.*;

public class PepperoniPizzaCreator extends PizzaCreator {

    @Override
    public Pizza bakePizza(Sauce sauce, Dough dough) {
        Topping topping = new Peperoni(new BlackOlive(new Mozzarella(new EmptyTopping())));
        return new PepperoniPizza(dough, sauce, topping);
    }
}
