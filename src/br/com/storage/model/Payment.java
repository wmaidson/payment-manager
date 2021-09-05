package br.com.storage.model;

import java.time.LocalDate;

public class Payment {

    private String description;
    private Type type;
    private double value;
    private LocalDate data;

    public Payment(Type type, double value, String description) {
        this.type = type;
        this.value = value;
        this.description = description;
        this.data = LocalDate.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "descricao='" + description + '\'' +
                ", tipo=" + type +
                ", valor=" + value +
                ", data=" + data +
                '}';
    }
}
