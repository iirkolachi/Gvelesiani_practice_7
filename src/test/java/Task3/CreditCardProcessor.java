package Task3;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void process(double amount) {
        System.out.println("Payment of " + amount + " GEL is processed by the Credit Card.");
    }
}
