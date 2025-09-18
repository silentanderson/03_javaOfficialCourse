package com.ohgiraffers.practice;
import javax.xml.stream.StreamFilter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("홍길동",25,"IT",6000),
                new Employee("김철수",28,"HR",3000),
                new Employee("이영희",30,"IT",7000),
                new Employee("박민수",22,"영업",4000),
                new Employee("최지현",35,"HR",3500),
                new Employee("한석봉",40,"IT",5000)
        );

        // 1. 모든 직원의 이름을 쉼표로 구분된 문자열로 반환

        String allNames = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
        //System.out.println(allNames);  //  확인용

        // 2. IT 부서에서 급여가 5,000 이상인 직원의 이름을 급여 순으로 내림차순 정렬하여 반환
        List<String> highSalaryIT = employees.stream()
                .filter(e->e.getDepartment().equals("IT"))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .filter(e->e.getSalary() >= 5000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        // 1. for 루프 방식
        /*
        for (String tmp:highSalaryIT) {
            System.out.println(tmp);
        }
        */

        // 2. forEach 메서드,람다식
        //highSalaryIT.forEach(e -> System.out.println(e));


        // 3. 각 부서별 평균 급여를 계산하여 맵으로 반환
        Map<String, Double> averageSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        /*
        averageSalaryByDept.forEach(
                (department,avgSalary)->
                        System.out.println(department + " : " + avgSalary)
        );
        */

        System.out.println(allNames);
        System.out.println(highSalaryIT);
        System.out.println(averageSalaryByDept);

    }
}
