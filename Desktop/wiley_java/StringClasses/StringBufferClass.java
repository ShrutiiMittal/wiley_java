package StringClasses;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Wiley");
        StringBuffer sb1=new StringBuffer("Wiley");
        StringBuffer sb2=new StringBuffer("Wiley");
        System.out.println(sb.equals(sb1));

        String ss="Wiley";
        System.out.println(ss.equals(sb1.toString()));
        System.out.println(sb);
        sb.append(" edge");
        System.out.println(sb);

        sb.insert(4,"jjjj");
        System.out.println(sb);

        System.out.println(sb.reverse());
        System.out.println(sb.delete(5,9));
    }
}
