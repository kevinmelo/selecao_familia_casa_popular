package main.operacoes;

import main.model.Familia;

public class OperacaoRendaAte900 implements Operacao {
    @Override
    public int executar(Familia familia) {
        return familia.getRenda() <= 900 ? 5 : 0;
    }
}
