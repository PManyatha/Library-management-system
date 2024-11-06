package ECommerceOrderManagementSystem;public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1500.00, 10);
        Product product2 = new Product("Mouse", 25.00, 50);

        // Create customer
        Customer customer = new Customer("John Doe", "john@example.com", "123 Main St");

        // Create an order
        Order order = new Order(customer);
        order.addProduct(product1);
        order.addProduct(product2);

        // Create payment processor and invoice generator
        IPaymentProcessor creditCardProcessor = new CreditCardProcessor();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        // Process order with credit card payment
        OrderProcessor orderProcessorWithCreditCard = new OrderProcessor(creditCardProcessor, invoiceGenerator);
        orderProcessorWithCreditCard.processOrder(order);

        // Create a new payment processor for PayPal
        IPaymentProcessor paypalProcessor = new PayPalProcessor();

        // Process order with PayPal payment
        OrderProcessor orderProcessorWithPayPal = new OrderProcessor(paypalProcessor, invoiceGenerator);
        orderProcessorWithPayPal.processOrder(order);
    }
}

