package DependencyInversionPrinciple;

/**
 * High-level modules depend on interfaces, not implementations.
 */

public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }
}
