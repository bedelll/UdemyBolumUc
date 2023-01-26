
import java.util.Scanner;

public class BolumYirmiAlti {


   public static void main(String[] args) {

       //SORU 1

       Scanner tara = new Scanner(System.in);

       double kilo = tara.nextDouble();
       double boy = tara.nextDouble();

       double kitleIndex = (kilo / ((boy/100)*(boy/100)));

       if (kitleIndex<15) {
           System.out.println("Çok Ciddi Derecede Düşük Kilolu");
       }else if(kitleIndex>=15 && kitleIndex<16){
           System.out.println("Ciddi Derecede Düşük Kilolu");
       }else if(kitleIndex>=16 && kitleIndex<18.5d){
           System.out.println("Düşük Kilolu");
       }else if(kitleIndex>=18.5d && kitleIndex<25){
           System.out.println("Normal Kilolu");
       }else if(kitleIndex>=25 && kitleIndex<30){
           System.out.println("Fazla Kilolu");
       }else if(kitleIndex>=30 && kitleIndex<35){
           System.out.println("1.Dereceden Kilolu");
       }else if(kitleIndex>=35 && kitleIndex<40){
           System.out.println("2.Dereceden Kilolu");
       }else{
           System.out.println("3.Dereceden Kilolu");
       }
        // SORU2 ÇÖZÜM
       int randNumber =(int) (Math.random() * 89)+10;
       int kullaniciTahmin= tara.nextInt();
       System.out.println("RANDNUMBER: "+ randNumber);
       int ikinciSecenek;

       int onlarBas= randNumber/10;
       int birlerBas= randNumber-(onlarBas*10);
       ikinciSecenek = (birlerBas*10)+onlarBas;
       System.out.println("İKİNCİ SECENEK: "+ikinciSecenek);

       int kOnlarBas = kullaniciTahmin /10;
       int kBirlerBas = kullaniciTahmin - (kOnlarBas*10);

       if (randNumber==kullaniciTahmin){
           System.out.println("10000TL KAZANDINIZ. NUMARA: "+randNumber );
       }else if (kullaniciTahmin==ikinciSecenek){
           System.out.println("Tebrikler 5000TL KAZANMAYI HAK ETTİNİZ. NUMARANIZ: "+kullaniciTahmin +"Ödül NUMARASI: "+randNumber);
       }else if ((onlarBas==kOnlarBas) || (onlarBas==kBirlerBas) || (birlerBas==kBirlerBas) || (birlerBas==kOnlarBas)){
           System.out.println("TEBRİKLER 1000TL KAZANMAYI HAK ETTİNİZ. NUMARANIZ: "+kullaniciTahmin +"Ödül NUMARASI: "+randNumber);
       }else {
           System.out.println("BİR ÖDÜL KAZANAMADINIZ");
       }




    }
}
