package FuncionarioGerente;

public class Gerente extends Funcionario {

    int numeroFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, int cargo, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario, cargo);
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    @Override
    public double bonificacao(double salario){
        salario = salario * 0.5;
        return salario;
    }

    public void teste(){
        System.out.println("Olá aluninhos");
    }

    public void teste(String nome){
        System.out.println("Olá aluno: " + nome);
    }

    public void teste(String nome, String sobrenome){
        System.out.println("iai: " + nome + " " + sobrenome);
    }
}

