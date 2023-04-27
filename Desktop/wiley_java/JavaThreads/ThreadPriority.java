package JavaThreads;
class Tpriority extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread Name: - "  +  Thread.currentThread().getName()
                            + "   -    thread Priority:- " +Thread.currentThread().getPriority()
                            +"     - thread Id : "+ Thread.currentThread().getId()
                );
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {

        // Thread.currentThread().setPriority(8);
        // Tpriority t1=new Tpriority();
        // t1.setPriority(10);
        // Tpriority t2=new Tpriority();
        //t2 will have priority 8 instead of default priority 5 because it takes that from the parent thread
        Tpriority t1= new Tpriority();
        Tpriority t2=new Tpriority();
        Tpriority t3=new Tpriority();


        t1.start();
        t1.join(100);
        System.out.println(t1.getState());
        
        t2.start();
        t2.join();
        System.out.println(t2.getState());
        t3.start();
    }
}
