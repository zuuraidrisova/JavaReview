package day05_PrimitiveCatings_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {

        int a = 100;
        System.out.println(++a); //101 , increases value right away

        int b = 100;
        System.out.println(--b); // 99 , decreases value right away

        int c = 100;
        System.out.println(c++);// first it passes current value, and then changes it
        System.out.println(c); //now it is 101

        int d = 100;
        System.out.println(d--); // first it passes current value, and then decreases it
        System.out.println(d);// not it is 99


        int e = 50;

        e = --e + e++ + e-- + e++;
         // 49    49    50    49

        System.out.println("e = " + e);

        int x = 4;
        int y = x * 4 - x++;
      //         16   -  4
        System.out.println("y = " + y);

        int z = 1;
        z = -z-- + z++ / -z-- * --z;
        //  -1   + 0   / -1   *  -1

        System.out.println("z = " + z);



    }
}
