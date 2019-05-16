package homework.managers.products;


public class Stock {

    private static Stock sInstance;
    int n=0;

    public static Stock getsInstance() {
        if (sInstance == null) {
            sInstance = new Stock();
        }
        return sInstance;
    }

    private static float waterInStock = 10000.0f;
    private static float milkInStock = 1000.0f;
    private static float sugarInStock = 1000.0f;
    private static float coffeeInStock = 1000.0f;
    private static float blackTeaInStock=1000.0f;
    private static float greenTeaInStock=1000.0f;
    private static float fruitTeaInStock=1000.0f;
    private static  int countKitKat=10;
    private static int  counttwix=10;
    private static int countSnickers=10;


    public boolean isTwix(int count){
        return counttwix>0;
    }
    public boolean isSnickers(int count){
        return  countSnickers>0;

    }
    public boolean isKitKat(int count){
        return countKitKat>0;
    }

        public boolean isEnoughCoffee( float coffeeAmount){
            return coffeeInStock >= coffeeAmount;
        }
        public boolean isEnoughMilk ( float milkAmount){
            return milkInStock >= milkAmount;
        }
        public boolean isEnoughWater ( float waterAmount ){
            return waterInStock >= waterAmount;
        }
    public boolean isEnoughSugar ( float sugarAmount ){
        return sugarInStock>=sugarAmount;
    }

    public boolean isEnoughBlackTea ( float blackTeaAmount ){
        return blackTeaInStock >= blackTeaAmount;

    }

    public boolean isEnoughGreenTea( float greenTeaAmount ){
        return greenTeaInStock>= greenTeaAmount;

    }
        public boolean isEnoughFruitTea( float fruitTeaAmount){
            return fruitTeaInStock >= fruitTeaAmount;
        }

        public int requestedSweets(int count){
        if(isKitKat(count))
            countKitKat-=count;
    return count;
    }


    public float requestedWater(float waterAmount) {
      if(isEnoughWater(waterAmount)) {
        waterInStock -= waterAmount;
          }

    return waterAmount;}

     public float requestedMilk(float milkAmount){
            if (isEnoughMilk(milkAmount)) {
                milkInStock -= milkAmount;
            }

            return milkAmount;
        }


         public float requestedSugar(float sugarAmount) {
             if(isEnoughSugar(sugarAmount)) {
                 sugarInStock-=sugarAmount;
             }

             return sugarAmount;}

             public float requestedCoffee(float coffeeAmount) {
                 if(isEnoughWater(coffeeAmount)) {
                     coffeeInStock -= coffeeAmount;
                 }

                 return coffeeAmount;}

                 public float requestedGreenTea(float greenTeaAmount) {
                     if(isEnoughWater(greenTeaAmount)) {
                         greenTeaInStock -=greenTeaAmount ;
                     }

                     return greenTeaAmount;

}}