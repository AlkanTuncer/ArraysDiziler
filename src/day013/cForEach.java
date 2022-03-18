package day013;

public class cForEach {
    public static void main(String[] args) {

        String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
        System.out.println("Dizinin Eleman Sayısı : " + gunler.length);
        System.out.println("Birinci gün : " + gunler[0]);
        System.out.println("Dördüncü gün : " + gunler[3]);
/*        for (int i = 0; i < gunler.length; i++) {
            System.out.println(gunler[i]);
        }*/
        System.out.print("\n");

        // FOR EACH DÖNGÜSÜ          //Lombok Kütüphanesi: Clean Code için.
        for (String gun:gunler) {
            System.out.println(gun);
        }
    }
}
