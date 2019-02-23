package pizza.creator;

import pizza.Dough;
import pizza.HawaiianPizza;
import pizza.Pizza;
import sauce.Sauce;
import topping.*;

public class HawaiianPizzaCreator extends PizzaCreator {

    @Override
    public Pizza bakePizza(Sauce sauce, Dough dough) {
        Topping topping = new ChickenBreast(new Pineapple(new Ham(new Mozzarella(new EmptyTopping()))));
        return new HawaiianPizza(dough, sauce, topping);
    }
}
