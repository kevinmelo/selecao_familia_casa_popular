package main.model;

import main.factory.OperacaoFactory;

import java.util.ArrayList;

public record Familia(
        char nome,
        Pessoa pretendente,
        Pessoa conjugue,
        ArrayList<Pessoa> dependentes
) implements Comparable<Familia> {

    public double getRenda() {
        double rendaDependentes = this.dependentes.stream().mapToDouble(Pessoa::getRenda).sum();
        return rendaDependentes + this.pretendente.getRenda() + this.conjugue.getRenda();
    }

    public int getPontuacao() {
        return OperacaoFactory.calcularTotalPontos(this);
    }

    @Override
    public int compareTo(Familia f) {
        return f.getPontuacao() - this.getPontuacao();
    }

    @Override
    public String toString() {
        return Character.toUpperCase(this.nome) + " | " + this.getRenda() + " | " + this.getPontuacao() + " | " + this.dependentes;
    }
}
