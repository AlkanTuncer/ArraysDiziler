package day012;

public class MainApp {
    public static void main(String[] args) {

        //Array(Dizi) nasıl tanımlanır?

        int[] sayilar=new int[5];   // --> Elimizde 5 sayı var.
        String[] footballers=new String[3];  // --> Elimizde 3 futbolcu var.
        String[] days=new String[7];
        String[] months=new String[12];

        //Eleman sayısını declaration kısmında degil initialization kısmında kullanıyoruz!!!

        int[] numbers=new int[5];
        numbers[0]=15;
        numbers[1]=24;
        numbers[2]=12;
        numbers[3]=7;
        numbers[4]=23;
//      numbers[5]=36; dersek jdk-düzeneyici hata vermez ama heap-hafızada böyle bir bölge olmadıgı için program calışmaz. 5.indeks 6.sayı YOK.

        System.out.println(numbers[1]);  // 1.indeksteki sayı 24 yani 2.sayı
        System.out.println(numbers[2]);  // 2.indeksteki sayı 12 yani 3.sayı
        System.out.print("\n");

        for (int i = 0; i < numbers.length; i++) {    // for (int i = 0; i < 5; i++)
            System.out.println(numbers[i]);
        }
        System.out.print("\n");

        int toplam=0;
        for (int i = 0; i < numbers.length; i++) {
            toplam=toplam+numbers[i];
        }
        double ortalama=(double) toplam/numbers.length;  // int/int veri kaybı yaratır. ortalamayı double tanımladık!!
        System.out.println("Toplam = "+toplam);
        System.out.println("Ortalama = "+ortalama);

    }
}
