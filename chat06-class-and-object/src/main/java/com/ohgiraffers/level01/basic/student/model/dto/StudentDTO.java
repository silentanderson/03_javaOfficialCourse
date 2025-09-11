package com.ohgiraffers.level01.basic.student.model.dto;

public class StudentDTO {
    // 필드 정의
    private int grade;    // 학년
    private int classroom;  // 반
    private String name;   // 이름
    private int kor;      // 국어점수
    private int eng;      // 영어점수
    private int math;     // 수학점수

    // 생성자 정의
    public StudentDTO() {
        this(0, 0, "", 0, 0, 0);
    }

    // 기본 생성자
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // 메소드
    // 학생들의 정보를 입력받는 메소드
    // 1. 학년
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // 2. 반
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    // 3. 이름
    public void setName(String name) {
        this.name = name;
    }

    // 4. 국어
    public void setKor(int kor) {
        this.kor = kor;
    }

    // 5. 영어
    public void setEng(int eng) {
        this.eng = eng;
    }

    // 6. 수학
    public void setMath(int math) {
        this.math = math;
    }

    // 학생들의 정보를 출력하는 메소드
    // 이름 반환
    public String getName() {
        return name;
    }

    // 평균 점수 반환
    public int getAverage() {
        double avg = (kor + eng + math) / 3;
        return (int) Math.ceil(avg);
    }

    public String getInformation() {
        // 학생들의 정보를 취합해서 여기서 문자로 출력
        String result = "학년=" + grade + ", 반=" + classroom + ", 이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + ", 평균=" + this.getAverage();
        return result;
    }

}
