package OpenClosedPrinciple;

public class EmployeeDiscount implements DiscountPolicy {
    public double apply(Order order) {
        return 0.3;
    }
}
