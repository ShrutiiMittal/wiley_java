package MyFirstPack;

public class Instanceorder{
    String name;
    int age;
{//to set any default properties and values for an object this can be used
    name="shruti";
    age=22;
    System.out.println("Instance Block");
}
public Instanceorder(){
    System.out.println("Name :"+name+ "Age:"+age);
    System.out.println("constructor block");
}
public Instanceorder(int a,int b){
    System.out.println("Constructor  parameterized"+(a+b));
}

public static void main(String [] args){
    Instanceorder ior=new Instanceorder();
    new Instanceorder(2,3);
}
}