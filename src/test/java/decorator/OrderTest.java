package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest
{

    @Test
    void addFoodItem()
    {
        Order order = new Order();
        order.addFoodItem(new Burger());
        assertEquals(1, order.getFoodItems().size());
    }

    @Test
    void setDiscount()
    {
        Order order = new Order();
        CustomerLoyaltyStatus customerLoyaltyStatus = new CustomerLoyaltyStatus("GOOD");
        order.setDiscount(customerLoyaltyStatus);
        assertEquals(0.75, order.getDiscount());
    }

    @Test
    void calculateOrderCost()
    {
        Order order = new Order();
        order.addFoodItem(new Burger());
        order.addFoodItem(new CheeseBurger(new Burger()));
        order.addFoodItem(new BaconCheeseBurger(new CheeseBurger(new Burger())));
        assertEquals(6.00, order.calculateOrderCost());
    }
}