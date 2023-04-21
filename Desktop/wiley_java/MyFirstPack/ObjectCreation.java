package MyFirstPack;

public class ObjectCreation {
    int a=10;
    public void add(){
        System.out.println("Number adding");
    }
    public static void main(String[] args)throws InstantiationException, IllegalAccessException {
        ObjectCreation cc=new ObjectCreation();
        cc.add();
        System.out.println(cc);

        // create object with newInstance()
        try{
            Class c=Class.forName("MyFirstPack.ObjectCreation");
            ObjectCreation ci=(ObjectCreation) c.newInstance();
            ci.add();
            System.out.println(ci);
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}

