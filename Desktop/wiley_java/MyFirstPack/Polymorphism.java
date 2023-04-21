package MyFirstPack;

 class Polymorphism2 {
  

    public  void person(String s){
        System.out.println(s+ " is a teacher");
    }
    public  void person(){
        System.out.println("employee");
    }
    public  void methodToDisplay() {
        person();
        person("xyz");
        
    }
}

public class Polymorphism extends Polymorphism2{
    public  void person(String r){
        System.out.println("Person is "+r);
    }

    public static void main(String[] args) {
        Polymorphism ob=new Polymorphism();
        ob.person("Mother");
        ob.methodToDisplay();
    } 
}