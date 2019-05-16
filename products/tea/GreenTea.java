package homework.managers.products.tea;


public class GreenTea extends Tea {
    private static final float Green_Tea_AMOUNT = 15.0f;
    public static final float Water_Amount = 150.0f;
    private static final int PRICE = 200;


 public GreenTea(){

 }

    public GreenTea(float waterAmount, float teaAmount) {
        super(waterAmount, teaAmount);
    }


    @Override
    public float getWaterAmount() {
        return Water_Amount;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    public static float getGreen_Tea_AMOUNT() {
        return Green_Tea_AMOUNT;
    }
}

