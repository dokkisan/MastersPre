package week3.mission2.missionpractice.practicebookshelf;

public interface Queue {
    // Queue에는 세 가지 메서드가 정의되어 있음

    void enQueue(String title);
    String deQueue();
    int getSize();
}
