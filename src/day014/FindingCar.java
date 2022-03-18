package day014;

import java.util.Scanner;

public class FindingCar {
    public static void main(String[] args) {

        String[] cars={"Audi","Mercedes","Ford","Honda","BMW"};
        Scanner input=new Scanner(System.in);

        System.out.print("Araba adı : ");
        String car=input.nextLine();
        findCar(car,cars);


        String mesaj="Bu bir deneme MESAJIdIr.";
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

    }
    /*
         Adı verilen arabayı listeden bulup ekranda gösteren metot yazınız.
    */
    public static void findCar(String carName,String[] carNames){
        boolean flag=false;
        //int sayac=0;
        for(String car:carNames){
            //sayac++;
            if (car.equalsIgnoreCase(carName)){    // if (car.toLowerCase().equals(carName.toLowerCase()))
                System.out.println("Aradığınız araba bulundu. '"+car+"'");
                flag=true;
                break;
            }
        }
       // System.out.println(sayac+" kez döndü.");
        if (!flag){
            System.out.println("Aragığınız araba bulunamadı.");
        }
    }

}
