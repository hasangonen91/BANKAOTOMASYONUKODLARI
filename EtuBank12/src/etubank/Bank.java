package etubank;

import java.time.LocalDate;
import java.util.*;

public class Bank {

    private LocalDate zaman = LocalDate.now();
    ArrayList<Account> account = new ArrayList<>();
    ArrayList<Account> acmovement = new ArrayList<>();//hesap hareketi

    public LocalDate getDate() {
        return zaman;
    }

    public void setDate(LocalDate tarih) {
        this.zaman = tarih;
    }
    //PARA CEKME

    public void withdraw(int customerID, int cash) {
        for (int i = 0; i < account.size(); i++) {
            if (customerID == account.get(i).getCustomerID()) {
                int aras = i;
                int balance2 = account.get(aras).getBalance();
                if (balance2 >= cash) {
                    int balance = balance2 - cash;
                    account.get(aras).setBalance(balance);
                }
            }
        }

    }
    //BALANCE BAKİYE

    public void Deposit(int customerID, int cash) {
        for (int j = 0; j < account.size(); j++) {
            if (customerID == account.get(j).getCustomerID()) {
                int aras = j;
                int balance2 = account.get(aras).getBalance();
                int balance = balance2 + cash;
                account.get(aras).setBalance(balance);

            }
        }
    }

    // AÇILAN SON 5  CUSTOMERID VE SON BAKİYE 
    public void showAccount() {
        if (acmovement.size() < 5) {
            System.out.println("HESAP HARAEKETLERİNİ GÖRMEK İÇİN EN AZ 5 İSLEM GEREKİYOR");
        } else {
            for (int i = acmovement.size() - 1; i > acmovement.size() - 6; i--) {
                System.out.println(i + ". HESAP ID: " + acmovement.get(i).getCustomerID() + "BAKİYE:" + acmovement.get(i).getBalance());

            }
        }

    }

    // KAYDEDİLEN CUSTOMERİD
    public void getAccount() {
        if (account.size() > 0) {
            for (int i = 0; i < account.size(); i++) {
                System.out.println((i + 1) + " HESAP ID: " + account.get(i).getCustomerID());
            }//end of for
        }//end of if
        else {
            System.out.println("ACIALAN HESAP YOK");
        }

    }

}
