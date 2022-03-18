package day014;

public class ChangeValueClass {
    public static void main(String[] args) {

        int x=20;                                                              // İlkel tip stackte tutuldu. Stackte 20
        System.out.println("Değer = "+x);                                      // metot içinde 5 oldu ve değişti mesajını aldık
        changeValue(x);                                                        // Ama değer  tekrar 20 oldu. Metotun içinde olan metotun içinde kaldı.
        System.out.println("Değer = "+x);                                      // Stackte olan 20 değeri değişmedi
        System.out.println("-----------------------");

        int[] sayilar={5,7,9};                                                  // Dizi ilkel tip olmadığı için (Referans tip oldugu için) heap de tutuldu.
        for (int sayi:sayilar){                                                 // Metot içinde dizinin ilk elemanının değerini 15 yaptık. 0.Ndx deki
            System.out.print(sayi+" ");                                         // Metot içinde heap deki nesneyi değiştirdik (15)
        }                                                                       // Metot dışında da dizinin ilk elamanı değişti.
        changeValues(sayilar);
        for (int sayi:sayilar){
            System.out.print(sayi+" ");
        }

    }

    public static void changeValue(int value){
        value=5;
        if (value==5){
            System.out.println("Değişti.");
        }
    }

    public static void changeValues(int [] values){
        values[0]=15;
        if(values[0]==15){
            System.out.println("Değer değişti.");
        }
    }

}