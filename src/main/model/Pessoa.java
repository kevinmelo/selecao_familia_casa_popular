package main.model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private final double renda;
    private final LocalDate nascimento;

    public Pessoa(LocalDate dataNascimento, double renda) {
        this.nascimento = dataNascimento;
        this.renda = renda;
    }

    public int getIdade() {
        return Period.between(this.nascimento, LocalDate.now()).getYears();
    }

    public double getRenda() {
        return renda;
    }

    @Override
    public String toString() {
        return "Idade: " + this.getIdade() + " Renda: " + this.getRenda();
    }
}
