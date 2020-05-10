
package etubank;
import java.time.LocalDate;


public class LongTerm extends Account {
    private final LocalDate acilistarihi=LocalDate.parse("2019-01-01");
    private LocalDate SuankiTarih=LocalDate.now();
    private double faiz = 0.24;
    
    public LongTerm(){
        super();
        faiz=0.24;
    }
    
    public LongTerm(int customerID,int password,int balance){
        super(customerID,password,balance);
    }

    @Override
    public double Benefit(){
     
      
       return (SuankiTarih.getDayOfYear() - this.getZaman().getDayOfYear()) * (faiz / 365) * (this.getBalance() / 100);
    }
    
    @Override
    public int Deposit(int pcash){
        LocalDate SuankiTarih = LocalDate.now();
        balance += pcash;
        return pcash;
    }

    @Override
    public int Withdraw(int mcash){
         LocalDate SuankiTarih = LocalDate.now();
        balance -= mcash;
        return mcash; 
    }

}
