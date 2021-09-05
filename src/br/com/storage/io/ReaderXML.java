package br.com.storage.io;

import br.com.storage.model.Payment;

import java.io.IOException;
import java.util.List;

public class ReaderXML extends Reader implements ReaderPayment {


    @Override
    public List<Payment> read(int codigo) throws IOException {
        return null;
    }
}
