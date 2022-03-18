package day013;

import java.util.Scanner;

public class bRastgele {
    public static void main(String[] args) {

        // Rastgele 10 adet tam sayı üretiniz.(Sayılar 0-100 aralıgında olsun)
        // Ekranda göstertiniz.
        // Toplamlarını gösteriniz.

        int[] rastgeleSayilar=new int[10];
        int toplam=0;
        for (int i = 0; i < rastgeleSayilar.length; i++) {
            rastgeleSayilar[i]=(int)Math.round(Math.random()*100);
            toplam +=rastgeleSayilar[i];
            System.out.print(rastgeleSayilar[i]+" ");
        }
        System.out.println("\nToplam = "+toplam);



        // Klavyeden belirli sayıda not girişi yapıp ortalamayı hesaplayınız.
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç not girilecek? ");
        int notAdedi=input.nextInt();
        int[] notlar=new int[notAdedi];
        for (int i = 0; i < notlar.length; i++) {
            System.out.print((i+1)+" . Not : ");
            notlar[i]=input.nextInt();
        }
        for (int i = 0; i < notAdedi; i++) {
            System.out.println(notlar[i]);
        }


    }
}
