package MyFirstPack;

public class VarScope {
    int ins=20;
    static String name ="Shruti";
    public static void main(String[] args) {
        int loc=10;
        VarScope vso=new VarScope();
        System.out.println("Local variable loc:"+loc);
        System.out.println("Instance variable ins:"+vso.ins);
        System.out.println("Static variable name:"+ name);
    }
}
