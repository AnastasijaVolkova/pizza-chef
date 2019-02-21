package pizza;

import constant.PizzaType;
import pizza.*;
import sauce.Sauce;
import topping.Topping;

import java.util.Observable;

public class PizzaFactory {

    public Pizza bakePizza(String type, Topping topping, Sauce sauce, Dough dough) {
        Pizza bake = bake(type, topping, sauce, dough);
        return bake;
    }

    private Pizza bake(String type, Topping topping, Sauce sauce, Dough dough) {
        switch (type) {
            case PizzaType.HAWAIIAN:
                return new HawaiianPizza(dough, sauce, topping);
            case PizzaType.PEPERONI:
                return new PepperoniPizza(dough, sauce, topping);
            case PizzaType.FUNGHI:
                return new FunghiPizza(dough, sauce, topping);
            case PizzaType.MARGHERITA:
                return new MargheritaPizza(dough, sauce, topping);
            case PizzaType.ROMANA:
                return new RomanaPizza(dough, sauce, topping);
            case PizzaType.SICILIAN:
                return new SicilianPizza(dough, sauce, topping);
            case PizzaType.NAPOLITANA:
                return new NapolitanaPizza(dough, sauce, topping);
            default:
                return new CustomPizza(dough, sauce, topping);
        }
    }
}
