package com.ohgiraffers.demensional_array.level01.basic;

public class Application1 {
    public static void main(String[] args) {

        // 변수 선언
        int[][] arr2D = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        // 수 할당
        for (int i=0; i<arr2D.length; i++) {
            for (int j=0; j<arr2D[i].length; j++) {
                if ((j!=0) && (j % 3 == 0)) {
                    System.out.println(arr2D[i][j]);
                } else {
                    System.out.print(arr2D[i][j]);
                    System.out.print("  ");
                }
            }
        }

        //

    }
}
