package week1.mission2.practice.constructor;
/**
틀, 라이브러리
*/
public class User {
     /* 멤버변수 선언 */
    String name;  // 이름
    int age;      // 나이
    String hobby; // 취미

    public User () {}

    /* 클래스의 생성자*/
    public User (String _name, int _age, String _hobby) {
        /** 생성자: 클래스가 처음으로 누군가에 의해 new로 생성 되었을 때
         가장 먼저 생성자의 블록이 실행됨.
         기본 생성자는 숨겨져 있음. 만들지 않아도 기본적으로 존재.*/
        /** 멤버변수 초기화를 생성자 안에서!
         생성자에서는 다른 곳으로부터 미리 받을 준비 해야함-> 매개변수로 받음*/
        this.name = _name;
        this.age = _age;
        this.hobby = _hobby;
        /** Main 클래스 인자들이 매개변수로 들어올 예정.
         멤버변수로 대입됨. 멤버변수에 값을 삽입할 때 this 사용.
         this는 현재 클래스를 가리킴.
         this.var == 클래스의 변수 */
    }

    /* 게터 세터 영역 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
