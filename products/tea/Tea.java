package homework.managers.products.tea;

import homework.managers.products.ProductforSale;

public class Tea implements ProductforSale {
     private static float waterAmount;
    private static float  teaAmount;



    public Tea(float waterAmount, float teaAmount) {
        this.waterAmount = waterAmount;
        this.teaAmount = teaAmount;
    }
 public Tea(){}

    public float getWaterAmount() {
        return waterAmount;
    }


    public float getTeaAmount() {
        return teaAmount;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}



