public class conditional {
    public static void main(String[] args) {
        // int age=21;
        // if(age>=18)
        // System.out.println("eligible for voting");
        // else 
        // System.out.println("not eligible for voting");

        cartValue(18000);
        cartValue(3900);
    }
    public static void cartValue(int price){
        System.out.println("Total cart value"+price);
        double discount=0;
        if(price>=10000)
        {    discount=0.1 *price;
            System.out.println("discount applied:"+discount);
        }
        System.out.println("balance="+(price-discount));
    }
}
