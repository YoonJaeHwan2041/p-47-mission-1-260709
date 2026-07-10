package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// 앞에 접근 제어자가 없는 이유는 같은 패키지 안에 있어서 접근 제어자를 생략했다.
// 추후 도메인별로 분리하여 패키지가 변경될 시에 앞에 접근제어자를 붙여야 할 경우가 많아 질것이다.
public class QuoteService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Quote> quotes = new ArrayList<>();

    void add(String quote, String author){
        quotes.add(new Quote(quote, author));
    }

    ArrayList<Quote> getList() {
        return quotes;
    }

    boolean delete(int id) {
        for(int i = 0; i < quotes.size(); i++){
            if (quotes.get(i).id == id){
                quotes.remove(i);
                return true;
            }
        }
        return false;
    }
}
