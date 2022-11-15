package week3.mission1.problem2.coffeeextras;

import week3.mission1.problem2.Coffee;
import week3.mission1.problem2.CoffeeDecorator;

public class Latte extends CoffeeDecorator {

    public Latte(Coffee coffee) {
        super(coffee);
    }

//    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Adding Milk ");
    }
}
