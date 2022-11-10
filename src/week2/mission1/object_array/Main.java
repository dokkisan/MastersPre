package week2.mission1.object_array;

import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // 온마을(A) 도서관 도서 리스트 생성
        List<Book> libraryA = new ArrayList<>();

        libraryA.add(new Book("제목", "저자"));
        libraryA.add(new Book("태백산맥", "조정래"));
        libraryA.add(new Book("이기적 유전자", "리처드 도킨즈"));
        libraryA.add(new Book("자전거 도둑", "박완서"));
        libraryA.add(new Book("토지", "박경리"));
        libraryA.add(new Book("대변동", "제레드 다이아몬드"));


        // 온마을(A) 도서관 백업 리스트 생성 - 얕은 복사
        List<Book> libraryA_1 = new ArrayList<>(libraryA);

        // 두마을(B) 도서관 개관 리스트 생성 - 깊은 복사
        List<Book> libraryB = new ArrayList<>();
        for (Book book : libraryA) {
            libraryB.add((Book) book.clone());
        }


        // ** 두마을 도서관 개관 시점 도서관별 도서 리스트 **
        System.out.println();
        System.out.println("======== 도서 목록 업데이트 ========");

        System.out.println("#A. 온마을 도서관 도서 목록");
        for(int i=0; i<libraryA.size(); i++) {
            System.out.println(libraryA.get(i).showBookInfo());
        }
        System.out.println();

        System.out.println("#A-1. 온마을 도서관 백업용 목록");
        for(int i=0; i<libraryA_1.size(); i++) {
            System.out.println(libraryA_1.get(i).showBookInfo());
        }
        System.out.println();

        System.out.println("#B. 두마을 도서관 도서 목록");
        for(int i=0; i<libraryB.size(); i++) {
            System.out.println(libraryB.get(i).showBookInfo());
        }
        System.out.println();


        // ** 도서관별 도서 목록 업데이트 **
        System.out.println();
        System.out.println("======== 도서 목록 업데이트 ========");

        // 온마을 도서관 목록 수정
        System.out.println("#A. 온마을 도서관 도서 목록");
        libraryA.get(3).setBookTitle("그 많던 싱아는 누가 다 먹었을까");

        for(int i=0; i<libraryA.size(); i++) {
            System.out.println(libraryA.get(i).showBookInfo());
        }
        System.out.println();


        // 온마을 도서관 백업용 목록 자동 업데이트
        System.out.println("#A-1. 온마을 도서관 백업용");
        for(int i=0; i<libraryA_1.size(); i++) {
            System.out.println(libraryA_1.get(i).showBookInfo());
        }
        System.out.println();


        // 두마을 도서관 도서 목록 추가
        libraryB.add(new Book("사피엔스", "유발 하라리"));

        System.out.println("#B. 두마을 도서관 도서 목록");
        for(int i=0; i<libraryB.size(); i++) {
            System.out.println(libraryB.get(i).showBookInfo());
        }
        System.out.println();
    }
}