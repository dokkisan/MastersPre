package week3.mission2.missionpractice.practicecalc;

public interface Calc {
    // 멤버 변수: 클래스 생성될 때(클래스가 인스턴스로 생성될 때) Heap area에 메모리 잡힘
    // 키워드 적어주지 않아도 public static final -> 상수 선언
    double PI = 3.14;
    int ERROR = -99999999;

    // interface 키워드 안에 선언되면 프리 컴파일 단계에서 public abstract 추가됨 -> 추상 메서드
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 인터페이스는 구현 코드를 가질 수 없기 때문에 default 키워드가 없으면 오류.
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
    }

    // static 키워드를 가진 애는 인스턴스 생성과는 상관없이 사용 가능!!
    static int total(int[] arr) {
        int total = 0;

        for(int i: arr) {
            total += i;
        }
        return total;
    }

    /** 인터페이스에는 상수와 추상 메서드가 선언됨
     * 모든 메서드가 추상 메서드(abstract method)로 이뤄진 클래스
     * 형식적인 선언만 있고 구현은 없음 */
}
