public class Diretor extends Funcionario{
    private double acoes;

    public double getAcoes() {
        return acoes;
    }

    public void setAcoes(double acoes) {
        this.acoes = acoes;
    }

    public void dados(){
        System.out.println("Funcionario: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Quatidade de ações: " + acoes);



    }


}
