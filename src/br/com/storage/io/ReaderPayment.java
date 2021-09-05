package br.com.storage.io;

import br.com.storage.model.Payment;

import java.io.IOException;
import java.util.List;

public interface ReaderPayment {
    List<Payment> read(int codigo) throws IOException;
}
