package br.com.storage.dto;

import br.com.storage.model.Payment;
import br.com.storage.model.Type;

import java.util.List;

public class PaymentValidate {
    public PaymentValidate() {
    }

    public void checkType(Payment payment) {
        if (payment.getType().equals(Type.CREDITO)) {
            double valorComAcrescimo = payment.getValue() * 1.02;
            payment.setValue(valorComAcrescimo);
        }

        if (payment.getType().equals(Type.DEBITO)) {
            double valorComAcrescimo = payment.getValue() * 1.001;
            payment.setValue(valorComAcrescimo);
        }
    }

    public void checkType(List<Payment> payments) {
        for (Payment payment :
                payments) {
            checkType(payment);
        }
    }
}
