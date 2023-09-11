import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println("Seja bem vindo ao cadastro de novo usuario");
        System.out.println("Informe quem você quer cadastrar");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        String op = sc.next();

        switch (op){
            case "1":
                System.out.println("Informe o nome do aluno:");
                aluno.setNome(sc.next());
                System.out.println("Informe a idade:");
                aluno.setIdade(input.nextInt());
                System.out.println("Informe primeira nota:");
                aluno.setNota1(input.nextInt());
                System.out.println("Informe a segunda nota:");
                aluno.setNota2(input.nextInt());
                aluno.calcMedia();
                aluno.informacoesAluno();
                break;

            case "2":
                System.out.println("Informe o nome do professor:");
                professor.setNome(sc.next());
                System.out.println("Informe a idade:");
                professor.setIdade(input.nextInt());
                System.out.println("Informe a especialização:");
                professor.setEspecializacao(sc.next());
                System.out.println("Informe o salario:");
                professor.setSalario(input.nextInt());
                professor.infosProfessor();
                break;
            default:
                System.out.println("Essa opção nao existe");




        }





    }


}
