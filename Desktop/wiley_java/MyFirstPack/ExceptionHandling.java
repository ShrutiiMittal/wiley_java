package MyFirstPack;

public class ExceptionHandling {
   public static void main(String[] args) {
    System.out.println("first stmt");

    int arr[]={1,2,3,4};
    try{
    System.out.println(arr[1]);
    // System.out.println(arr[4]);
    String str="venkat";
    System.out.println(str.charAt(4));
    System.out.println(12/0);
    System.out.println("simple stmt");
    System.out.println("simple stmt");
    }
    catch(ArrayIndexOutOfBoundsException e){
    System.out.println(e.getMessage());
    System.out.println(e.toString());
    e.printStackTrace();
   } 
   catch(IndexOutOfBoundsException e){
    System.out.println("catch 2");
   }
   catch (Exception e){
    System.out.println(" catch block");
    e.printStackTrace();
   }
   System.out.println("another stmt");
}
}
