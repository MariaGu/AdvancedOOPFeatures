package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Book mashaBook = new Book("Sun", "Masha", 500, 1585);
        System.out.println(mashaBook.getName());
        System.out.println(mashaBook.getAuthor());
        System.out.println(mashaBook.getNumberOfPages());
        System.out.println(mashaBook.getNumberOfISBN());
    }
}
