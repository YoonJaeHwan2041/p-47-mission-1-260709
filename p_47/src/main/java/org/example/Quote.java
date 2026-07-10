package org.example;


public class Quote {
    static int nextId = 1;
    int id;
    String quote;
    String author;

    Quote(String quote, String author){
        this.id = nextId;
        nextId++;
        this.quote = quote;
        this.author = author;
    }
}
