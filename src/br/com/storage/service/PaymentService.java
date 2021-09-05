package br.com.storage.service;

import br.com.storage.model.Payment;
import br.com.storage.registrar.PaymentRecord;
import br.com.storage.dto.PaymentValidate;

import java.util.List;

public class PaymentService {

    PaymentRecord record = new PaymentRecord();

    public void register(List<Payment> payments) {
        PaymentValidate validator = new PaymentValidate();
        validator.checkType(payments);
        record.register(payments);
    }

    public void displaysDone() {
        record.displaysDone();
    }
}
