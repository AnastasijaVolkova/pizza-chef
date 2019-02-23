package pizza.creator;

import pizza.Dough;
import pizza.NapolitanaPizza;
import pizza.Pizza;
import sauce.Sauce;
import topping.*;

public class NapolitanaPizzaCreator extends PizzaCreator {

    @Override
    public Pizza bakePizza(Sauce sauce, Dough dough) {
        Topping topping = new Tomato(new Mozzarella(new Oregano(new Garlic(new EmptyTopping()))));
        return new NapolitanaPizza(dough, sauce, topping);
    }
}
