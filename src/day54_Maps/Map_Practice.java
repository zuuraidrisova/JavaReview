package day54_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Practice {

    public static void main(String[] args) {

        //create a map and store 5 people's name and birthday

        //map keys cannot be duplicated, it must be unique
        //if ur key is duplicated, then the latest will be kept

        Map<String, LocalDate> birthdays = new LinkedHashMap<>();

        birthdays.put("Zuura", LocalDate.of(1990,11,17));
        birthdays.put("Sary", LocalDate.of(1991,5,2));
        birthdays.put("Cholpon", LocalDate.of(1990,12,8));
        birthdays.put("Alina", LocalDate.of(1989,4,1));
        birthdays.put("Zeynep", LocalDate.of(2014, 8,27));
        birthdays.put("Meerim", LocalDate.of(2019,1,10));

        System.out.println("birthdays = " + birthdays);

        int size = birthdays.size();

        System.out.println("size = " + size);

        System.out.println("=================================================");

        birthdays.remove("Cholpon"); //using key we remove the data

        System.out.println("birthdays = " + birthdays);

        System.out.println("=================================================");

        LocalDate zuuraBday = birthdays.get("Zuura");

        System.out.println("zuuraBday = " + zuuraBday);

        System.out.println("=================================================");

       // containsKey() checks if key is contained in map, returns boolean

        boolean result =  birthdays.containsKey("Muhtar");//returns false bcs no Muhtar in map

        System.out.println("result = " + result);

        boolean result2 =  birthdays.containsKey("Sary");//returns true, bcs we have Sary in map

        System.out.println("result2 = " + result2);

        System.out.println("=================================================");

        //containsValue() checks if value is contained in map, returns boolean

        boolean result3 = birthdays.containsValue(LocalDate.of(2019,1,10));

        System.out.println("result3 = " + result3);

        // isEmpty() checks if map is empty or not, returns boolean

        System.out.println(birthdays.isEmpty());//false


        //clear() clear everything from map, map size will become zero


    }
}
