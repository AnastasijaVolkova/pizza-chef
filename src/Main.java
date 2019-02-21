import constant.PizzaType;
import pizza.Dough;
import pizza.Pizza;
import pizza.PizzaFactory;
import sauce.SauceFacade;
import topping.Anchovy;
import topping.BlackOlive;
import topping.Tomato;
import topping.ToppingImpl;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        SauceFacade sauceFacade = new SauceFacade();
        Pizza pizza = pizzaFactory.bakePizza(PizzaType.NAPOLITANA,
                new Anchovy(new Tomato(new BlackOlive(new ToppingImpl()))), sauceFacade.makePizzaSauce(), new Dough());
    }
}
