package org.bang.calculateGrade;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Lecture lecture = new Lecture("Java", 70, Arrays.asList(81, 95, 75, 50, 45));
        String evaluation = lecture.evaluate();
        System.out.println(evaluation);

        Lecture lecture1 = new GradeLecture("Java", 70, Arrays.asList(81, 95, 75, 50, 45), Arrays.asList(new Grade("A", 100, 95),
                new Grade("B", 94, 80),
                new Grade("C", 79, 70),
                new Grade("D", 69, 50),
                new Grade("F", 49, 0)));
        evaluation = lecture1.evaluate();
        System.out.println(evaluation);

        double gradeAverage = lecture1.average();
        System.out.println(gradeAverage);

        Professor professor = new Professor("Room_Energy",
                new Lecture("알고리즘",
                        70,
                        Arrays.asList(81, 95, 75, 50, 45)));
        String statistics = professor.compileStatistics();
        System.out.println(statistics);

        //업캐스팅 및 동적바인딩
        Professor professor1 = new Professor("Room_Energy",
                new GradeLecture("알고리즘",
                        70, Arrays.asList(81, 95, 75, 50, 45), Arrays.asList(new Grade("A", 100, 95),
                        new Grade("B", 94, 80),
                        new Grade("C", 79, 70),
                        new Grade("D", 69, 50),
                        new Grade("F", 49, 0)))
        );
        String statistics1 = professor1.compileStatistics();
        System.out.println(statistics1);

        //self 참조(동적 문맥) 이해
        Lecture parent = new Lecture("Child", 70, Arrays.asList(81, 95, 75, 50, 45));
        System.out.println(parent.status());

        Lecture child = new GradeLecture("Parent", 70, Arrays.asList(81, 95, 75, 50, 45), Arrays.asList(new Grade("A", 100, 95),
                new Grade("B", 94, 80),
                new Grade("C", 79, 70),
                new Grade("D", 69, 50),
                new Grade("F", 49, 0)));
        System.out.println(child.status());
    }
}
