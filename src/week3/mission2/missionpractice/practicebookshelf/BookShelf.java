package week3.mission2.missionpractice.practicebookshelf;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    // ArrayList에서 하나를 꺼낼 건데 맨 앞에서 꺼낼거임 FIFO
    // get은 아님. get 참조. 어떤게 있는지 보는 것.
    // 우리가 할 건 ArrayList에 있는 개수를 하나 제거할거임. 맨 앞에 있는 거
    public String deQueue() {
        return shelf.remove(0); // 리턴하면 스트링 타입의 데이터 나올거임
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
