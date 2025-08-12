package org.example;

import java.util.Scanner;

public class BmiCalc {
    // call1()형태로 메서드화 시키는 게 그 다음 task
    public void calcBmi() {

    }
    // call3() 형태로 메서드화 시킬 겁니다
    public void calcBmi(String name, double height, double weight) {

    }
    // call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public void calcBmi(org.example.Person person) {
        double mHeight = person.getHeight() * 0.01;
        double bmi = person.getWeight() / (mHeight * mHeight);
        String index = "";
        if (bmi < 18.5) {
            index = "저체중";
        } else if (bmi < 23) {
            index = "정상";
        } else if (bmi < 25) {
            index = "과체중";
        } else if (bmi < 30) {
            index = "1단계 비만";
        } else if (bmi < 35) {
            index = "2단계 비만";
        } else {
            index = "3단계 비만";
        }
        System.out.println(person.getName() + "님의 BMI 지수는 " + bmi + "으로 " + index + "입니다.");
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >>>");
        String name = scanner.nextLine();
        System.out.print("키(cm)를 입력하세요 >>>");
        double height = scanner.nextDouble();
        System.out.print("몸무게(kg)를 입력하세요 >>>");
        double weight = scanner.nextDouble();
        Person person = Person.builder().name(name).height(height).weight(weight).build();
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.calcBmi(person);
//        double bmi = weight / (height * height);
//        String index = "";
//        if (bmi < 18.5) {
//            index = "저체중";
//        } else if (bmi < 23) {
//            index = "정상";
//        } else if (bmi < 25) {
//            index = "과체중";
//        } else if (bmi < 30) {
//            index = "1단계 비만";
//        } else if (bmi < 35) {
//            index = "2단계 비만";
//        } else {
//            index = "3단계 비만";
//        }
//        System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 " + index + "입니다.");


        /*
            실행 예
            이름을 입력하세요 >>> 김일
            키(cm)를 입력하세요 >>> 172
            몸무게(kg)를 입력하세요 >>> 68
            김일 님의 BMI 지수는 23.0으로 과체중입니다.
         */
    }
}

