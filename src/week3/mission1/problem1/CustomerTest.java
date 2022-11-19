package week3.mission1.problem1;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    public static void main(String[] args) {

        Member customer1 = new Member("James", 10000, 2);
        Member customer2 = new Member("Tomas", 30000, 2);
        Member customer3 = new Platinum("Edward", 10000, 2);
        Member customer4 = new Platinum("Percy", 30000, 2);
        Member customer5 = new Diamond("Elizabat", 30000, 2);

        List<Member> memberList = new ArrayList<>();
        memberList.add(customer1);
        memberList.add(customer2);
        memberList.add(customer3);
        memberList.add(customer4);
        memberList.add(customer5);

        for(Member member : memberList) {
            member.calcPrice(member.price);
            member.calcParking(member.stayTime);
            System.out.println(member.showCustomerInfo());
        }
    }
}

