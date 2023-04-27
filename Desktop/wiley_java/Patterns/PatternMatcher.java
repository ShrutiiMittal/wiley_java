package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        // Pattern pattern =Pattern.compile("agent \\d\\d\\d");
        Pattern pattern =Pattern.compile("agent \\d{3,4}"); //either 3 to 4 digits..for exact use d{2} -> 2 digits
        Matcher matcher= pattern.matcher("agent 0067");
       
        boolean found=matcher.find();
        boolean match=matcher.matches();
// find method only finds whether that part of the pattern is present in the original string 
// matches find the exact string 
        System.out.println("Found:"+found);
        System.out.println("Match:"+match);
    }
}
