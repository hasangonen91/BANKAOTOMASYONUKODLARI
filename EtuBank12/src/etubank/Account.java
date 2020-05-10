package etubank;
import java.time.LocalDate;
import java.time.LocalDate;

public abstract class Account {
    
    private LocalDate zaman = LocalDate.of(2019,01,01);
    protected int  balance ;
    private int customerID;
    private int password;
    private String achistory="";
 
    
    public Account(int balance, int customerID, int password) {
        this.balance = balance;
        this.customerID = customerID;
        this.password = password;
    }
    
    
    
    public Account() {
        password=0;
        customerID = 0;
        balance = 0;
        zaman = LocalDate.of(2019, 01, 01);
    }
    
    public LocalDate getZaman() {
        return zaman;
    }

    public void setZaman(LocalDate zaman) {
        this.zaman = zaman;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password; 
        customerID= (int) (100000+Math.random()*999999);
    }

    public String getAchistory() {
        return achistory;
    }

    public void setAchistory(String achistory) {
        this.achistory = achistory;
    }
    
    public abstract double Benefit();
    public abstract int Withdraw(int pcash);
    public abstract int Deposit(int mcash);    
    
    
     
}
