package week1.mission2.calculator;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int x = 10;
        int y = 2;

        System.out.println(x + ", " + y + " 사칙연산 시작!\n");

        int result1 = calc.plus(x, y);
        System.out.println("덧셈 결과: " + result1);

        int result2 = calc.minus(x, y);
        System.out.println("뺄셈 결과: " + result2);

        int result3 = calc.time(x, y);
        System.out.println("곱셈 결과: " + result3);

        int result4 = calc.divide(x, y);
        System.out.println("나눗셈 결과: " + result4);

        System.out.println("\n사칙연산 완료!");
    }
}
