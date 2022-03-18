package day013;

public class eYagislar {
    public static void main(String[] args) {

        //Ankara'nın aylara göre yagıs miktarları

        String[] aylar={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran",
                        "Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        double[] yagislar={40.5,35.3,39.3,42.2,51.3,35.2,14.1,12.5,18.0,27.5,31.5,44.6};

        //Yıllık toplam yağış miktarı
        //En çok yağış olan ay
        //En az yağış alan ay

        double toplam=0.0;
        double enFazla=0.0;
        int enFazlaNdx=0;
        int enAzNdx=0;
        double enAz=yagislar[enAzNdx];

        for (int i = 0; i < yagislar.length; i++) {
            toplam += yagislar[i];

            if (yagislar[i]>enFazla){
                enFazla=yagislar[i];
                enFazlaNdx=i;
            }

            if (yagislar[i]<enAz){
                enAz=yagislar[i];
                enAzNdx=i;
            }

        }

        System.out.println("En fazla yağış: "+enFazla);
        System.out.println("Ay : "+aylar[enFazlaNdx]);

        System.out.println("En az yağış : "+enAz);
        System.out.println("Ay : "+aylar[enAzNdx]);

        System.out.println(String.format("Toplam Yağış Miktarı = %5.1f",toplam));

    }
}
