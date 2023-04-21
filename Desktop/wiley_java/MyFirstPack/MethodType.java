package MyFirstPack;
class Test{
    public static int add(int v1,int v2){
        int val=v1+v2;
        return val;
    }
}
public class MethodType {
    public void add (int v1,int v2){
        int val=v1+v2;
        System.out.println("Addition in instance method:"+val);
        this.sub(21,1);
    }
    public void sub (int v1,int v2){
        int val=v1-v2;
        System.out.println("substraction in instance method:"+val);
    }
    public static int mul (int v1,int v2){
        int val=v1*v2;
        
        // System.out.println("Multiplication in instance method:"+val);
        return val;
    }
    public static void main(String[] args) {
        int m=mul(23,45);
        System.out.println(m);
        MethodType mt=new MethodType();
        mt.add(23,23);
        System.out.println(Test.add(2,4));
    }
}
