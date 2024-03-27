package decorator;

import java.util.ArrayList;

public class Burger implements FoodItem
{
    private final double basePrice;
    private final ArrayList<String> toppings;

    public Burger()
    {
        basePrice = 1.00;
        toppings = new ArrayList<>();
    }

    @Override
    public double calculateCost()
    {
        return basePrice + (toppings.size() * 0.25);
    }

    public void addTopping(String topping)
    {
        toppings.add(topping);
    }

    public ArrayList<String> getToppings()
    {
        return toppings;
    }
}
