package br.techcorp.funcionario;

public class Funcionario {
    private String matricula, nome, cargo;
    private double salarioBase, percentualBonus;
    private boolean ativo;

    public Funcionario(String matricula, String nome, String cargo, Double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.ativo = true;
    }

    public double calcularSalarioLiquido() {
        return (salarioBase + percentualBonus) - 0.85;
    }

    public boolean aplicarAumento(double percentualBonus) {
    }

    public boolean aplicarBonus(double percentualBonus) {
        if (percentualBonus >= 0){
            return true;
        } else {
            return false;
        }
    }

    public void desligar(){
        ativo = false;
        percentualBonus = 0;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String exibirResumo(){

    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
