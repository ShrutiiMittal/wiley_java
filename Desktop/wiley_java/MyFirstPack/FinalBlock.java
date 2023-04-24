package MyFirstPack;

public class FinalBlock {
  public static void main(String[] args) {
    try{
    System.out.println("111111");
    System.out.println("wiley");
    // System.out.println(10/0);

    try{
        System.out.println(10/0);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        System.out.println("nested close connection");
    }
    System.out.println("edge");
    }
    catch(Exception e){
// you may write try catch block inside catch block as well
        System.out.println("catch block");
        System.out.println(10/0);
        // e.printStackTrace();
    }// if there's any exception in catch then it won't throw any exception
    finally{
        // System.out.println(10/0);
        System.out.println("clone connection");
    }//if there is any exception in finallly then it will be thrown by main thread
  }  
}
