package br.ufpb.Edilson;

import java.util.Objects;

public class Jogos {
    private String nome;
    private String codigo;
    private int nota;


    public Jogos(String nome, String codigo, int nota){
        this.nome=nome;
        this.codigo=codigo;
        this.nota=nota;
    }

    public void setNome(String nome){this.nome=nome;}
    public void setCodigo(String codigo){this.codigo=codigo;}
    public void setNota(int nota){this.nota=nota;}

    public String getNome() {
        return nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public int getNota() {
        return nota;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jogos jogo = (Jogos) o;
        return Objects.equals(codigo, jogo.codigo);
    }







}
