package com.ohgiraffers.section01.array.level04.advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        // 변수 선언
        int[] arrLotto = new int[6];
        int tmpVal;      //  for 문 돌아갈때 사용할 임시 수
        final int MAX_NUM = 45;
        final int MIN_NUM = 1;

        // 중복없이 난수 생성
        int i=0;
        while(i < arrLotto.length) {
            tmpVal = (int) (Math.random()*45) + 1;
            if (checkSame(arrLotto, tmpVal)) {   // 중복 검사 하기
                continue;
            }
            arrLotto[i] = tmpVal;
            i++;
        }

        // 오름차순 정렬
        Arrays.sort(arrLotto);

        // 출력 하기
        for (int lotto : arrLotto) {
            System.out.println(lotto);
        }
    }

    public static boolean checkSame(int[] arr, int tmpVal) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == tmpVal) {   // 중복이 있으면 true
                return true;
            }
        }
        return false;
    }
}
