package pizza.creator;

import pizza.Dough;
import pizza.Pizza;
import sauce.Sauce;

/*
 * Class that interprets Factory method pattern
 * */
public abstract class PizzaCreator {

    public abstract Pizza bakePizza(Sauce sauce, Dough dough);
}
