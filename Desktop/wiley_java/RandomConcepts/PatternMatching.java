package RandomConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        String input="The quick way to learn programing is consistent practice";
        Pattern pattern =Pattern.compile("learn");
        Matcher matcher=pattern.matcher(input);
        // System.out.println(matcher.find());
        // we can only match once ...if the above stmt is uncommented then the below if block won't be executed

        if(matcher.find()){
            int start=matcher.start();
            int end=matcher.end();

            System.out.println("Found match from index "+start +" to"+(end-1));
        }
        
        // in string we can use indexOf method to know the index f any word
        String pat="learn";
        int index=input.indexOf(pat);
        if(index!=-1){
            System.out.println(index);
        }
    }
}
