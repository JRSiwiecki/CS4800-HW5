package decorator;

import static org.junit.jupiter.api.Assertions.*;

class BurgerTest
{

    @org.junit.jupiter.api.Test
    void calculateCost()
    {
        Burger burger = new Burger();
        assertEquals(1.00, burger.calculateCost());
    }

    @org.junit.jupiter.api.Test
    void addTopping()
    {
        Burger burger = new Burger();
        burger.addTopping("pickles");
        assertEquals(1.25, burger.calculateCost());
    }
}