package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseBurgerTest
{

    @Test
    void calculateCost()
    {
        CheeseBurger cheeseBurger = new CheeseBurger(new Burger());
        assertEquals(2.00, cheeseBurger.calculateCost());
    }

    @Test
    void addTopping()
    {
        CheeseBurger cheeseBurger = new CheeseBurger(new Burger());
        cheeseBurger.addTopping("extra salt");
        cheeseBurger.addTopping("extra cheese");
        assertEquals(2, cheeseBurger.getToppings().size());
    }
}