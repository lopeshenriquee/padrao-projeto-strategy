package main.java.com.pagamento.strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double value) {
        System.out.println("Pagando R$" + value + " usando Cartão de Crédito: " + cardNumber);
    }
}
