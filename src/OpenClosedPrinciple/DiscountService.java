package OpenClosedPrinciple;

import java.util.List;

/**
 * Add new behavior without changing existing code.
 * Java’s interfaces and abstract classes make this clean.
 */

public class DiscountService {
    private final List<DiscountPolicy> policies;

    public DiscountService(List<DiscountPolicy> policies) {
        this.policies = policies;
    }

    public double calculate(Order order) {
        return policies.stream()
                .mapToDouble(p -> p.apply(order))
                .sum();
    }
}
