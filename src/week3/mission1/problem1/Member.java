package week3.mission1.problem1;

import java.util.ArrayList;
import java.util.List;

public class Member {
//    private List<Member> memberList = new ArrayList<>();

    protected String customerName;    // 고객 이름
    protected String customerGrade;   // 고객 등급
    protected int price;    // 쇼핑 금액
    protected int stayTime;           // 머문 시간
    double discountRate;    // 할인율
    double pointRate;       // 적립률
    int point;              // 적립 포인트
    int parkingFee;         // 주차 요금
    int parkingBenefit = 3000;     // 주차 혜택


    public Member(String customerName, int price, int stayTime) {
        this.customerName = customerName;
        this.price = price;
        this.stayTime = stayTime;
        customerGrade = "RED"; // 기본 등급
        pointRate = 0.01;      // 기본 적립률

    }

//    public static Member getMember() {
//        return new Member();
//    }

//    public Member createMember() {
//        Member member = new Member();
//        memberLis.add(member);
//        return member;
//    }


    public int calcPrice(int price) {
        return point += price * pointRate; // 포인트 계산
//        return price - (int) (price * discountRate); // 할인율 적용
    }

    public int calcParking(int stayTime) {
        return parkingFee += stayTime * parkingBenefit;
    }

    public String showCustomerInfo() {
        return customerName + "님의 지불금액은 " + price + "원 이고, " +
                "적립 포인트는 " + point + "점 입니다. " +
                "주차요금은 " + parkingFee + "원 입니다.";
    }
}
