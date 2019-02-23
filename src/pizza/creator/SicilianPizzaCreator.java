package pizza.creator;

import pizza.Dough;
import pizza.Pizza;
import pizza.SicilianPizza;
import sauce.Sauce;
import topping.*;

public class SicilianPizzaCreator extends PizzaCreator {

    @Override
    public Pizza bakePizza(Sauce sauce, Dough dough) {
        Topping topping = new BlackOlive(new Anchovy(new Tomato(new Oregano
                (new Mozzarella(new EmptyTopping())))));
        return new SicilianPizza(dough, sauce, topping);
    }
}
