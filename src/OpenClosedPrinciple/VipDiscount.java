package OpenClosedPrinciple;

public class VipDiscount implements DiscountPolicy {
    public double apply(Order order) {
        return 0.2;
    }
}
