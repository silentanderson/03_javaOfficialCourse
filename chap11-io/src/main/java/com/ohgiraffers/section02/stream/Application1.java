package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Application1 {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = null;
        try {

            fin = null;
            int value;

            while ((value = fin.read()) != -1) {
                /* 값을 정수로 읽어온다. */
                System.out.println(value);
                /* 문자로 출력하고 싶은 경우 형변환 하면 된다. */
                System.out.println((char) value);
            }

            /* File클래스의 length()로 파일의 길이를 알 수 있다. */
            System.out.println("파일의 길이 : " + new File("/Users/kimsunghyun/Desktop/Dev/bootcamp/03_javaOfficialCourse/chap11-io/src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());

            /* 파일의 길이 만큼의 byte 배열을 만든다 */
            int fileSize = (int) new File("/Users/kimsunghyun/Desktop/Dev/bootcamp/03_javaOfficialCourse/chap11-io/src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] bar = new byte[fileSize];

            // 파일의 내용을 읽어서 byte 배열에 기록해준다.
            fin.read(bar);

            for (int i = 0; i < bar.length; i++) {
                System.out.println((char) bar[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            /* fin 인스턴스가 null이 아닌 경우 자원 반납을 해야한다. */
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
