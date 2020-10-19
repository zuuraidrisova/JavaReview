package day54_Maps;

public class GarbageCollector {

    public static void main(String[] args) {

        new GarbageCollector(); //this object cannot be re-used later, so it will be
        //collected by garbage collector, because it does not have reference

        System.out.println("Done");

        GarbageCollector obj =  new GarbageCollector();
        //if object has a reference, it will  not be collected by garbage collector

        // two ways to make the object unreferenced:

        String str = new String("Cybertek");
        //now str is no longer referencing to Cybertek, because it is referencing MIT
        // now Cybertek will be garbage collected

        str = new String("MIT");

        System.out.println(str);

        //so two objects are created in java heap, 100 and 101
        Integer num = new Integer(100);

        num = new Integer(101);
        //but 100 is unreferenced now,since we re-assigned a new value to num
        // so it will be garbage collected

        Double decimal = new Double(0.3);

        decimal = null; //null does have no object, it is empty now,it will be garbage collected

        System.out.println(decimal);

        //finalize() ==> method called by garbage collector, used to clean up

        new Double(2.2); // ==> this object is not referenced, so it is eligible
        //for garbage collection, Garbage collector will call
        // finalize methods to do the cleaning up internally






    }
}
