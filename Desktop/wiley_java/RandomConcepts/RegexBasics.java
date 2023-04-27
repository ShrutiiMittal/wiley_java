package RandomConcepts;
import java.util.regex.Matcher;
import java.util.regex.Pattern
;
public class RegexBasics {
    public static void main(String[] args) {

        // String re="..";//. means any character except new line. one '.' is for matching single character
        // String re="\\w\\w\\W"; //w(a-z A-Z,0-9,..) W any non word character
        // String text="a_@";
        String re="\\S\\s";//s for space
        // d for digit ,D for non digit
        String text="a ";
        Pattern pat=Pattern.compile(re);
        Matcher mat=pat.matcher(text);
        boolean res=mat.matches();
        System.out.println(res);
    }

}
