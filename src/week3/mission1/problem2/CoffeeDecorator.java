package week3.mission1.problem2;

public abstract class CoffeeDecorator extends Coffee {

    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
