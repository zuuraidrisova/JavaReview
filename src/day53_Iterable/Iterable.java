package day53_Iterable;

public class Iterable {
    /*
    Iterable  ==> is a root interface of collection
            so that classes that implement iterable interface has the ability to
            iterate the objects

                Iterator: ==> interface
                   once the iterable interface is implemented, we can apply iterator

        An Iterator is an object that can be used to loop through collections,
        like ArrayList and HashSet. It is called an "iterator" because "iterating"
         is the technical term for looping.

                  Why we need iterator?
                   1. allows us to get access to each object in collections type
                   2. allows us object itself from collection

        Methods:

        iterator() : iterates any given collection, then returns iterator interface

        hasNext(): returns boolean, checks whether we have enough elements to iterate

        next():  if hasNext() == true, then it retrieves element, gets access to object

        remove(): removes the current element of iteration

     */
}
