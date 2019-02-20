import pizza.*;
import topping.Topping;

public class PizzaFactory {

    public Pizza bakePizza(String type, Topping topping, Souce souce, Dough dough) {
        switch (type) {
            case PizzaType.HAWAIIAN:
                return new HawaiianPizza(dough, souce, topping);
            case PizzaType.PEPERONI:
                return new PepperoniPizza(dough, souce, topping);
            case PizzaType.FUNGHI:
                return new FunghiPizza(dough, souce, topping);
            case PizzaType.MARGHERITA:
                return new MargheritaPizza(dough, souce, topping);
            case PizzaType.ROMANA:
                return new RomanaPizza(dough, souce, topping);
            case PizzaType.SICILIAN:
                return new SicilianPizza(dough, souce, topping);
            case PizzaType.NAPOLITANA:
                return new NapolitanaPizza(dough, souce, topping);
            default:
                return new CustomPizza(dough, souce, topping);
        }
    }
}
