package week1.mission2.person;

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person(30, "여성", true, 1);

        String maritalStatus = "";
        if (!person.married) {
            maritalStatus = "기혼";
        }

        String jane = "이름은 " + person.name + "이고 "
                + "나이는 " + person.age + "살 입니다. "
                + "성별은 " + person.gender + "이며, "
                + maritalStatus + "자 입니다. "
                + "자녀는 " + person.child + "명이 있습니다.";

        System.out.print(jane);
    }
}
