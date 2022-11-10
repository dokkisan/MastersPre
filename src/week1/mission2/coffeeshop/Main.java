package week1.mission2.coffeeshop;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("James", 5000);
        Person p2 = new Person("Tomas", 10000);
        CoffeeShop starCafe = new StarCafe();
        CoffeeShop beanCafe = new BeanCafe();
        buyCoffee(p1, starCafe);
        buyCoffee(p2, beanCafe);

        System.out.println(p1.getName() + "님의 남은 돈은 " + p1.getBudget() + "입니다. "
                + starCafe.getShopName() + "에서 " + starCafe.getMenu() + "를 마셨습니다.");
        System.out.println(p2.getName() + "님의 남은 돈은 " + p2.getBudget() + "입니다. "
                + beanCafe.getShopName() + "에서 " + beanCafe.getMenu() + "를 마셨습니다.");
        }

        static void buyCoffee(Person person, CoffeeShop coffeeShop) {
           int leftMoney = person.getBudget() - coffeeShop.getPrice();
           person.setBudget(leftMoney);
           }

        // 문법적으로 오류가 있는건지?
//
//            System.out.println(p1.name + "님의 남은 돈은 " + leftMoney + "입니다. "
//                + starCafe.shopName + "에서 " + starCafe.menu + "를 마셨습니다.");
//        System.out.println(p2.name + "님의 남은 돈은 " + (p2.budget-beanCafe.price) + "입니다. "
//                + beanCafe.shopName + "에서 " + beanCafe.menu + "를 마셨습니다.");
}
