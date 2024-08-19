package main.java.com.pagamento.strategy.context;

import main.java.com.pagamento.strategy.PaymentStrategy;

public class ShoppingCart {
    private PaymentStrategy PaymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.PaymentStrategy = paymentStrategy;
    }

    public void checkout(double value){
        PaymentStrategy.pay(value);
    }
}
