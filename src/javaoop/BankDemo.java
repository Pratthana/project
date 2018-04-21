package javaoop;

public class BankDemo {
    public static void main(String[] args){
        BankAccount a = new BankAccount();
         a.accNo =1111;
         a.custName ="Mr.A";
         a.balance =500;
         a.getBalance();
         
        BankAccount b = new BankAccount();
        b.accNo =2222;
        b.custName ="Mr.B";
        b.balance =1000;
        b.getBalance();
         
    }
    
}
