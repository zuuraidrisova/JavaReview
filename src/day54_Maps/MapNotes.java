package day54_Maps;

public class MapNotes {


    /*
    main data structures in Java:
        Array
        Collection
        Map

    Array ==> fixed size,  supports primitives and objects, multidimensional
    Collection ==> dynamic size, supports only objects
    Map ==> dynamic size, supports key and value format, collection of maps
            supports only objects


    String [] name = {};
    Double [] salary = {};


    List<String> name = new ArrayList<>();
    List<Double> salary = new ArrayList<>();

    if we want to store different data types, we need maps,
     ex: name is string and salary is double

     Map<String, Double>

     Map is an interface, accepts key and value:  String is key and Double is value
            both key and value must be objects,cannot be primitives

            map is also presented in java.util package, we need to import it to use

            map has no indexes, it is not ordered data structure

            Key cannot be duplicated, it must be unique, value can be duplicated

            if key is duplicated, it will remove previously matching one

            Map has its own methods:

            put(key, value) ==> to add/insert  key and values into map
            get(key) ==> returns the value of the given key
            remove(key) ==> removes the given key and its value
            size() ==> return the length of the given map
            containsKey(key) ==> verifies if key is contained or not, returns boolean
            containsValue(value) ==> checks if the value is contained or not, returns boolean
            clear() ==> removes everything in map and size becomes 0
            isEmpty() ==> checks if map is empty or not
            keySet() ==> returns all the keys from map as Set, used to iterate the map
            values() ==> returns all the value  from map as Collection, used to iterate the map
            setEntry() ==> creates an Entry

                Entry ==> is an interface
                    Entry<Key, Value>

                    getKey() ==> returns the key from the Entry
                    getValue() ==> returns the value from the Entry

        DIFFERENCES BETWEEN MAP CLASSES:

        LinkedHashMap : keeps the insertion order as it is, put() and remove() faster
                        accepts null

        HashMap : accepts null, does not keep insertion order

        HashTable : synchronized ==> thread safe(one thread at a time in
                    multi-threaded environment), slower , does not accept null

        TreeMap : sorts the keys in ascending order, does not accept null keyword

     */
}
