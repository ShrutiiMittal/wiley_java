package MyFirstPack;

public class StaticBlock {
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    public StaticBlock(){
        System.out.println("Inside constructor Block");
    }
    public static void main(String[] args) {
        StaticBlock db=new StaticBlock();
        new StaticBlock();
    }
}
