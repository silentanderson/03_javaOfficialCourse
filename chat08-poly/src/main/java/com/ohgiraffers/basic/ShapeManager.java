package com.ohgiraffers.basic;

import java.util.Arrays;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */

        for (int i=0; i<shapes.length; i++) {
            // 크기가 부족하면 2배 늘려주기
            if (i == shapes.length) {
                Arrays.copyOf(shapes,2*shapes.length);
            }
            Shape tmpShape = shapes[i];
            if (tmpShape == null) {
                shapes[i] = shape;
                break;
            }
        }
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        boolean flagSame = false;
        for (int i=0; i<shapes.length; i++) {
            Shape tmpShape = shapes[i];
            // 값이 있으면
            if (tmpShape != null) {
                if (tmpShape.equals(shape)) {    // 똑같은게 발견되면
                    shapes[i] = null;    // 그 자리의 요소값을 null 로 바꿈
                    flagSame = true;
                }
                if (flagSame) {
                    shapes[i] = shapes[i+1];
                }
                // 값이 없으면
            }
            break;
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (int i=0; i<shapes.length; i++) {
            Shape tmpShape = shapes[i];
            if (tmpShape != null) {
                System.out.println("Shape: " + tmpShape.getClass().getSimpleName());
                System.out.println("Area: " + tmpShape.calculateArea());
                System.out.println("Perimeter: " + tmpShape.calculatePerimeter());
            }
        }
    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double areaSum=0;

        for (int i=0; i<shapes.length; i++) {
            Shape tmpShape = shapes[i];
            if (tmpShape != null) {
                double tmpArea = tmpShape.calculateArea();
                areaSum += tmpArea;
            }
        }
        return areaSum;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */

        double periSum=0;

        for (int i=0; i<shapes.length; i++) {
            Shape tmpShape = shapes[i];
            if (tmpShape != null) {
                periSum += tmpShape.calculatePerimeter();
            } else {
                break;
            }
        }
        return periSum;
    }
}
