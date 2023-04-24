package MyFirstPack;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    //to generate getters and setters automatically ,right click-> source actions-> generate getters n setters
  public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
public static void main(String[] args) {
    
  }  
}
