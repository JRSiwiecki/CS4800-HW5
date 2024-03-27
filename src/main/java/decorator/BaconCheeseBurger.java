package decorator;

import java.util.ArrayList;

public class BaconCheeseBurger implements FoodItem
{
    private final CheeseBurger cheeseBurger;
    private final double basePrice;

    public BaconCheeseBurger(CheeseBurger cheeseBurger)
    {
        this.cheeseBurger = cheeseBurger;
        basePrice = 1.00;
    }

    @Override
    public double calculateCost()
    {
        return cheeseBurger.calculateCost() + basePrice;
    }

    public void addTopping(String topping)
    {
        cheeseBurger.addTopping(topping);
    }

    public ArrayList<String> getToppings()
    {
        return cheeseBurger.getToppings();
    }
}
