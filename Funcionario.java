public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public double calcularBonus(){
        return getSalario() * 1.02; 
    }
}
