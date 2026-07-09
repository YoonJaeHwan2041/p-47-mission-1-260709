package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Wise_sayings> wise_sayings = new ArrayList<>();
        boolean found = false;

        // 끝나면 다시 돌아와야해서 while문으로 시작
        while (true) {
            int id = 0;
            System.out.println("== 명언 앱 ==");
            System.out.print("명령) ");
            String commend = sc.nextLine();

            //삭제 및 수정 입력시 commend 입력값과 id 값을 분리
            String[] parts = commend.split("\\?id=");
            commend = parts[0];


            //각 명령어마다 실행시키기 쉽도록 switch로 사
            switch (commend) {
                case "등록":
                    System.out.print("명언 : ");
                    String wise_saying = sc.nextLine();
                    System.out.print("작가 : ");
                    String author = sc.nextLine();
                    wise_sayings.add(new Wise_sayings(wise_saying, author));
                    System.out.println("현재 " + wise_sayings.size() + "개의 명언이 등록되었습니다.");
                    break;

                case "종료":
                    System.out.println("앱을 종료하겠습니다.");
                    return;

                case "목록":
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("---------------------");
                    for(Wise_sayings ws : wise_sayings){
                        System.out.println(ws.id + " / " + ws.wise_sayings + " / " + ws.author);
                    }
                    break;

                case "삭제":

                    id = Integer.parseInt(parts[1]);
                    for(int i = 0; i < wise_sayings.size(); i++){
                        if (wise_sayings.get(i).id == id){
                            wise_sayings.remove(i);
                            found = true;
                            System.out.println(id + "번째 명언이 삭제되었습니다.");
                            break;
                        }
                    }
                    System.out.println(id + "번의 명언을 찾지 못했습니다.");
                    break;

                case "수정":
                    id = Integer.parseInt(parts[1]);
                    for(int i = 0; i < wise_sayings.size(); i++){
                        if(wise_sayings.get(i).id == id){

                        }
                    }

            }
        }

    }
}
