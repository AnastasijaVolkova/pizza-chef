package oven;

import pizza.Dough;
import pizza.Pizza;
import pizza.creator.PizzaCreator;
import sauce.Sauce;

public interface StandartOven {

    Pizza getPizza(Dough dough, Sauce sauce, PizzaCreator pizzaCreator);
}
