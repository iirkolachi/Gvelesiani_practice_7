package Task3;

public class PaymentService {
    public static void executivePayment(PaymentProcessor paymentProcessor, double amount) {
        paymentProcessor.process(amount);
    }
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardProcessor();
        PaymentProcessor paypal = new PayPalProcessor();

        executivePayment(creditCard,150.5);
        executivePayment(paypal,620.7);
    }
}
