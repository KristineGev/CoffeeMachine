package homework.managers;
import homework.managers.products.*;
import homework.managers.products.Sweets.Kitkat;
import homework.managers.products.Sweets.Snickers;
import homework.managers.products.Sweets.Twix;
import homework.managers.products.coffee.Americano;
import homework.managers.products.coffee.Cappuccino;
import homework.managers.products.coffee.Espresso;
import homework.managers.products.coffee.Latte;
import homework.managers.products.tea.BlackTea;
import homework.managers.products.tea.FruitTea;
import homework.managers.products.tea.GreenTea;

import java.util.HashMap;
import java.util.Map;

public class ProductManager {

    private static final String COMMAND_1 = "C1";
    private static final String COMMAND_2 = "C2";
    private static final String COMMAND_3 = "C3";
    private static final String COMMAND_4 = "C4";
    private static final String COMMAND_5 = "T1";
    private static final String COMMAND_6 = "T2";
    private static final String COMMAND_7 = "T3";
    private static final String COMMAND_8 = "S1";
    private static final String COMMAND_9 = "S2";
    private static final String COMMAND_10 = "S3";


    private static Map<String, ProductforSale> productsForSale = new HashMap<>();

    static {
        productsForSale.put(COMMAND_1, new Espresso());
        productsForSale.put(COMMAND_2, new Latte());
        productsForSale.put(COMMAND_3, new Americano());
        productsForSale.put(COMMAND_4, new Cappuccino());
        productsForSale.put(COMMAND_5, new BlackTea());
        productsForSale.put(COMMAND_6, new GreenTea());
        productsForSale.put(COMMAND_7, new FruitTea());
        productsForSale.put(COMMAND_8, new Kitkat());
        productsForSale.put(COMMAND_9, new Twix());
        productsForSale.put(COMMAND_10, new Snickers());


    }


    public static ProductforSale getProductByCode(String code) {
        return productsForSale.get(code);
    }

    static String insertedCode = "";
   static  String[] cofeeCodes = {"C1", "C2", "C3"};
   static  String[] teaCodes = {"T1", "T2", "T3"};
    static String[] sweetsCodes = {"S1", "S2", "S3"};

    public static String productType(String code) {
        for (int i = 0; i < 3; i++) {
            if (insertedCode == cofeeCodes[i]) {
                return "coffee";

            }
            if ((insertedCode == teaCodes[i])) {
                return "tea";

            }
            if (insertedCode == sweetsCodes[i]) {
                return "sweets";


            }
        }return code;
    }
}