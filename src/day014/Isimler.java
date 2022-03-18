package day014;

public class Isimler {
    public static void main(String[] args) {

        String[] isimler={"İdris","Cumali","Yamaç"};
        isimler[1]="Dante";

        String [] isimler2=isimler;

        for (String isim:isimler){
            System.out.println(isim);
        }
        System.out.println("------------------------------");

        for (String isim:isimler2){
            System.out.println(isim);
        }
        System.out.println("------------------------------");

        isimler2[2]="Jugking";
        for (String isim:isimler){
            System.out.println(isim);
        }
        System.out.println("------------------------------");

        for (String isim:isimler){
            System.out.println(isim);
        }

        // Hep aynı nesneye gittiği için yapılan her değişiklik aynı nesne üzerinden oluyor.

        String[] isimler100=new String[isimler.length];   // new operatörü kullanılana kadar hep aynı nesneye erişilir. New dediğimiz anda yeni nesne oluşturulur.
        for (int i = 0; i < isimler100.length; i++) {
            isimler100[i]=isimler[i];
        }

    }
}
