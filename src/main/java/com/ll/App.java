package com.ll;

import java.util.Scanner;


//2단계 : 등록
//== 명언 앱 ==
//명령) 등록
//명언 : 현재를 사랑하라.
//작가 : 작자미상
//명령) 종료

class App {
  void run() {
    Scanner sc = new Scanner(System.in);

    String str1;
    String str4;

    System.out.println("== 명언 앱 ==");
    while(true) {
      System.out.print("명령) ");
      str1 = sc.nextLine();
      if(str1.equals("등록")) {
        break;
      }
    }

    System.out.print("명언 : ");
    sc.nextLine();

    System.out.print("작가 : ");
    sc.nextLine();

    while(true) {
      System.out.print("명령) ");
      str4 = sc.nextLine();
      if(str4.equals("종료")) {
        break;
      }
    }

    sc.close();
    System.out.println("== 종료 되었습니다 ==");

  }
}
