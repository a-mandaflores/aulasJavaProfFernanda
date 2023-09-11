public class Aluno extends Pessoa {

    private int nota1;
    private int nota2;
    private double media;

    public void setNota1(int nota1){
        this.nota1 = nota1;
    }

    public int getNota1(){
        return nota1;
    }

    public void setNota2(int nota2){
        this.nota2 = nota2;
    }

    public int getNota2(){
        return nota2;
    }

    public void calcMedia(){
        this.media = (this.nota1+this.nota2) /2;
    }

    public void informacoesAluno(){
        System.out.println("O nome do aluno é: " + getNome());
        System.out.println("A media do aluno é: " + this.media);
    }

}
