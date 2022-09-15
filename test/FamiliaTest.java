import main.model.Familia;
import main.model.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FamiliaTest {

    @Test
    public void testSemPontos() {
        Familia familia = new Familia(
                'A',
                new Pessoa(LocalDate.parse("1992-02-16"), 5000),
                new Pessoa(LocalDate.parse("1992-01-05"), 5000),
                new ArrayList<>()
        );
        assertEquals(0, familia.getPontuacao());
    }

    @Test
    public void testEntre901E1500() {
        Familia familia = new Familia(
                'B',
                new Pessoa(LocalDate.parse("2000-02-16"), 1000),
                new Pessoa(LocalDate.parse("2000-01-05"), 500),
                new ArrayList<>()
        );
        assertEquals(3, familia.getPontuacao());

        familia = new Familia(
                'B',
                new Pessoa(LocalDate.parse("2000-02-16"), 301),
                new Pessoa(LocalDate.parse("2000-01-05"), 300),
                new ArrayList<>() {
                    {
                        add(new Pessoa(LocalDate.parse("2000-01-05"), 300));
                    }
                }
        );
        assertEquals(3, familia.getPontuacao());
    }

    @Test
    public void testAte900() {
        Familia familia = new Familia(
                'B',
                new Pessoa(LocalDate.parse("2000-02-16"), 400),
                new Pessoa(LocalDate.parse("2000-01-05"), 400),
                new ArrayList<>()
        );
        assertEquals(5, familia.getPontuacao());
    }
}