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
        return (salarioBase + (salarioBase * (percentualBonus / 100))) * 0.85;
    }

    public boolean aplicarAumento(double percentual) {
        if (percentual >= 0 && percentual <= 30 ){
            salarioBase *= (1 + percentual / 100);
            return true;
        }
        return false;
    }

    public void definirBonus(double percentual){
        if (percentual >= 0){
            percentualBonus = percentual;
        }
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

    public void exibirResumo(){
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Líquido: " + calcularSalarioLiquido());
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
