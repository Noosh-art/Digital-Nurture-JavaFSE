package Exercise8;

public class Main {

    public static void main(String[] args) {

        PaymentContext payment;

        payment = new PaymentContext(new CreditCardPayment());
        payment.executePayment(1000);

        payment = new PaymentContext(new PayPalPayment());
        payment.executePayment(2000);

    }

}