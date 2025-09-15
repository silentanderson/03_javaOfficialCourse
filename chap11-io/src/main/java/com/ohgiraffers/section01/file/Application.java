package com.ohgiraffers.section01.file;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        File file = new File("/Users/kimsunghyun/Desktop/Dev/bootcamp/03_javaOfficialCourse/chap11-io/src/main/java/com/ohgiraffers/section01/file/test.txt");
        /* 파일을 새롭게 생성할 수 있다. */
        try {
            boolean createSuccess = file.createNewFile();
            System.out.println("createSuccess : " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* 생성한 파일의 크기 */
        System.out.println("파일의 크기 : " + file.length() + "byte");
        System.out.println("파일의 경로 : " + file.getPath());
        System.out.println("현재 파일의 상위 경로 : " + file.getParent());
        /* 절대 경로란 최상위 루트 위치부터의 경로를 의미한다. */
        System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

        /* 파일 삭제(삭제 후 성공 실패 여부를 boolean으로 반환한다.) */
        boolean deleteSuccess = file.delete();

        /* 삭제 이후에는 삭제가 되기 때문에 매번 실행할 때마다 파일 생성 결과는 true로 나오게 되니 참고할 것 */
        System.out.println("deleteSuccess : " + deleteSuccess);
    }
}
