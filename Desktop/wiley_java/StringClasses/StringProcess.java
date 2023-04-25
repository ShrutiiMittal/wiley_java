package StringClasses;

import javax.swing.event.SwingPropertyChangeSupport;

public class StringProcess {
    public static void main(String[] args) {
        String s1="Wiley";
        String s2="Wiley";
        String s3= new String ("Wiley");
        String s4= new String ("Wiley");
    
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s4==s3);

        String str="I am a java Developer";
        String str1="Python";
        String str2= str.concat((str1));
        System.out.println(str.replace('D','d'));
        System.out.println(str.length());
        System.out.println(str.charAt(10));
        System.out.println(str2);

        String st[]=str.split("");
        for(String string : st){
            // System.out.println(string);
        }

        String userInput=" mobile";
        System.out.println(userInput.trim());

        System.out.println(str2.toUpperCase());

        System.out.println(str.substring(0,5));
    }
  


}
