package br.com.storage.model;

import java.time.LocalDate;

public class Employee {

    private String name;
    private int registration;
    private LocalDate birthDate;
    private String user;
    private String password;

    public Employee(String name, int registration, LocalDate birthDate) {
        this.name = name;
        this.registration = registration;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getRegistration() {
        return registration;
    }

    public LocalDate getDateOfBirth() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getName() + '\'' +
                ", matricula=" + getRegistration() +
                ", dataNascimento=" + getDateOfBirth() +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
