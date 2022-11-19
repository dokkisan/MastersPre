package week3.mission2.missionpractice.practicecalc;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("구매주문");
    }
}
