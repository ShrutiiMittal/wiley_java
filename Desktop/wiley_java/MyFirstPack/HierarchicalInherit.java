package MyFirstPack;

class Vehicle1{
    public void tier(){
        System.out.println("tier");
    }
    public void steering(){
        System.out.println("steering");
    }
   
}
class Car extends Vehicle1{
    public void airBag(){
        System.out.println("airbag");
    }
}
class Truck extends Vehicle1{
    public void HydraulicPump(){
        System.out.println("hydraulic pumps");
    }
}

public class HierarchicalInherit {
    public static void main(String[] args) {
        Truck t=new Truck();
        t.HydraulicPump();
        // t.airBag();
        t.steering();
    }
}
