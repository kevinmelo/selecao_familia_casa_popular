package main.factory;

import main.model.Familia;
import main.model.Pessoa;

import java.util.ArrayList;
import java.util.Random;

public class FamiliaFactory {
    private static final Random random = new Random();

    public static Familia gerarFamilia() {
        ArrayList<Pessoa> dependentes = new ArrayList<>();

        for (int i = random.nextInt(5) + 1; i > 0; i--) {
            dependentes.add(PessoaFactory.geraPessoa());
        }

        char nomeFamilia = (char) (random.nextInt('z' - 'a') + 'a');

        return new Familia(nomeFamilia, PessoaFactory.geraPessoa(), PessoaFactory.geraPessoa(), dependentes);
    }
}
