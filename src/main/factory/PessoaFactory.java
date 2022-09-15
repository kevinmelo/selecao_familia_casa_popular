package main.factory;

import main.model.Pessoa;

import java.time.LocalDate;
import java.util.Random;

public class PessoaFactory {
    private static final Random random = new Random();

    public static Pessoa geraPessoa() {
        LocalDate nascimento = LocalDate.now().minusYears(random.nextInt(60));
        double renda = random.nextInt(1000);

        return new Pessoa(nascimento, renda);
    }
}
