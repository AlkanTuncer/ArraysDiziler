package day013;

public class ArraysApp {
    public static void main(String[] args) {

        //İlkel olmayan bir tip initialize edildigi zaman icerisinde bulunan ilkel tiplerin varsayılan değerleri atanır. int->0 , double->0.0 , boolean->false gibi
        int[] numbers=new int[5];
        boolean[] degerler=new boolean[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.print("\n");  //Output arası 1 satır bırakmak için, maksat çıktı güzel gözüksün (:

        for (int i = 0; i < degerler.length; i++) {
            System.out.println(degerler[i]);
        }
        System.out.print("\n");
        /*
        int [] numbers=new int [5];                    İKİ GÖSTERİMDE AYNIDIR.
        numbers[0]=3;                       KOLAY INITIALIZE EDİLMESİ İÇİN ASAGIDAKİ YAPI OLUSTURULUR.
        numbers[1]=5;
        numbers[2]=7;                             int[] numbers={3,5,7,9,11}
        numbers[3]=9;
        numbers[4]=11;
        * */
        int[] numbers2={3,5,7,9,11};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        System.out.print("\n");

        numbers2[numbers2.length-1]=1;
        System.out.println(numbers2[4]);

        numbers2=new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i]);
        }



    }
}
