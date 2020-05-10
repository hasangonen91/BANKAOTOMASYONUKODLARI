
package etubank;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LongTerm extends Account {
    private final LocalDate acilistarihi=LocalDate.parse("2019-01-01");
    private final LocalDate Suankizaman=LocalDate.now();
    private double faiz = 0.24;
    
    public LongTerm(){
        super();
    }
    
    public LongTerm(int customerID,int password,int balance){
        super(customerID,password,balance);
    }

    @Override
    public double Benefit(){
        int gunsayisi,karmiktari;  
      
        //return (Suankizaman.getDayOfYear() - this.getObj().getDayOfYear()) * (faiz / 365) * (this.getBalance() / 100);
        gunsayisi=(int) ((acilistarihi.until(Suankizaman,ChronoUnit.DAYS))*(faiz/365)*(balance/100));
        karmiktari=(int) (balance*24/(365*100));
        return (int) karmiktari;
    }
    
    @Override
    public int Deposit(int cash){
        LocalDate Suankizaman = LocalDate.now();
        balance -= cash;
        return cash;
    }

    @Override
    public int Withdraw(int cash){
         LocalDate Suankizaman = LocalDate.now();
        balance += cash;
        return cash; 
    }

}
