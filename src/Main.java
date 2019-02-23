import observer.OvenObserver;
import oven.Oven;
import oven.StandartOven;
import pizza.Dough;
import pizza.creator.*;
import proxy.HateHawaiianPizzaProxyOven;
import sauce.Sauce;
import sauce.SauceFacade;

/*
 * Application is created using 6 GOF patterns:
 *
 * Creational: Singleton (Oven.class), Factory method (PizzaCreator.class)
 * Structural: Decorator (ToppingDecorator.class), Facade (SauceFacade.class), Proxy (HateHawaiianPizzaProxyOven.class)
 * Behavioral: Observer (OvenObserver.class)
 *
 * Although, I can assume that Strategy pattern is also used (Pizza interface and getWonderfulPizza method)
 * */
public class Main {

    public static void main(String[] args) {
        Oven oven = Oven.getOven();
        OvenObserver ovenObserver = new OvenObserver();
        oven.addObserver(ovenObserver);

        Sauce sauce = new SauceFacade().makePizzaSauce();

        StandartOven proxy = HateHawaiianPizzaProxyOven.createProxy(oven);

        proxy.getPizza(new Dough(), sauce, new HawaiianPizzaCreator());

        proxy.getPizza(new Dough(), sauce, new NapolitanaPizzaCreator());

        proxy.getPizza(new Dough(), null, new PepperoniPizzaCreator());

        proxy.getPizza(new Dough(), sauce, new SicilianPizzaCreator());

        proxy.getPizza(new Dough(), sauce, new RomanaPizzaCreator());

        proxy.getPizza(new Dough(), null, new MargheritaPizzaCreator());

        proxy.getPizza(new Dough(), null, new FunghiPizzaCreator());
    }
}
