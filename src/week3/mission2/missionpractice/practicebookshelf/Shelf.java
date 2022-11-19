package week3.mission2.missionpractice.practicebookshelf;

import java.util.ArrayList;

public class Shelf {
    // Shelf에는 무언가를 쌓을 수 있는 자료구조 가짐.

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
