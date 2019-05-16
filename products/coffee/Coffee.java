package homework.managers.products.coffee;

import homework.managers.products.ProductforSale;

public abstract class Coffee implements ProductforSale {

    private  static float coffeeAmount;
    private static  float waterAmount;
    private static float milkAmount;
    private static  float sugarAmount;


    public Coffee(float coffeeAmount, float sugarAmount, float waterAmount, float milkAmount) {
        this.coffeeAmount = coffeeAmount;
        this.waterAmount = waterAmount;
        this.milkAmount = milkAmount;
    }

    public Coffee() {
           }

    public float getCoffeeAmount() {
        return coffeeAmount;
    }

    public float getWaterAmount() {
        return waterAmount;
    }

    public float getMilkAmount() {
        return milkAmount;
    }

    public  float getSugarAmount() {
        return sugarAmount;
    }
}

