package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaconCheeseBurgerTest
{

    @Test
    void calculateCost()
    {
        BaconCheeseBurger baconCheeseBurger = new BaconCheeseBurger(new CheeseBurger(new Burger()));
        assertEquals(3.00, baconCheeseBurger.calculateCost());
    }

    @Test
    void addTopping()
    {
        BaconCheeseBurger baconCheeseBurger = new BaconCheeseBurger(new CheeseBurger(new Burger()));
        baconCheeseBurger.addTopping("no lettuce");
        assertEquals(1, baconCheeseBurger.getToppings().size());
    }
}