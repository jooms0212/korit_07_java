package ch12_arrays;
/*
    메서드를 정희해도 되고 main에 바로 하셔도 상관없습니다.
    String[] scores 배열에
    A / B / C / D / F element를 입력하고
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오.
 */

import java.util.Scanner;

public class Array05 {
    public void score(String[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            System.out.println(scores[i] + "+ ");
        }
        System.out.println(scores[scores.length-1]);
    }
    public static void main(String[] args) {
        Array05 array05 = new Array05();
        String[] scores2 = {"A", "B", "C", "D", "F"};
        array05.score(scores2);
//        String[] scores = new String[5];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < scores.length; i++) {
//            scores[i] = scanner.nextLine();
//        }
//        for (int i = 0; i < scores.length - 1; i++) {
//            System.out.print(scores[i] + "+ ");
//        }
//        System.out.println(scores[scores.length-1]);
    }
}
