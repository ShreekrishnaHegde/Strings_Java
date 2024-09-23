package Strings;

public class String_Intro {
    public static void main(String[] args) {
        /*
         String is a most commonly used class in JAVA.
         Every string we create is an object of type String.
         Here name is reference variable, Krishna  is String object.
        */
        String name="Krishna";
        System.out.println(name);

        /*
        Here both name_1 and name_2 reference variables are pointing to the same object "Shreekrishna
        Hegde" in String Pool.
        Note: The changes made to the object via one reference variable will not affect the other.
        Suppose name_1 is changes to "Cooper". This will not affect the name_2 as another object named "Cooper"
        is created and existing object "Shreekrishna Hegde" is not modified. Hence Strings are "immutable".

         */
        String name_1="Shreekrishna Hegde";
        String name_2="Shreekrishna Hegde";

    }
}

