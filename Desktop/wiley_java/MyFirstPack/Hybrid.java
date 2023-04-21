package MyFirstPack;

import javax.swing.event.SwingPropertyChangeSupport;

class A{
    public void methodA(){
    System.out.println("Inside class A");
}
}
class B extends A{
    public void methodB(){
        System.out.println("class b");
    }
}
class C extends A{
    public void methodC(){
        System.out.println("class c");
    }
}
class D extends B{
    public void methodD(){
        System.out.println("class D");
    }
}
class E extends D{
    public void methodE(){
        System.out.println("class E");
    }
}
public class Hybrid {
    public static void main(String[] args) {
        E obj=new E();
        obj.methodA();
        obj.methodB();
        obj.methodE();
        obj.methodD();


    }
    
}
