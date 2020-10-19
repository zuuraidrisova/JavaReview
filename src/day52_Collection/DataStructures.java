package day52_Collection;

public class DataStructures {
    /*
    Data Structures:
        Arrays
        Collections
        Maps


    We need data structure to manage the data efficiently in an organized manner

    Arrays:
        is fixed size
        supports primitives and objects
        can be multi-dimensional
        uses indexes, so it is ordered data structure
        accepts duplicates


    ArrayList:
        is dynamic size
        comes from Collections
        supports only Objects
        none of the collections including ArrayList can be multi-dimensional
        uses indexes, so it is ordered data structure also
        accepts duplicates also


    Collections Framework means it consists of multiple interfaces
                    each interface has multiple implementations
                    all the classes and interfaces are presented in java.util package
                so: import java.util.className;

        Collections or collections framework
     ==> it is a group of data
     ==> its size is dynamic, adjusts automatically every single
                time we add or remove objects
     ==>or we can say it is growable since it can increase and decrease in size
     ==> it has ready methods to manipulate with data


     Iterable(I): root interface, parent of all interfaces and classes in collections

                         Iterable ==> interfaces
                            |
                        Collection ==>  also interfaces extends Iterable Interfaces
                 /          |             \
         List             Queue                Set


    List, Set, Queue are all interfaces which extend Collection Interface

    List has:  ArrayList, LinkedList, Vector (and Vector has Stack in it)
      List(I): implemented by ArrayList, LinkedList, Vector
       accepts duplicates, has indexes, size is dynamic

       ArrayList: is array based,  internally uses array and singly linked list which
       helps to retrieve data faster get()

       LinkedList: each objects are doubly linked ==>removing and adding faster

       Vector: is also array based class,the difference between vector and arrayList
                is that vector is synchronized, and
                synchronized used for achieving thread-safe.
                all vector methods have synchronized keyword

      Thread: abstract, process of operating system for scheduling objects
            multi-threaded means execution of multiple threads at the same time, makes
            program  slower

     vector ==> thread-safety: means one by one, by schedule, but slower
     arrayList ==> not-thread-safe : at the same time, random

     Stack extends Vector
           also synchronized
           last in, first out ==> unique feature of Stack
           pop() method -> unique action, means whatever object was added last, that
           object will be removed first


    Queue(I): does not have index number, so it is not ordered
           size is dynamic
           also accepts duplicates
           poll()==> method, makes stored objects first in first out

    Set(I):does NOT accept duplicates
           does not have index number, so it is not ordered

    HashSet : insertion order is not kept same
    LinkedHashSet : insertion order is kept, as it is

 LinkedHashSet is the ordered version of HashSet. The only difference between HashSet
 and LinkedHashSet is that: LinkedHashSet maintains the insertion order. When
 we iterate through a HashSet, the order is unpredictable while it is predictable
 in case of LinkedHashSet.

        SortedSet(I) extends Set, and it is implemented by TreeSet
                    it is sorted,
                    TreeSet does not accept duplicates and sorts objects

HashSet and TreeSet differences:
    TreeSet will sort insertion order, slower than hashSet bcs of iteration and sorting
    HashSet has unpredictable order,and it accepts null, faster, bcs does not have to sort
            null: default value of all objects

            ex: WebElement element; ==> null
                String str;         ==>null

                null does not refer to any of the objects


    we use Arrays.sort()in order to sort arrays
    we use Collections.sort() in order to sort collections type

    Collection is an interface
    Collections is a class

     */
}
