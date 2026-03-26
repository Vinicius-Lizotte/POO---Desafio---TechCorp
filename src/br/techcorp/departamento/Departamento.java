package br.techcorp.departamento;

import br.techcorp.funcionario.Funcionario;

public class Departamento {
    private String codigo, nome;
    private Funcionario[] func;
    private int Index;

    public Departamento(String codigo, String nome, int quantidadeFuncionarios) {
        this.codigo = codigo;
        this.nome = nome;
        this.func = new Funcionario[quantidadeFuncionarios];
    }

    public void adicionarFuncionario(Funcionario f){
        if (Index < func.length){
            if (f.isAtivo()){}
            func[Index] = f;
            Index++;
        }
    }

    public Funcionario buscarFuncionario(String Matricula  ) {
        for (int i = 0; i < Index; i++){
            if (func[i].getMatricula().equalsIgnoreCase(Matricula)){
                return func[i];
            }
        }
        return null;

    }

    public void removerFuncionario(String matricula){
        Funcionario func_aux = buscarFuncionario(matricula);

        if (func_aux != null){
            func_aux.desligar();
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
