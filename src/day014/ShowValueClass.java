package day014;

public class ShowValueClass {
    public static void main(String[] args) {

        String[] isimler={"Alkan Tuncer","Çağlasu Büke","Kylian Mbappe","Sergio Ramos"};
        showValues(isimler,true);
        showValues(isimler,false);

        isimler=new String[7]; System.out.print("\n");
        showValues(isimler,false);
    }

    public static void showValues(String[] values,boolean line){
        if (values==null) return;
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+(line?"\n":"\t"));    // ? Eğer true ise ilk kısım false ise ikinci kısım çalışır. Turnary Operatörü --> ?
        }
    }

}
