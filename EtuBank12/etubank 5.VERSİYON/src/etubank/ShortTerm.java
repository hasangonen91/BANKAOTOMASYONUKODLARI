package etubank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ShortTerm extends Account {
    private final LocalDate acilistarihi=LocalDate.parse("2019-01-01");
    private final  LocalDate Suankizaman=LocalDate.now();
    private final double faiz = 0.17;
    
    
    public ShortTerm(){
        super();  
    }
    
    public ShortTerm(int customerID,int password,int balance){
        super(customerID,password,balance);
    }

    @Override
    public int Deposit(int cash){
        int bakiye = this.getBalance() + cash;
        return bakiye;
    }

    @Override
    public int Withdraw(int cash){
        int bakiye =  this.getBalance() - cash;
        return bakiye;
    }
    
    @Override
    public double Benefit(){
        int karmiktari;
        karmiktari=(int) ((acilistarihi.until(Suankizaman,ChronoUnit.DAYS))*(faiz/365)*(balance/100));//ChoronoUnit.Days dan beri 
        return (int) karmiktari;
    }
    

 }
