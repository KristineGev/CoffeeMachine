package homework.managers;

public class ThreadExample extends Thread {

    @Override public void run() {

        System.out.println("Preaparing ");
        for (int i = 0; i < 5; i++) {
            System.out.print(".");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();

    }}