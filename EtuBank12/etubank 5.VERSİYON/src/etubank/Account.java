package etubank;
import java.time.LocalDate;


public abstract class Account {
    
    private LocalDate obj = LocalDate.of(2019,01,01);
    protected int  balance ;
    protected int customerID;
    private int password;
    private int achistory;

 
    
    public LocalDate getObj() {
        return obj;
    }

    public void setObj(LocalDate obj) {
        this.obj = obj;
    }

    public int getCustomerID() {
        return customerID;
        
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
        customerID= (int) (100000+Math.random()*999999);
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    protected Account(){
   customerID=0;
   balance=0;
   obj = LocalDate.of(2019, 01, 01);

   }
   protected Account(int customerId, int password, int balance){
    this.balance = balance;
    this.customerID=customerId;
    this.password = password;
    } 

    public void setBalance(int Balance) {
        this.balance = Balance;
    }
     public int getAchistory() {
        return achistory;
    }

    public void setAchistory(int achistory) {
        this.achistory = achistory;
    }

    public int getID() {
        return customerID;
    }   
    

    public void setID(int customerID) {
        this.customerID = customerID;
    }

    
    public  int getBalance(){
        return balance;
    }
    
   
    
    
    public abstract double Benefit();

    public abstract int Withdraw(int cash);
    public abstract int Deposit(int cash);    
    
    
     
}
