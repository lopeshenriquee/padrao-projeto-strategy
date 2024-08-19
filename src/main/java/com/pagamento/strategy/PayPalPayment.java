package main.java.com.pagamento.strategy;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double value) {
        System.out.println("Pagando R$" + value + " usando PayPal: " + email);
    }
}
