package com.ohgiraffers.level01.basic.student.run;

import com.ohgiraffers.level01.basic.student.model.dto.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] studentArr = new StudentDTO[10];
        int count=0;
        boolean flagWhile = true;
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        while(flagWhile) {

            // while 문이 돌때마다 새로운 학생인스턴스를 생성한다.
            StudentDTO studentDTO = new StudentDTO();
            Scanner sc = new Scanner(System.in);

            System.out.print("학년 : ");
            studentDTO.setGrade(sc.nextInt());  // 학년 할당

            System.out.print("반 : ");
            studentDTO.setClassroom(sc.nextInt());  // 반 할당

            System.out.print("이름 : ");
            studentDTO.setName(sc.next());  // 이름 할당

            System.out.print("국어점수 : ");
            studentDTO.setKor(sc.nextInt());  // 국어점수 할당

            System.out.print("영어점수 : ");
            studentDTO.setEng(sc.nextInt());  // 영어점수 할당

            System.out.print("수학점수 : ");
            studentDTO.setMath(sc.nextInt());  // 수학점수 할당

            // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
            studentArr[count] = studentDTO;
            // 한 명씩 추가 될 때마다 카운트함
            count++;

            // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            if (sc.next().charAt(0) == 'y') {
                continue;
            } else {
                flagWhile = false;  //  while 문 빠져나오기
            }
        }

        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        for (int i=0; i<count; i++) {
            StudentDTO tmpStudent = studentArr[i];
            //int tmpAvg = tmpStudent.getAverage();
            System.out.println(tmpStudent.getInformation());
        }
    }
}
