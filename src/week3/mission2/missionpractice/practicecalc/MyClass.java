package week3.mission2.missionpractice.practicecalc;

public class MyClass implements MyInterface {

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        // MyClass가 X 인터페이스를 구현했으니까, MyClass를 x 인터페이스에 제공하면 x 메서드만 사용 가능
        X xClass = myClass;
        xClass.x();
        /** Class 인스턴스가 생성되었다고 해도, 이 인스턴스가 어떤 타입에 대입되었냐에 따라
         * 사용 가능한 메서드가 한정적일 수 있음.
         */
    }
}
