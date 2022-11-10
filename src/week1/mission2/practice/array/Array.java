package week1.mission2.practice.array;

public class Array {
    public static void main(String[] args) {
        String a = "a";
        int b = 1;

        int arrayInt[] = new int[10];
        // 배열의 길이만큼 for문을 돌림.
        for (int i = 0; i<arrayInt.length; i++) {
            System.out.println(i);
        }

        int arrayInt2[] = {1, 3, 5, 7, 9};
        for (int i = 0; i<arrayInt2.length; i++) {
            System.out.println(i);
        }

        int arrayInt3[] = {1, 3, 5, 7, 9};
        for (int i = 0; i<arrayInt3.length; i++) {
            System.out.println(arrayInt3[i]);
        }

        String arrayStr[] = {"a", "b", "c", "d", "e"};
        for (int i = 0; i<arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }
    }
}
