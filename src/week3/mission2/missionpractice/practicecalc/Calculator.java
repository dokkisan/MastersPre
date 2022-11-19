package week3.mission2.missionpractice.practicecalc;

// 인터페이스의 추상메서드를 다 구현한게 아니라서 abstract class
public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

}
