import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        do{
            System.out.println("enter a number between 1 and 10");
            num=sc.nextInt();

        }while(num < 1 || num>10);
        System.out.println("number entered by the user:"+num);
    }
}
