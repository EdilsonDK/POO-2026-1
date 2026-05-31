package br.ufpb.Edilson;

public class Jogo {

    private String nome;
    private String genero;
    private double nota;

    public Jogo(String nome, String genero, double nota) {
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String classificar() {
        if (nota >= 9) {
            return "Excelente";
        } else if (nota >= 7) {
            return "Bom";
        } else if (nota >= 5) {
            return "Regular";
        }
        return "Ruim";
    }

    @Override
    public String toString() {
        return "Jogo [nome=" + nome +
                ", genero=" + genero +
                ", nota=" + nota + "]";
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Jogo))
            return false;

        Jogo outro = (Jogo) obj;

        return nome.equals(outro.nome);
    }
}