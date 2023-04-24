package MyFirstPack;
import java.util.ArrayList;

class StringNotFound extends RuntimeException{
    public StringNotFound(String message){
        super(message);
    }
}
public class UnChecked {
    public static void main(String args[]){
        ArrayList<String> students =new ArrayList<>();
        students.add("venkat");
        students.add("shruti");
        students.add("rishav");

        if(!students.contains("vennkat")){
            try{
                throw new StringNotFound("thiss string is not found");
            }
            catch(StringNotFound e){
                e.printStackTrace();
            }

        }
        System.out.println("message one");
        System.out.println("message 2");

    }
}
