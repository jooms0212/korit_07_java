package ch24_test;

import java.util.*;

public class GradeCalculator {

    public static double calculateAverage(Map<String, Integer> scores) {
        double sum = 0;
        // TODO: scores 맵의 모든 점수를 합산하여 합계를 구하는 코드를 작성하시오.
        for (int score : scores.values()){
            sum += score;
        }
        // TODO: 합산된 점수를 과목 수로 나누어 평균을 계산하고 반환하는 코드를 작성하시오.
        // 단, 과목이 없을 경우 0점을 반환해야 합니다.
        int count = scores.size();
        if (count == 0) {
            return 0.0;
        }
        double avg = sum / count;
        return avg;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> students = new ArrayList<>();

        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "홍길동");
        Map<String, Integer> scores1 = new HashMap<>();
        scores1.put("국어", 85);
        scores1.put("영어", 90);
        scores1.put("수학", 95);
        student1.put("scores", scores1);
        students.add(student1);

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "김철수");
        Map<String, Integer> scores2 = new HashMap<>();
        scores2.put("국어", 75);
        scores2.put("영어", 80);
        scores2.put("과학", 88);
        student2.put("scores", scores2);
        students.add(student2);

        // TODO: students 리스트를 순회하며 각 학생의 이름과 평균 점수를 출력하시오.
        for (Map<String, Object> student : students) {
            String name = (String) student.get("name");
            System.out.println("학생 : " + name + ", 평균 점수 : " + calculateAverage(scores1));
        }
        // calculateAverage 메서드를 반드시 사용해야 합니다.
    }
}
