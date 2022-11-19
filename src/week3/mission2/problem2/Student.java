package week3.mission2.problem2;

import javax.security.auth.Subject;
import java.util.*;

public class Student {
    private String name;
    private int studentID;
    private Subject major;

    public Student(String name, int studentID, Subject major) {
        this.name = name;
        this.studentID = studentID;
        this.major = major;
    }
}
