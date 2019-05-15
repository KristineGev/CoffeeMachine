package homework.managers;

import com.sun.org.apache.bcel.internal.classfile.Code;
import homework.products.ProductforSale;
import homework.products.Stock;
import homework.products.coffee.Coffee;
import homework.products.tea.Tea;
import homework.products.Sweets.*;
import homework.managers.ProductManager;

import static java.lang.Thread.sleep;


public class ProductMaker implements Runnable
{
    private static ProductMaker Instance;
    private Object coffee;


    public static ProductMaker getInstance() {
            if (Instance == null) {
                Instance = new ProductMaker();
            }
            return Instance;
        }

        ProductMaker() {

        }
    @Override
    public void run() {
        makeCoffee((Coffee) coffee);
        try {
            sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void makeCoffee(Coffee coffee) {

            Stock.getsInstance().requestedWater(coffee.getWaterAmount());
            Stock.getsInstance().requestedCoffee(coffee.getCoffeeAmount());
            Stock.getsInstance().requestedMilk(coffee.getMilkAmount());
            Stock.getsInstance().requestedSugar(coffee.getSugarAmount());


return;
            }

            public void makeTea(Tea tea){
            Stock.getsInstance().requestedGreenTea(tea.getTeaAmount());
        return;
        }

public void getSweets(Sweets sweet){
            Stock.getsInstance().requestedSweets(1);


}


}
