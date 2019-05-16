package homework.managers.products.tea;

public class BlackTea extends Tea {
    private static final float Black_Tea_AMOUNT = 15.0f;
    public static final float Water_Amount = 150.0f;
    private static final int PRICE = 200;

  public BlackTea(){}

    public static int getPRICE() {
        return PRICE;
    }

    public static float getBlack_Tea_AMOUNT() {
        return Black_Tea_AMOUNT;
    }

    @Override
    public float getWaterAmount() {
        return Water_Amount;
    }
}
