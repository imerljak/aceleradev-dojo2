import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
    public List<Nota> sacar(int valorSaque) {
        List<Nota> notasSaque = new ArrayList<>();

        int notas = 0;

        if (valorSaque >= 100) {
            valorSaque %= 100;

            adicionaNotas(notasSaque, valorSaque / 100);
        }

        if (valorSaque >= 50) {
            adicionaNotas(notasSaque, valorSaque / 50);
            valorSaque %= 50;
        }

        if (valorSaque >= 20) {
            adicionaNotas(notasSaque, valorSaque / 50);
            valorSaque %= 50;
        }

        if (valorSaque >= 10) {
            adicionaNotas(notasSaque, valorSaque / 10);
            valorSaque %= 10;
        }

        notasSaque.add(new Nota(100));

        return notasSaque;
    }

    private void adicionaNotas(List<Nota> notasSaque, int quantidade) {
        // TODO
    }
}
