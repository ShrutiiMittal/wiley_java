package MyFirstPack;

public class ObjectCreation implements Cloneable {
    int a=10;
    public void add(){
        System.out.println("Number adding");
    }
    public static void main(String[] args)throws InstantiationException, IllegalAccessException,CloneNotSupportedException {
        // method 1
        ObjectCreation cc=new ObjectCreation();
        cc.add();
        System.out.println(cc);
        // second method;
        // create object with newInstance()
        try{
            Class c=Class.forName("MyFirstPack.ObjectCreation");//qualified class name packagename.classname
            ObjectCreation ci=(ObjectCreation) c.newInstance();
            ci.add();
            System.out.println(ci);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }


        // third method- used to clone object from another object using cloneable interface
        ObjectCreation objClone=(ObjectCreation) cc.clone();
        objClone.add();
        System.out.println("object clone :" + objClone);
    }
}

