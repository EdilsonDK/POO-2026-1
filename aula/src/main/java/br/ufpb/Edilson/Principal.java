package br.ufpb.Edilson;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        SistemaAvaliacaoJogos sistema =
                new SistemaAvaliacaoJogos();

        try {

            System.out.print("Nome do jogo: ");
            String nome = leitor.nextLine();

            System.out.print("Gênero: ");
            String genero = leitor.nextLine();

            System.out.print("Nota: ");
            double nota = leitor.nextDouble();

            Jogo jogo =
                    new Jogo(nome, genero, nota);

            sistema.adicionarJogo(jogo);

            // Tentando adicionar novamente
            sistema.adicionarJogo(jogo);

        } catch (JogoJaExisteException e) {

            System.out.println(
                    "Erro: " + e.getMessage());

        } catch (Exception e) {

            System.out.println(
                    "Digite uma nota válida!");
        }

        System.out.println("\nJogos cadastrados:");

        for (Jogo j : sistema.listarJogos()) {
            System.out.println(j);
            System.out.println("Classificação: "
                    + j.classificar());
        }

        System.out.println("\nMédia das notas: "
                + sistema.calcularMediaNotas());

        leitor.close();
    }
}
