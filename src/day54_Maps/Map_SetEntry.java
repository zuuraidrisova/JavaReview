package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_SetEntry {

    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("USA","Washington");
        countries.put("Russia", "Moscow");
        countries.put("East Turkistan", "Urumqi");
        countries.put("Pakistan", "Islamabad");

        // Entry ==> is an interface
        //                    Entry<Key, Value>
        //
        //                    getKey() ==> returns the key from the Entry
        //                    getValue() ==> returns the value from the Entry

        for(Map.Entry<String, String> each : countries.entrySet()){//this data type is entry set now


            System.out.println(each.getKey()+ "'s capital is "+each.getValue());

        }

        System.out.println("============================================");


        String countryName = "Kyrgyzstan";

        for(Map.Entry<String, String> each : countries.entrySet()){

           String country = each.getKey();
           String capital = each.getValue();

            if (country.equals(countryName)) {

                System.out.println(each.getValue());
            }
        }







    }
}
