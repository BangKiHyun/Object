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
    }
}
