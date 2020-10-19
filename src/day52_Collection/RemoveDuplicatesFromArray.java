package day52_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        String [] arr = {"A","A","C","B","A"};

        ArrayList<String> noDuplicates = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Original "+noDuplicates);

        noDuplicates = new ArrayList<>(new HashSet<>(noDuplicates));

        System.out.println("noDuplicates = " + noDuplicates);


    }
}
