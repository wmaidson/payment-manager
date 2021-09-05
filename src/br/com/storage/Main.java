package br.com.storage;

import br.com.storage.io.ReaderCSV;
import br.com.storage.model.Payment;
import br.com.storage.view.PaymentOptions;
import org.apache.log4j.Logger;
import java.io.IOException;
import java.util.List;

public class Main {

    static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException {
        new PaymentOptions().welcomeMessage();

        ReaderCSV reader = new ReaderCSV();
        List<Payment> payments = reader.read(1);

        for (Payment payment :
                payments) {
            double grossValue = payment.getValue();

//          Se o valor bruto for acima de 100 adiciona um acréscimo de 10%
            if (grossValue > 100) {
                double valueWithAddition = grossValue * 1.1;
                payment.setValue(valueWithAddition);
            }
            System.out.println(payment);
        }
    }
}
