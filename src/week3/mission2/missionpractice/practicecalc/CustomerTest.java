package week3.mission2.missionpractice.practicecalc;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer();

        Buy buyer = customer; // buyCustomer 인터페이스에 대입
        buyer.buy();

        Sell seller = customer; // Sell 인터페이스에 대입
        seller.sell();

        /** 인스턴스의 타입이 Customer일 때는 Customer의 메서드를 모두 사용 가능
         * 이 타입을 어떤 변수에다 바인딩(대입)했냐에 따라서 호출할 수 있는게 한정적으로 제한됨 */

        customer.order();
        buyer.order();
        seller.order();
        // 오버라이딩을 하면 customer 메소드가 출력됨 => '가상 메서드'
        /** 자바는 모두 가상 메서드 방식
         * 현재 buyer에 바인딩된 인스턴스가 Customer -> 오버라이딩된 Customer의 order 호출됨 */
    }
}
