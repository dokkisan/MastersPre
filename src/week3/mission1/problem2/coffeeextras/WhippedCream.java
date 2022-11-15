package week3.mission1.problem2.coffeeextras;

import week3.mission1.problem2.Coffee;
import week3.mission1.problem2.CoffeeDecorator;

public class WhippedCream extends CoffeeDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Adding WhippedCream ");
    }
}
