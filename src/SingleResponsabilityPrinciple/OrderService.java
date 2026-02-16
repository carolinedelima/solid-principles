package SingleResponsabilityPrinciple;

/**
 * One class = one job.
 * Java tends to encourage big “service” classes, so SRP is about resisting the God Object.
 */

public class OrderService {

    private final OrderRepository repository;
    private final EmailService emailService;

    public OrderService(OrderRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void createOrder(Order order) {
        repository.save(order);
        emailService.sendConfirmation(order);
    }

}
