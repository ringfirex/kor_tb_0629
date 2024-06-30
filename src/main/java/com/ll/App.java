package com.ll;

import java.util.Scanner;

//- 4단계 : 등록할때 마다 생성되는 명언번호가 증가
//== 명언 앱 ==
//명령) 등록
//명언 : 현재를 사랑하라.
//작가 : 작자미상
//1번 명언이 등록되었습니다.
//명령) 등록
//명언 : 현재를 사랑하라.
//작가 : 작자미상
//2번 명언이 등록되었습니다.
//명령) 종료

class App {
  void run() {
    Scanner sc = new Scanner(System.in);
    String strcmd;
    String str2;
    String str3;
    int i = 0;

    System.out.println("== 명언 앱 ==");

    while(true) {
      System.out.print("명령) ");
      strcmd = sc.nextLine();

      if(strcmd.equals("등록")) {
        i++;

        System.out.print("명언 : ");
        str2 = sc.nextLine();
        System.out.print("작가 : ");
        str3 = sc.nextLine();

        System.out.println(i + "번 명언이 등록되었습니다.");

        strcmd = "";
        continue;
      }

      if(strcmd.equals("종료")) {
        break;
      }
    }
    System.out.println("== 종료 되었습니다 ==");
  }
}
