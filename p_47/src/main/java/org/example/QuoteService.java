package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// 앞에 접근 제어자가 없는 이유는 같은 패키지 안에 있어서 접근 제어자를 생략했다.
// 추후 도메인별로 분리하여 패키지가 변경될 시에 앞에 접근제어자를 붙여야 할 경우가 많아 질것이다.
public class QuoteService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Quote> quotes = new ArrayList<>();

    // 등록
    int add(String quote, String author){
        quotes.add(new Quote(quote, author));
        return quotes.size();
    }

    //목록
    ArrayList<Quote> getList() {
        return quotes;
    }

    //삭제
    boolean delete(int id) {
        Quote target = findById(id); // 헬퍼 재사용
        if (target == null){
            return false;
        }else{
            quotes.remove(target);
            return true;
        }
    }



    //수정
    void update(String newQuotes, String newAuthor, Quote target){
        target.quote = newQuotes;
        target.author = newAuthor;
    }

    //중복된 코드로 인한 헬퍼 메서드
    Quote findById(int id) {
        for (Quote q : quotes) {
            if (q.id == id) {
                return q; // 찾으면 그 객체를 바로 리턴
            }
        }
        return null; // 못 찾으면 null
    }
}
