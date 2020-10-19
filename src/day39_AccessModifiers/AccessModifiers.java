package day39_AccessModifiers;

public class AccessModifiers {

    /*

    There are 4 access modifiers in java: they decide accessibility of variables and methods

        public , protected, default, private

            public -->  is visible everywhere to everyone

            default --> if you do not provide access modifier, then
                        compiler will give you default access modifier
                        if it is default, it means it is accessible to all classes
                        within the same package

            private -->  can only be used within the same class

            Class can be public or default only
            Methods and  variables can have all 4 access modifiers
     */

    int num = 100;//it has now default modifier, can be accessed within the same package

    public int num2 = 23;//this variable hs public access, can be access at everywhere

    private int num3 = 34;// can only be used within the same class


}
