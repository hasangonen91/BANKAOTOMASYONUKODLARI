package etubank;


import java.time.LocalDate;
import java.util.*;

public class Etubank {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        Bank hesaplar = new Bank();

        do {
            System.out.println("|-------------------------------------------|");
            System.out.println("|***********GÖMENBANKA HOŞGELDİNİZ************|");
            System.out.println("|-------------------------------------------|");
             System.out.println("LÜTFEN İŞLEM SECİNİZ:\n"
                    + "YENİ HESAP VE  DİGER İSLEMLER İÇİN [1]\n"
                    + "HESAP VE DİGER İSLEMLER İÇİN [2]\n"
                    + "GEÇMİŞ İSLEMLERİ İÇİN [3]\n"
                    + "ÇIKIŞ YAPMAK İÇİN [0]");
           String  sayi = input.nextLine();
            switch (sayi){
                case "1":{
                      System.out.println("AÇACAĞINIZ BANKA HESABINI SEÇİNİZ:\n"
                        + "KISA VADELİ HESAP İÇİN [1]\n"
                        + "UZUN VADELİ HESAP İÇİN [2]\n"
                        + "VADESİZ HESAP İÇİN [3]");
                   
                      int sayi2 = input.nextInt();
                if (sayi2 == 1) {// AÇILAN HESABIN KISA VADELİ OLDUĞUNU KONTROL ETME VE İŞLEMLERİ
                    System.out.println("Bakiyenizi giriniz: ");
                    int balance = input.nextInt();
                    int customerID = random.nextInt(999999999); // 9 BASAMAKLI VE HER BASAMAĞI MAX 9'A KADAR GİDEN ID ÜRETİMİ
                    if (balance>= 1000) { // KISA VADELİ HESAP AÇMAK İÇİN BAKİYENİN EN AZ 1000 VE ÜSTÜ OLMASI GEREKİR
                        System.out.println("Hesabını oluşturuldu. Hesap numaranız: " + customerID);
                        ShortTerm hesap = new ShortTerm(customerID, balance);// KISA VADELİ HESABI KENDİ OBJESİNE KAYDETME
                        hesaplar.Accountlist.add(hesap);// KISA VADELİ HESAP BİLGİLERİ LİSTEYE EKLENDİ
                        acmovement.achistory.add(hesap);
                        System.out.println(customerID + " ID'li hesabınızda yapacağınız işlemi seçiniz.\n"
                                + "Para Çekme [1]\n"
                                + "Para yatırma [2]\n"
                                + "Kâr Hesaplama [3]");
                        int sayi3 = input.nextInt();
                        if (sayi3 == 1) {// KISA VADELİ HESAPTAN PARA ÇEKME İŞLEMİ
                            System.out.println("Çekmek istediğiniz miktarı giriniz: ");
                            int miktar = input.nextInt();

                            if (hesap1.getBalance() >= miktar) { // BAKİYE ÇEKİLMEK İSTENEN PARADAN FAZLA MI? KONTROLÜ
                                hesaplar.withdraw(ID, miktar); // PARA ÇEKME İŞLEMİ
                                System.out.println("Güncel bakiye: " + hesap1.getBalance() + " TL" + "\n"
                                        + "Çıkış yapıldı..");
                            } else { // ÇEKİLMEK İSTENEN PARA BAKİYEDEN FAZLAYSA VERMESİ GEREKEN UYARI
                                System.out.println("Yeterli miktarda bakiye bulunmuyor");
                            }
                        }
                        if (sayi3 == 2) {// KISA VADELİ HESABA PARA YATIRMA
                            System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                            int miktar = input.nextInt();

                            hesaplar.Deposit(customerID, miktar); // PARA YATIRMA İŞLEMİ
                            System.out.println("Güncel bakiye: " + hesap1.getBalance() + " TL" + "\n"
                                    + "Çıkış yapıldı..");
                        }
                        if (sayi3 == 3) {// KISA VADELİ HESAPTA KAR HESAPLAMA
                            double guncelBakiye = hesap1.getBalance() + hesap1.Benefit(); // FAİZDEN GELEN PARAYI BAKİYEYE EKLEME
                            System.out.println("Şu anki tarih: " + LocalDate.now());
                            System.out.println("Kârınız : " + hesap1.Benefit() + "TL , güncellenen paranız: " + guncelBakiye + " TL" 
                                    + "\n" + "Çıkış yapıldı..");
                                    
                        }
                    } else { 
                        System.out.println("Kısa vadeli hesap açmak için yeterli bakiyeniz bulunmamaktadır.");
                    }

                }// shortterm

                    
                    
                    
                    
                }
                case "2":{
                    
                }
                case "3":{
                    
                }
                case "4":{
                    
                }
                    
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            /* System.out.println("Kısa vadeli hesap açmak için 1\n"
                             + "Uzun vadeli hesap açmak içn 2\n"
                             + "Vadesiz hesap açmak için 3 ü tuşlayınız\n"
                             + "Çıkış yapmak için 0 ı tuşlayınız"
                             + "");
            */
            int islem = input.nextInt();

            if (islem == 1) {
                int customerID = (int) (100000 + Math.random() * 999999);
                System.out.println("Müşteri numaranız : " + customerID);
                System.out.println("Şifrenizi giriniz: ");
                int password = input.nextInt();
                if(password>=1000){
                    
                }
                else{
                    System.out.println("LÜTFEN SİFRENİZ EN AZ 4 HANELİ GİRİNİZ");
            }
                    
                
                  
                    
                
                System.out.print("Bakiyenizi giriniz:");
                int balance = input.nextInt();
                if (balance >= 1000) {
                    System.out.println("Hesabınız onaylanmıştır. ");
                    
                
                
                
                ShortTerm obj = new ShortTerm(customerID, password, balance);
                hesaplar.Accountlist.add(obj);
             
                
                
                /*
                
                
                
                
      
        while (true) {
            System.out.println("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                break;
                
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.getBakiye());
            }
            else if (islem.equals("2")){
                
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
                
            }
            else if (islem.equals("3")) {
                
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
                
            }
            else {
                
                System.out.println("Geçersiz İşlem....");
            }
            
            
            
        }
            
        }*/ System.out.println("giriş başarılı");
            while (true) {
               
                System.out.print("Para yatırmak için 1 \n"
                        + "Para çekmek için 2 \n"
                        + "Kârı görmek için 3 \n"
                        + "Ana menü'ye   icin 4' ü tuşlayınız"
                        + "Cıkıs yapmak icin 5' i tuslayiniz "
                        + "   ");
                int islem1 = input.nextInt();
                 
            if (islem1==5){
                System.out.println("Cıkıs yapılıyor...");

                break;
                
            }
            if (islem1==4 ){
                // sor basa sarsın en basa dönsün
                
            }
                
                
                
                if (islem1 == 1) { // KISA VADELİ HESPTA PARA YATIRMA
                    System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
                    int paraYatirma = input.nextInt();
                    hesaplar.Deposit(customerID, paraYatirma);
                    System.out.println("Güncel bakiyeniz: " + obj.getBalance());

                }
                
                if (islem1 == 2) {
                    System.out.println("Hesaptan çekmek istediğiniz miktarı giriniz: "
                            + "");
                    int paraCekme = input.nextInt();
                    if (obj.getBalance() > paraCekme) {
                        hesaplar.Deposit(customerID, paraCekme);
                        System.out.println("Güncel bakiye: " + obj.getBalance());
                        
                        }
                    else {
                        System.out.println("Hesapta yeteri kadar para yok."); 
                    }
                } // İF
                
                  
                   else {
                    System.out.println("Bu hesabı açmak için yeterli bakiyenizz yok. ");
                    
                }
            }
            if(islem == 0) {
                System.out.println("Çıkış yapılıyor..");
                break;
            }
            }
            }
            }while(true);
}
}

