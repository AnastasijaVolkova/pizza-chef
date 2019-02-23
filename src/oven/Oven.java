package oven;

import pizza.Dough;
import pizza.Pizza;
import pizza.creator.PizzaCreator;
import sauce.Sauce;

import java.util.Observable;

/*
 * Class that interprets Singleton pattern
 * */
public class Oven extends Observable implements StandartOven {

    private static Oven oven;

    private Oven() {
    }

    @Override
    public Pizza getPizza(Dough dough, Sauce sauce, PizzaCreator pizzaCreator) {
        setChanged();
        Pizza pizza = pizzaCreator.bakePizza(sauce, dough);
        notifyObservers(pizza);
        return pizza;
    }

    public static Oven getOven() {
        if (oven == null) {
            oven = new Oven();
        }
        return oven;
    }
}
