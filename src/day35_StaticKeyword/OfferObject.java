package day35_StaticKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {

    public static void main(String[] args) {

/*
    create a class called MyOffers
        Create 5 offer objects, and add them into the list of offers, and then:
            1. use for loop to print out the info of each offer
            2. write a program that can only retain the offers if:
                    1. the offer is for fullTime position
                    2. offer is from your local area
                    3. salary is greater than 100K
 */

        Offer offer1 = new Offer();

        offer1.setOfferInfo("VA","Cybertek", 100000, false);

        Offer offer2 = new Offer();

        offer2.setOfferInfo("KY","CapitalOne", 120000, false);

        Offer offer3 = new Offer();

        offer3.setOfferInfo("BayArea","Google",115_000,true);

        Offer offer4 = new Offer();

        offer4.setOfferInfo("MD","Chase",95000,true);

        Offer offer5 = new Offer();

        offer5.setOfferInfo("Ohio", "KeyBank", 100000, true);


        ArrayList<Offer> offers = new ArrayList<>(Arrays.asList(offer1,offer2, offer3, offer4, offer5));

        for (Offer each :  offers){

            System.out.println(each);
        }

        System.out.println("========================================================");

        offers.removeIf(p -> !p.isFullTime); //condition keeps only full time offers

        for (Offer each :  offers){

            System.out.println(each);
        }

        System.out.println("========================================================");

        offers.removeIf(p -> p.salary < 100000); //condition keeps only jobs with salary greater than 100000

        for (Offer each :  offers){

            System.out.println(each);
        }

        System.out.println("========================================================");

        offers.removeIf(p ->!p.location.equals("Ohio"));//condition keeps only jobs from local area

        for (Offer each :  offers){

            System.out.println(each);
        }

        System.out.println("========================================================");

    }
}
