package week2.mission2.problem2;

import java.util.ArrayList;

public class Student {
    private static int serialID = 1000;
    private final int studentID;
    private String name;
    private String major;
    private ArrayList<Integer> scores;

    public Student(String name, String major, ArrayList<Integer> scores) {
        studentID = serialID++;
        this.name = name;
        this.major = major;
        this.scores = scores;
    }
}
