package decorator;

public class Main
{
    public static void main(String[] args)
    {
        // Normal order, no discount, no toppings
        Order order1 = new Order();

        Burger burger1 = new Burger();
        order1.addFoodItem(burger1);

        CheeseBurger cheeseBurger1 = new CheeseBurger(new Burger());
        order1.addFoodItem(cheeseBurger1);

        BaconCheeseBurger baconCheeseBurger1 = new BaconCheeseBurger(new CheeseBurger(new Burger()));
        order1.addFoodItem(baconCheeseBurger1);

        System.out.println(order1.calculateOrderCost());

        // No discount, some toppings
        Order order2 = new Order();

        CheeseBurger cheeseBurger2 = new CheeseBurger(new Burger());
        cheeseBurger2.addTopping("pickles");
        cheeseBurger2.addTopping("extra salt");

        order2.addFoodItem(cheeseBurger2);

        System.out.println(order2.calculateOrderCost());

        // Discount, and toppings
        Order order3 = new Order();

        BaconCheeseBurger baconCheeseBurger2 = new BaconCheeseBurger(new CheeseBurger(new Burger()));
        baconCheeseBurger2.addTopping("no lettuce");

        CustomerLoyaltyStatus customerLoyaltyStatus1 = new CustomerLoyaltyStatus("GREAT");
        customerLoyaltyStatus1.applyDiscount(order3);

        order3.addFoodItem(baconCheeseBurger2);

        System.out.println(order3.calculateOrderCost());
    }
}
