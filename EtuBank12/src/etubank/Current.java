
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
    public int Deposit(int pcash){
       LocalDate zaman = LocalDate.now();
       int bakiye = this.getBalance() + pcash;
        return bakiye;
      
    }

    @Override
    public int Withdraw(int mcash){
        LocalDate zaman = LocalDate.now();
        int balance = this.getBalance() - mcash;
        return balance;
       
    }
    
    @Override
    public double Benefit() {
        return 0;
    }

}
