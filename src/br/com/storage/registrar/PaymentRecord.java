package br.com.storage.registrar;

import br.com.storage.model.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentRecord {

    private final List<Payment> Payments = new ArrayList<>();

    public void register(List<Payment> payments) {
        for (Payment payment : payments) {
            save(payment);
        }
    }

    private void save(Payment payment) {
        Payments.add(payment);
        System.out.println("Pagamento realizado " + payment);
    }

    public void displaysDone() {
        if (Payments.isEmpty()) {
            System.out.println("Não tem pagamentos registrados");
        } else {
            System.out.println("Todos os pagamentos");
            for (Payment paymentsRegistered : Payments) {
                System.out.println(paymentsRegistered);
            }
        }
    }

}
