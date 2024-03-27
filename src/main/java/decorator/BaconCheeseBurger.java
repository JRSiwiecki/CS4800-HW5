package decorator;

public class BaconCheeseBurger implements FoodItem
{
    private final CheeseBurger cheeseBurger;
    private final double basePrice;

    public BaconCheeseBurger(CheeseBurger cheeseBurger)
    {
        this.cheeseBurger = cheeseBurger;
        basePrice = 1.00;
    }

    public void addTopping(String topping)
    {
        cheeseBurger.addTopping(topping);
    }

    @Override
    public double calculateCost()
    {
        return cheeseBurger.calculateCost() + basePrice;
    }
}
