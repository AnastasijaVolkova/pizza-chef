import pizza.Dough;
import pizza.Pizza;
import pizza.Souce;
import topping.Anchovy;
import topping.BlackOlive;
import topping.Tomato;
import topping.ToppingImpl;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.bakePizza(PizzaType.NAPOLITANA,
                new Anchovy(new Tomato(new BlackOlive(new ToppingImpl()))), new Souce(), new Dough());
        System.out.println(pizza.bakePizza());
    }
}
