public class Casting {
    public static void main(String[] args) {
        int myInt=9;
        double myDouble=myInt;

        // System.out.println(myDouble);
        // System.out.println(myInt);

        myInt=(int)myDouble;//manual casting
        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
