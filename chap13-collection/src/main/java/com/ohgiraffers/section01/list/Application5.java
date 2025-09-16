package com.ohgiraffers.section01.list;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<>();

        que.offer(1);
        que.offer(2);
        que.offer(3);
        que.offer(4);

        System.out.println("peek : " + que.peek());

        System.out.println("poll : " + que.poll());


    }
}
