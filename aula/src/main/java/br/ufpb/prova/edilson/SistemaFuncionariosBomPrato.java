package br.ufpb.prova.edilson;

import java.util.HashMap;
import java.util.Map;

public class SistemaFuncionariosBomPrato implements SistemaFuncionarios{
    private Map<String, Funcionario> funcionarios;


    public SistemaFuncionariosBomPrato(){
        this.funcionarios = new HashMap<String, Funcionario>();
    }


    public void cadastrarFuncionario(String cpf, String nome, TipoFuncionario
            tipo, double salario) throws FuncionarioJaExisteException {
        if (this.funcionarios.containsKey(cpf)){
            throw new FuncionarioJaExisteException(
                    "Já existe funcionário com o cpf "+cpf);
        } else {
            this.funcionarios.put(cpf, new Funcionario(cpf, nome,
                    salario));
        }
    }

    public void pesquisarFuncionariosComSalarioMaiorQue(double Salario){

    }


}