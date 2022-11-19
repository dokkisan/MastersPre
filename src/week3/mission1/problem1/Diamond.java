package week3.mission1.problem1;

public class Diamond extends Member {

    public Diamond(String customerName, int price, int stayTime) {
        super(customerName, price, stayTime);
        customerGrade = "Diamond";
        discountRate = 0.1;
        pointRate = 0.1;
        parkingBenefit = 0;
    }

    @Override
    public int calcPrice(int price) {
        point += price * pointRate; // 포인트 계산
        return price - (int) (price * discountRate); // 할인율 적용
    }


//    public String showCustomerInfo() {
//        return customerName + "님의 지불금액은 " + price + "원 이고, " +
//                "적립 포인트는 " + point + "점 입니다. " +
//                "주차요금은 " + (parkingFee = parkingBenefit) + "원 입니다.";
//    }
}
