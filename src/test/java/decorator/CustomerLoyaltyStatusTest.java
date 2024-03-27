package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerLoyaltyStatusTest
{

    @Test
    void applyDiscount()
    {
        CustomerLoyaltyStatus customerLoyaltyStatus = new CustomerLoyaltyStatus("GREAT");
        Order order = new Order();
        customerLoyaltyStatus.applyDiscount(order);
        assertEquals(0.5, order.getDiscount());
    }
}