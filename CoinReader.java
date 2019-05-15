package homework.managers;



public class CoinReader {

    private static CoinReader sInstance;

    public static CoinReader getsInstance() {
        if (sInstance == null) {
            sInstance = new CoinReader();
        }
        return sInstance;
    }

    private CoinReader() {
    }


   private int[] supportedCoins = {50, 100, 200, 500};
    boolean isInsertedCoinValid = false;

    public int readCoin(int amount)
    {
         for (int supportedCoin : supportedCoins) {
                if (supportedCoin == amount) {
                    isInsertedCoinValid = true;
                break;

                } else isInsertedCoinValid = false;
            }
       if (isInsertedCoinValid)
                   return  amount;
            else
                  return -1;

    }}