package decorator;

import java.util.ArrayList;

public class Burger implements FoodItem
{
    private final double basePrice;

    public Burger()
    {
        basePrice = 1.00;
    }

    @Override
    public double calculateCost()
    {
        return basePrice;
    }
}
