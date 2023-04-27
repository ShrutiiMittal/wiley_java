package JavaThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WeddingCardWrap extends Thread{
    public void run(){
        System.out.println("thread name:  " +Thread.currentThread().getName());
    }
}

public class RWeddingCard {
    public static void main(String[] args) {
        ExecutorService executor=Executors.newFixedThreadPool(4);
        for(int i=1;i<=100;i++){
            executor.execute(new WeddingCardWrap());
        }
    }
}
