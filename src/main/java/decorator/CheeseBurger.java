package decorator;

public class CheeseBurger implements FoodItem
{
    private final Burger burger;
    private final double basePrice;

    public CheeseBurger(Burger burger)
    {
        this.burger = burger;
        basePrice = 1.00;
    }

    @Override
    public double calculateCost()
    {
        return burger.calculateCost() + basePrice;
    }
}
