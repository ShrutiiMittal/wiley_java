package MyFirstPack;

public class MethodType {
    public void add (int v1,int v2){
        int val=v1+v2;
        System.out.println("Addition in instance method:"+val);
    }
    public static void mul (int v1,int v2){
        int val=v1*v2;
        System.out.println("Multiplication in instance method:"+val);
    }
    public static void main(String[] args) {
        mul(23,45);
        MethodType mt=new MethodType();
        mt.add(23,23);
    }
}
