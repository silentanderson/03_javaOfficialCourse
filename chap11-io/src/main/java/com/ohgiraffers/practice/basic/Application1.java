package com.ohgiraffers.practice.basic;

import java.io.*;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 사용자로부터 입력받은 파일의 내용을 읽어 새로운 파일에 복사하는 프로그램을 작성한다.
        * 원본 파일이 존재하지 않을 경우에 대한 예외를 처리한다.
        * */
        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         *
         * ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */

        // 객체 초기화
        Scanner sc = new Scanner(System.in);
        String path = "/Users/kimsunghyun/Desktop/Dev/bootcamp/03_javaOfficialCourse/chap11-io/src/main/java/com/ohgiraffers/level01/basic/";
        FileReader fr = null;

        System.out.print("파일 이름을 입력하세요 : ");
        String inFile = sc.nextLine();

        try {
            fr = new FileReader(path+inFile);

            char[] carr = new char[(int) new File(path+inFile).length()];
            int readCount = fr.read(carr);   // 실제 글자 수를 변수에 할당

            // 화면 출력

            for (int i=0;i<readCount;i++) {
                System.out.print(carr[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
