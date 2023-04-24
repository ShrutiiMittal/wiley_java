package demo_protected;
import MyFirstPack.ATest;

public class Demo1 extends ATest{
    public static void main(String[] args) {
        ATest atc =new ATest();
        // we can access only public var from this object
        Demo1 dc =new Demo1();
        // dc.name3; we can access protected variable of different package but the parent class through the bject of child class
    }
}