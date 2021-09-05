package br.com.storage.model;

import java.time.LocalDate;

public class Manager extends Employee {

    private double bonus;
    private String user;
    private String password;

    public Manager(String name, int registration, LocalDate birthDate) {
        super(name, registration, birthDate);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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
