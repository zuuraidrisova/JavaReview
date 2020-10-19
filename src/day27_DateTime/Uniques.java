package day27_DateTime;

public class Uniques {


      /*
      3. write a method that can print out the unique elements from an int array

					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9

		4. write a method that can print out the unique elements from a double array

					Note: Apply method overloading
       */

    public static void main(String[] args) {

        int [] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,3};

        uniqueElementsFromArray(arr);

        double [] arr1 = {1.1,2.3,2.2,1.1,2.2};

        uniqueElementsFromArray(arr1);
    }


    public static void uniqueElementsFromArray(int [] array){

        for (int each : array){

            int count = 0;

            for (int each1 : array){

                if (each == each1){

                    count++;

                }
            }

            if(count == 1){

                System.out.println(each);
            }
        }
    }

    public static void uniqueElementsFromArray(double [] array){

        for (double each : array){

            int count = 0;

            for (double each1 : array){

                if (each == each1){

                    count++;

                }
            }

            if(count == 1){

                System.out.println(each);
            }
        }
    }





}
