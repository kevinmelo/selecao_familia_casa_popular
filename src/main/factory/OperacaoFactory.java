package main.factory;

import main.model.Familia;
import main.operacoes.*;

import java.util.Arrays;
import java.util.List;

public class OperacaoFactory {
    private static final List<Operacao> operacoes = Arrays.asList(new OperacaoEntre901E1500(), new OperacaoRendaAte900(), new Operacao1Ou2Dependentes(), new Operacao3OuMaisDependentes());

    public static int calcularTotalPontos(Familia familia) {
        return operacoes.stream().mapToInt(o -> o.executar(familia)).sum();
    }
}
