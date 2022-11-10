package week1.mission2.coffeeshop;

public class Person {
    protected String name;
    protected int budget;

    Person() {
    }

    Person(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}