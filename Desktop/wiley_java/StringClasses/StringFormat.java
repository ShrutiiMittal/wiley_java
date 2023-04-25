package StringClasses;
import java.util.*;
public class StringFormat {
    public static void main(String[] args) {
        String title ="Java Developer";
        float salary=2000.39f;
        System.out.format("%s has %.2f USD salary%n",title, salary);


        List <String> techStack= Arrays.asList(
            "Essential jAVA",
            "Head First Java",
            "Java Design Patterns"
        );
        for(String book:techStack){
            // '-' is for left justification...30 char from left
            System.out.format("%-30s- In stock%n",book);
        }
        }
}
