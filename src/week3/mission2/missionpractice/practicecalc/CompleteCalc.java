package week3.mission2.missionpractice.practicecalc;

public class CompleteCalc extends Calculator {
    // Calculator 클래스에 구현 안한 나머지 메서드를 구현하라고 뜸(?!)

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) { // 나누어 지는 수가 0이 되면 안되니까 ..
            return num1 / num2;
        }
        return ERROR;
    }

    @Override
    public void description() {
        System.out.println("완벽한 계산기입니다.");
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
