package week3.mission2.missionpractice.practicecalc;

public class CalculatorTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
//        Calc calc1 = new Calc(); // X. 인터페이스는 인스턴스화 될 수 없음.
//        Calc calc2 = new Calc(); // X.
//        CompleteCalc calc1 = new CompleteCalc(); // O.
//        Calculator calc2 = new CompleteCalc(); // O.

        System.out.println(calc.add(num1, num2));

        // Calc 클래스의 메서드 실행 -> CompleteCalc 클래스에 메서드 오버라이딩 후 출력값 변경됨.
        /* 메서드 오버라이딩(virtual function, virtual method 가상메서드 방식에 의해
        * description 메서드가 호출됨 */

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        int sum = Calc.total(arr);
        System.out.println(sum);

        /** 정적, 디폴트 메서드 모두 구현코드를 제공하고 있는데 둘의 차이점?
         * 디폴트 메서드는 기본적인 구현 코드가 ?? 뭔소리야 */
    }
}
