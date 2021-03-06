package homework.managers.products.coffee;

public class Latte extends Coffee {
    private static final float COFFEE_AMOUNT = 20.0f;
    private static final float WATER_AMOUNT = 100.0f;
    private static final float MILK_AMOUNT = 20.0f;
    private static final float Sugar_AMOUNT = 10.0f;
    private static final int PRICE = 400;

    public Latte(){
        super();
    }

    public Latte(float coffeeAmount, float sugarAmount, float waterAmount, float milkAmount) {
        super(coffeeAmount, sugarAmount, waterAmount, milkAmount);
    }

    @Override
    public float getCoffeeAmount() {
        return COFFEE_AMOUNT;
    }

    @Override
    public float getWaterAmount() {
        return WATER_AMOUNT;
    }

    @Override
    public float getMilkAmount() {
        return MILK_AMOUNT;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
    @Override
    public  float getSugarAmount() {
        return Sugar_AMOUNT;
    }
}
