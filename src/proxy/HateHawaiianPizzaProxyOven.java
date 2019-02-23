package proxy;

import oven.Oven;
import oven.StandartOven;
import pizza.HawaiianPizza;

import java.lang.reflect.Proxy;

/* Class that interprets Proxy pattern (used for logging) */
public class HateHawaiianPizzaProxyOven {

    public static StandartOven createProxy(StandartOven oven) {
        return (StandartOven) Proxy.newProxyInstance(Oven.class.getClassLoader(), new Class[]{StandartOven.class}, ((proxy, method, args1) -> {
            if (method.getName().equalsIgnoreCase("getPizza")) {
                Object res = method.invoke(oven, args1);
                if (res instanceof HawaiianPizza) {
                    System.out.println("I hate hawaiian pizza, but here you go, if you really like it");
                }
                return res;
            }
            return method.invoke(oven, args1);
        }));

    }
}
