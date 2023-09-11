public class Professor extends Pessoa{


    private String especializacao;
    private int salario;

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void infosProfessor(){
        System.out.println("Nome do professor é: "+ getNome());
        System.out.println("A idade do professor é: "+ getIdade());
        System.out.println("Ele recebe salario de: "+ this.salario);
        System.out.println("A especialização dele é: "+ this.especializacao);

    }


}
