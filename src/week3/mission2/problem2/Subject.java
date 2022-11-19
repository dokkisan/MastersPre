package week3.mission2.problem2;

import javax.print.attribute.SupportedValuesAttribute;
import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private int subjectID;
    private int gradeType;

    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectID, int gradeType) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
        this.gradeType = Define.AB_Type;
    }
}
