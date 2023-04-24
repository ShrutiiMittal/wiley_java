package MyFirstPack;

abstract class Vehicle {
   protected String color;
   protected int speed;
   protected int numWheels;
   
   public Vehicle(String color, int speed, int numWheels){
    this.color=color;
    this.speed=speed;
    this.numWheels=numWheels;
   }
   public abstract void move();
}
class Car extends Vehicle{
    public Car(String color,int speed, int numWheels){
        super(color,speed,numWheels);
    }
    public void move(){

    }
    public void turn(){
        System.out.println("Turning left or right");
    }
}
