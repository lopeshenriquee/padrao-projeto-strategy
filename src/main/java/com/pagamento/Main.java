package main.java.com.pagamento;

import main.java.com.pagamento.strategy.CreditCardPayment;
import main.java.com.pagamento.strategy.PayPalPayment;
import main.java.com.pagamento.strategy.PaymentStrategy;
import main.java.com.pagamento.strategy.context.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Cria um carrinho de compras
        ShoppingCart cart = new ShoppingCart();

        // Define a estratégia de pagamento como pagamento com cartão de crédito
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100); // Pagamento de $100 com cartão de crédito

        // Define a estratégia de pagamento como pagamento com PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(200); // Pagamento de $200 com PayPal
    }
}
