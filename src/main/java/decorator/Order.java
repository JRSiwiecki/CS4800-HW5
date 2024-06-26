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

    public void setDiscount(CustomerLoyaltyStatus customerLoyaltyStatus)
    {
        switch (customerLoyaltyStatus.getStatus())
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

    public double calculateOrderCost()
    {
        double totalCost = 0.0;

        for (FoodItem foodItem : foodItems)
        {
            totalCost += foodItem.calculateCost();
        }

        return totalCost * discount;
    }

    public ArrayList<FoodItem> getFoodItems()
    {
        return foodItems;
    }

    public double getDiscount()
    {
        return discount;
    }
}
