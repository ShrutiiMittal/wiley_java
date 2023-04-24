package MyFirstPack;
interface Bank{
    void account();
}
interface Bank1{
    void account();
}
interface ATM extends Bank,Bank1{
    void insertCard();
    void selectOption();
    void enterPassword();
}
interface AA{
    void m1();
}
abstract class NewATM implements ATM,AA{
    public void account(){}

        public void m1(){

        
    }
}
public class InterfaceBank extends NewATM {
    public void insertCard(){
        System.out.println("Insert Card");

    }
    public void selectOption(){
        System.out.println("Select option");
    }
    public void enterPassword(){
        System.out.println("enter the password");
    }

}
