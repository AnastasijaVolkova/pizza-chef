package pizza.creator;

import pizza.Dough;
import pizza.MargheritaPizza;
import pizza.Pizza;
import sauce.Sauce;
import topping.EmptyTopping;
import topping.Mozzarella;
import topping.Tomato;
import topping.Topping;

public class MargheritaPizzaCreator extends PizzaCreator {

    @Override
    public Pizza bakePizza(Sauce sauce, Dough dough) {
        Topping topping = new Tomato(new Mozzarella(new EmptyTopping()));
        return new MargheritaPizza(dough, sauce, topping);
    }
}
