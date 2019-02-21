package constant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaType {

    private PizzaType() {
    }

    public static final String HAWAIIAN = "Hawaiian";
    public static final String PEPERONI = "Peperoni";
    public static final String FUNGHI = "Funghi";
    public static final String MARGHERITA = "Margherita";
    public static final String ROMANA = "Romana";
    public static final String SICILIAN = "Sicilian";
    public static final String NAPOLITANA = "Napolitana";

    public static final List<String> pizzaTypes = new ArrayList<>();


    static {
        pizzaTypes.addAll(toLowerCase(HAWAIIAN, PEPERONI, FUNGHI, MARGHERITA, ROMANA, SICILIAN, NAPOLITANA));
    }

    private static List<String> toLowerCase(String... strings) {
        List<String> types = new ArrayList<>();
        for (String string : strings) {
            types.add(string.toLowerCase());
        }
        return types;
    }

}
