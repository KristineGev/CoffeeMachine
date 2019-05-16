package homework.managers.products.Sweets;

import homework.managers.products.ProductforSale;

public class Sweets implements ProductforSale {
    private static int price;
    @Override
    public int getPrice() {
        return price;
    }
}
