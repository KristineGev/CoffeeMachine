package homework.managers;

import homework.managers.products.ProductforSale;
import homework.managers.products.coffee.Coffee;

import java.util.Scanner;

public class MainController {

    public static MainController Instance;

    public static MainController getInstance(){
        if (Instance==null){
          Instance= new MainController();
        }
return Instance;
    }
    private MainController() {

    }

    Thread thread1=new Thread(new ProductMaker());
    Thread thread2=new Thread(new ThreadExample());
    public void startworking()  {
        DisplayManager.print(" Welcome dear customer! \n" + " Please insert coins and choose product");
        Scanner scanner = new Scanner(System.in);
        String code = "";

        do {
            int insertedAmount = 0;
            ProductforSale selectedProduct = null;
            do {
                if (scanner.hasNextInt()) {
                    int currentAmount = CoinReader.getsInstance()
                            .readCoin(scanner.nextInt());
                    if (currentAmount == -1) {
                        DisplayManager.printError("Wrong coin");
                        continue;
                    }

                    insertedAmount += currentAmount;

                } else {
                    selectedProduct = ProductManager.getProductByCode(scanner.next());
                    if (selectedProduct == null) {
                        DisplayManager.printError("Wrong code");
                    } else {
                        break;
                    }
                }
            } while (true);

            if (isEnoughMoney(insertedAmount, selectedProduct)) {
                thread2.start();
                thread1.start();
                ProductMaker.getInstance().makeCoffee((Coffee) selectedProduct);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int change = insertedAmount - selectedProduct.getPrice();
                if (change > 0) {
                    DisplayManager.print("Please take your change: " + change);
                }
                DisplayManager.printFormatted("Please take your purchase!");
            } else {
                DisplayManager.printError("Not enough money");
            } try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } while (true);


    }
        private boolean isEnoughMoney(int money, ProductforSale product) {
            return money >= product.getPrice();
        }


        }
