package org.example;


public class Wise_sayings {
    static int nextId = 1;
    int id;
    String wise_sayings;
    String author;

    Wise_sayings(String wise_sayings, String author){
        this.id = nextId;
        nextId++;
        this.wise_sayings = wise_sayings;
        this.author = author;
    }
}
