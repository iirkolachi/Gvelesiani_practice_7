package Task3;

public class PayPalProcessor implements PaymentProcessor{
    @Override
    public void process(double amount) {
        System.out.println("Payment of " + amount + " GEL is processed by the PayPal.");
    }
}
