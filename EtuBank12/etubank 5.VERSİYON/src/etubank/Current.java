
package etubank;

import java.time.LocalDate;


public class Current extends Account  {
     public Current(){
        super();
    }
    
    public Current(int customerID,int password,int balance){
    super(customerID,password,balance);
    }

    @Override
    public int Deposit(int cash){
       LocalDate zaman = LocalDate.now();
        balance -= cash;
        return (int) cash;
      
    }

    @Override
    public int Withdraw(int cash){
        LocalDate zaman = LocalDate.now();
        balance += cash;
        return (int) cash;
       
    }
    
    @Override
    public int getBalance(){
    return (int) balance;
    }

    @Override
    public double Benefit() {
        return 0;
    }

}
