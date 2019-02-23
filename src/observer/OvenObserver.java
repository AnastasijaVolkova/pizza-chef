package observer;

import oven.Oven;
import pizza.Pizza;

import java.util.Observable;
import java.util.Observer;

/*
 * Class that interprets Observer pattern
 * */
public class OvenObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Oven && arg instanceof Pizza) {
            System.out.println("\nYour pizza is ready: " + ((Pizza) arg).getWonderfulPizza());
        }
    }
}
