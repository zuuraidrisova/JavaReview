package day41_Inheritance;

public class Book {

    public String title;
    public String type;
    public String author;
    public double price;


    public String toString(){

        return "Title: \""+title+"\" Author: "+author+" Price: $"+price;
    }

}

class EBook extends Book{

    //now this class inherited title, author, and price from book class

    //total of 5 instance variables in this class, 3 inherited and 2 created

    public int pages;
    public String size;

    public void readBook(){

        System.out.println("reading "+title);
    }

    public static void main(String[] args) {

        EBook book = new EBook();

        book.title = "Djamilya";
        book.type = "fiction";
        book.author = "Chyngyz Aytmatov";
        book.price =  50;
        book.size = "12MB";
        book.pages =  125;

        book.readBook();
        System.out.println(book);
    }


}

class AudioBook extends Book{

    /*
    title is inherited
    author is inherited
    price is inherited

    length is declared
    narrator is declared

    listenBook() is declared method
    toString() is inherited method
 */

    public String length;
    public String narrator;

    public void listenBook(){

        System.out.println("listening "+title+" by "+narrator);
    }

    public static void main(String[] args) {

        AudioBook book = new AudioBook();

        book.title = "White Ship";
        book.type = "fiction";
        book.author = "Chyngyz Aytmatov";
        book.price =  50;
        book.narrator = "Ernis Kiyaz";

        book.length = "3 hours 22 minutes";

        book.listenBook();
        System.out.println(book);
    }

}