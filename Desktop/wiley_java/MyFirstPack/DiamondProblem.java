package MyFirstPack;
interface Person{
    public void getRole();
 
}
interface Student extends Person{

}
class Teacher implements Person{
    public void getRole(){
        System.out.println("Teaching");
    }
}
class ClassRoom extends Teacher implements Student{
    public void getRole(){
        System.out.println("classroom teachings");
    }
}
public class DiamondProblem {
    public static void main(String[] args) {
        ClassRoom ob=new ClassRoom();
        ob.getRole();
    }
    
}
