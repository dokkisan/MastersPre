package week3.mission2.missionpractice.practicecalc;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("판매주문");
    }
}
