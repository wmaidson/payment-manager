package br.com.storage.io;

import br.com.storage.model.Payment;
import br.com.storage.model.Type;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReaderCSV extends Reader implements ReaderPayment {

    @Override
    public List<Payment> read(int code) throws IOException {
        String file = returnsFile(code);

        ArrayList<Payment> payments = new ArrayList<>();

        Path path = Paths.get(file);

        List<String> lines = Files.readAllLines(path, Charset.forName("utf-8"));

        lines.forEach(line -> {
            String[] words = line.split(",");
            if (!line.isEmpty()) {
                Double value = Double.valueOf(words[0]);
                String description = words[1];
                Type type = Type.valueOf(words[2]);
                Payment payment = new Payment(type, value, description);
                payments.add(payment);
            }
        });

        generateBackup(path);
        return payments;
    }
}
