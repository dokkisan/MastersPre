package week1.mission2.person;

public class Person {
    String name = "제인";
    int age;
    String gender;
    boolean married;
    int child;

    Person() {
    }

    Person(int age) {
        this.age = 30;
    }

    Person(int age, String sex) {
        this.age = 30;
        this.gender = "여성";
    }

    Person(int age, String sex, boolean married) {
        this.age = 30;
        this.gender = "여성";
        this.married = true;
    }

    Person(int age, String sex, boolean married, int child) {
        this.age = 30;
        this.gender = "여성";
        this.married = true;
        this.child = 1;
    }
}
