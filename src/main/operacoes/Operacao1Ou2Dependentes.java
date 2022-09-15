package main.operacoes;

import main.model.Familia;
import main.model.Pessoa;

import java.util.List;

public class Operacao1Ou2Dependentes implements Operacao {
    @Override
    public int executar(Familia familia) {
        List<Pessoa> dependentesMaiores = familia.dependentes().stream().filter(d -> d.getIdade() < 18).toList();

        return dependentesMaiores.size() >= 1 && dependentesMaiores.size() <= 2 ? 2 : 0;
    }
}
