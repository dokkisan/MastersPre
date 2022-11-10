package week1.mission2.practice.constructor;

public class Main {
    public static void main(String[] args) {
        // 프로젝트 프로그램이 실행될 때 가장 먼저 실행되는 main 함수
        // 여기에 User 클래스를 생성해서 user정보를 넣어본다

        // 생성자 파라미터(매개변수)에 맞게 인자 삽입.
//        User user = new User("왕하나", 26, "코딩"); // 클래스 생성
        // user 변수와 new 키워드를 이용해 **User 클래스를 생성**.(해서 활용할 것임)
        // user 변수에 User 클래스에 생성한 것들이 담겨져 있음.(어떤게요.??)
        // => 프린트 찍어보면 됨
        /** User클래스 자체에다 값을 담은게 아니라, 클래스 틀을 생성해서
         그 안에다가 user라는 변수를 지정해주고, 매개변수 값을 저장 */


        User user = new User();
        // 이번에는 생성시점에 값을 안넣을 것
        // new User라는 빈 생성자

        user.setName("독기산");
        // setName에 전역변수 넣어줌

        System.out.println(user.getName()); // name 호출
        // 매개변수를 user.name 또는,, 아까 set썼으니까 get으로 가져와도 됨.
        // set get을 사용하면 필요한 시점에 꺼내먹을 수 있음.
//        System.out.println(user.age);
//        System.out.println(user.hobby);
        // 도트 연산자로 생성자로 만들어둔 변수들 검색 가능
    }
}

