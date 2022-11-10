package week2.mission1.char_array;

public class CharArr {
    public static void main(String[] args) {
        char[] arrChar = new char[26];

        for(int i=0; i<arrChar.length; i++) {
            arrChar[i] = (char) ('A'+ i);
            System.out.print(arrChar[i]);
        }
    }
}
