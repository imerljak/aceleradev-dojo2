import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CaixaEletronicoTest {

    @Test
    public void testSaqueCemReais() {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        List<Nota> saque = caixaEletronico.sacar(100);

        long contagem = contarNotas(saque, 100);

        assertEquals(1, contagem);
    }

    private long contarNotas(List<Nota> saque, Integer valorNota) {
        return saque.stream()
                .filter(nota -> nota.getValor() == valorNota)
                .count();
    }

    @Test
    public void testSaqueCentoECinquenta() {
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        List<Nota> saque = caixaEletronico.sacar(150);

        long contagemCem = contarNotas(saque, 100);
        long contagemCinquenta = contarNotas(saque, 50);

        assertEquals(1, contagemCem);
        assertEquals(1, contagemCinquenta);
    }

}
