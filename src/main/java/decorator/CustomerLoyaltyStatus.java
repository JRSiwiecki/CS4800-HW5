package decorator;

public class CustomerLoyaltyStatus
{
    private final String status;

    public CustomerLoyaltyStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public void applyDiscount(Order order)
    {
        order.setDiscount(this);
    }
}
