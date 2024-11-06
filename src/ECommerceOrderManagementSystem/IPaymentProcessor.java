package ECommerceOrderManagementSystem;

public interface IPaymentProcessor {
    boolean processPayment(double amount);
}
