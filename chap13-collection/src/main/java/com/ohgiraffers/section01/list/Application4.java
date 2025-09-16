package com.ohgiraffers.section01.list;
import java.util.Stack;

public class Application4 {
    public static void main(String[] args) {
        // Stack
        Stack<Integer> integerStack = new Stack<>();

        /*  */
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("IntegerStack : " + integerStack);

        /*Stack 에서 요소를 찾을 때*/
        // '위에서부터 몇번째 있어요' 를 보여줌
        System.out.println(integerStack.search(5));

        /* Stack 에서 요소를 꺼낸느 메소드
        * peek : 가장 위에 있는 요소 반환
        * pop : 가장 위에 있는 요소 제거 후 반환
         */
    }
}
