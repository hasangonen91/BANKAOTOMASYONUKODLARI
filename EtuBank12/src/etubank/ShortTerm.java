package etubank;

import java.time.LocalDate;



public class ShortTerm extends Account {
    private final LocalDate acilistarihi=LocalDate.parse("2019-01-01");
    private final LocalDate Suankizaman=LocalDate.now();
    private double faiz = 0.17;
    
    
    public ShortTerm(){
        
        super();
    
        faiz=0.17;
    }
    
    public ShortTerm(int customerID,int password,int balance){
        super(customerID,password,balance);
    }
    
    @Override
    public int Deposit(int pcash){
         balance += pcash;
        String aras = pcash + " YATIRILAN BAKIYE: ";
        System.out.println(aras);
        return pcash;
    }

    @Override
    public int Withdraw(int mcash){
        balance -= mcash;
        String sara = mcash + " CEKILEN BAKIYE: .";
        System.out.println(sara);
        return mcash;
    }
    
    @Override
    public double Benefit(){
      return (Suankizaman.getDayOfYear() - this.getZaman().getDayOfYear()) * (faiz / 365) * (this.getBalance() / 100);
    }
    

 }
