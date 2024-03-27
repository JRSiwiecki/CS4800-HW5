package decorator;

import java.util.ArrayList;

public class Order
{
    private final ArrayList<FoodItem> foodItems;
    private double discount = 1.0;

    public Order()
    {
        foodItems = new ArrayList<>();
    }

    public void addFoodItem(FoodItem foodItem)
    {
        foodItems.add(foodItem);
    }

    public double calculateOrderCost()
    {
        double totalCost = 0.0;

        for (FoodItem foodItem : foodItems)
        {
            totalCost += foodItem.calculateCost();
        }

        return totalCost * discount;
    }

    public void applyDiscount(String customerStatus)
    {
        switch (customerStatus)
        {
            case "NORMAL":
                discount = 1.0;
                break;
            case "GOOD":
                discount = 0.75;
                break;
            case "GREAT":
                discount = 0.5;
                break;
        }
    }
}
