package homework.managers.products.tea;



public class FruitTea extends Tea {
private static final float Fruit_Tea_AMOUNT = 15.0f;
public static final float Water_Amount = 150.0f;
private static final int PRICE = 200;

    public FruitTea() {

    }

    public static int getPRICE() {
        return PRICE;
        }


@Override
public float getWaterAmount() {
        return Water_Amount;
        }
        }