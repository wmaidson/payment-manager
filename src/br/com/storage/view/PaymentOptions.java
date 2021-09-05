package br.com.storage.view;
import br.com.storage.io.ReaderCSV;
import br.com.storage.model.Payment;
import br.com.storage.service.PaymentService;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PaymentOptions {

    public void welcomeMessage() {
        System.out.println("Storage");
        readFromFile();
    }

    private void readFromFile() {
        System.out.println("Informe o código do arquivo que deseja registrar os pagamentos:");


        ReaderCSV reader = new ReaderCSV();
        presentAvailableFiles(reader);

        try {
            int fileCode = askForCode();

            List<Payment> payments = reader.read(fileCode);
            PaymentService record = new PaymentService();
            record.register(payments);
        } catch (NoSuchFileException | NoSuchElementException e) {
            System.out.println("Arquivo não encontrado");
        } catch (IOException | NullPointerException e) {
            System.out.println("Erro na leitura do arquivo");
        }
    }

    private void presentAvailableFiles(ReaderCSV reader) {
        try {
            Iterator<Path> list = reader.list();
            int i = 1;
            while (list.hasNext()) {
                Path path = list.next();
                System.out.println(i++ + " - " + path.getFileName().toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int askForCode() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
