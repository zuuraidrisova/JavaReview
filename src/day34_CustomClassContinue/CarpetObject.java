package day34_CustomClassContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {

    public static void main(String[] args) {

        Carpet [] carpets = {new Carpet(), new Carpet(),new Carpet(),new Carpet(),new Carpet() };

        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(7,8,20,false);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35,45,35,true);

        System.out.println("carpets[0] = " + carpets[0]);
        System.out.println("carpets[1] = " + carpets[1]);
        System.out.println("carpets[2] = " + carpets[2]);
        System.out.println("carpets[3] = " + carpets[3]);
        System.out.println("carpets[4] = " + carpets[4]);

        System.out.println("==========================================================");

        ArrayList<Carpet> persianList = new ArrayList<>();
        ArrayList<Carpet> nonPersianList = new ArrayList<>();

        for (int i = 0; i < carpets.length; i++){

            if(carpets[i].isPersian){

                persianList.add(carpets[i]);
            }else{

                nonPersianList.add(carpets[i]);
            }
        }

        System.out.println("persianList.size() = " + persianList.size());
        System.out.println("nonPersianList.size() = " + nonPersianList.size());

        System.out.println("==========================================================");

//        System.out.println("persianList = " + persianList);
//        System.out.println("nonPersianList = " + nonPersianList);

        double totalCostPersian = 0;
        double totalCostNonPersian = 0;

        for (Carpet each :  persianList){

            System.out.println(each);

            totalCostPersian += each.calcCost();
        }

        System.out.println("totalCostPersian = " + totalCostPersian);

        System.out.println("==========================================================");

        for (Carpet each :  nonPersianList){
            System.out.println(each);

            totalCostNonPersian += each.calcCost();
        }

        System.out.println("totalCostNonPersian = " + totalCostNonPersian);


        System.out.println("==========================================================");

        ArrayList<Carpet> allCarpets = new ArrayList<>(Arrays.asList(carpets));

        allCarpets.removeIf( p -> !p.isPersian);

        System.out.println("allCarpets = " + allCarpets);
    }
}
