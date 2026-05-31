package br.ufpb.Edilson;

import java.util.ArrayList;
import java.util.List;

public class SistemaAvaliacaoJogos {

    private List<Jogo> jogos;

    public SistemaAvaliacaoJogos() {
        jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo)
            throws JogoJaExisteException {

        if (jogos.contains(jogo)) {
            throw new JogoJaExisteException(
                    "Jogo já cadastrado!");
        }

        jogos.add(jogo);
    }

    public List<Jogo> listarJogos() {
        return jogos;
    }

    public double calcularMediaNotas() {

        if (jogos.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (Jogo j : jogos) {
            soma += j.getNota();
        }

        return soma / jogos.size();
    }
}
