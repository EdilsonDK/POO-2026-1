package br.ufpb.prova.edilson;

import java.util.Objects;

public class Funcionario {
private String cpf;
private String nome;
private double Salario;

public Funcionario (String cpf,String nome,double salario){
    this.cpf=cpf;
    this.nome=nome;
    this.Salario=salario;

}

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        this.Salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + Salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Double.compare(Salario, that.Salario) == 0 && Objects.equals(cpf, that.cpf) && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, Salario);
    }
}
