package main.operacoes;

import main.model.Familia;

public class OperacaoEntre901E1500 implements Operacao {
    @Override
    public int executar(Familia familia) {
        return familia.getRenda() >= 901 && familia.getRenda() <= 1500 ? 3 : 0;
    }
}
