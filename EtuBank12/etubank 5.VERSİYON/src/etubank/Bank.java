package etubank;
import java.time.LocalDate;
import java.util.*;
public class Bank {
    LocalDate tarih;
    private final LocalDate obj = LocalDate.now();
    ArrayList<Account> Accountlist = new ArrayList<>(100);
    ArrayList<Account> acmovement = new ArrayList<>();//hesap hareketi

   public void getDate(){
   System.out.print("Sistemin şu anki tarihi : " + tarih); 
   }
    /*public void setDate(LocalDate tarih) {
        this.obj =tarih;
    }*/
   
   //PARA CEKME
   public void withdraw(int customerID, int cash) { 
        for (int i = 0; i < Accountlist.size(); i++) {
            if (customerID == Accountlist.get(i).getID()) {
                int aras = i;
                int balance2 = Accountlist.get(aras).getBalance();
                if (balance2 >= cash) {
                    int balance = balance2 - cash;
                    Accountlist.get(aras).setBalance(balance);
                } 
            }
        } 

    }
   //BALANCE BAKİYE
   public void Deposit(int customerID,int cash){
       for(int j=0; j<Accountlist.size(); j++){
         if (customerID == Accountlist.get(j).getID()){
             int aras = j;
             int balance2 = Accountlist.get(aras).getBalance();
             int balance=balance2 + cash;
             Accountlist.get(aras).setBalance(balance);
        
         }
       }
   }
   
   // AÇILAN SON 5  CUSTOMERID VE SON BAKİYE 
     public void showAccount() { 
        if (acmovement.size() < 5) {
            System.out.println("HESAP HARAEKETLERİNİ GÖRMEK İÇİN EN AZ 5 İSLEM GEREKİYOR");
            }
        else 
            for(int i = acmovement.size()-1; i > acmovement.size()- 6 ; i--){
                System.out.println(i + ". HESAP ID: " + acmovement.get(i).getID()+"BAKİYE:" + acmovement.get(i).getBalance());
                
            }
   
        }
     
   // KAYDEDİLEN CUSTOMERİD
   public void getAccount(){
       for(int k=0; k<=100; k++){
           System.out.println(k+". ve " + Accountlist.get(k).customerID + " ID'li hesabın bakiyesi : " +Accountlist.get(k).balance);
       }
       if (Accountlist.size() > 0) { 
            for (int i = 0; i < Accountlist.size(); i++) {
                System.out.println((i + 1) + "."+"HESAP İD: " + Accountlist.get(i).getID()); 
            }
        }
        else {
            System.out.println("BU HESAP KAYİTLİ DEGİL.");
        }
   }
}
   

   
   
   
   
   

   
   
   
   
}
    
       
       
       
       
       
       
       
       
       
   
    

