package br.com.storage.io.test;

import br.com.storage.io.ReaderCSV;
import br.com.storage.model.Payment;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderCSVTest {

    @Test
    void AprilPayments() throws IOException {

        ReaderCSV reader = new ReaderCSV();
        List<Payment> payments = reader.read(1);
        assertEquals(5, payments.size());
    }

    @Test
    void MayPayments() throws IOException {

        ReaderCSV reader = new ReaderCSV();
        List<Payment> payments = reader.read(3);
        assertEquals(5, payments.size());
    }

    @Test
    void JunePayments() throws IOException {

        ReaderCSV reader = new ReaderCSV();
        List<Payment> payments = reader.read(2);
        assertEquals(5, payments.size());
    }
}
