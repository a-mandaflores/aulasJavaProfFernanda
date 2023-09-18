import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Diretor diretor = new Diretor();

        System.out.println("Cadastrar funcionario");
        System.out.println("1 - Gerente");
        System.out.println("2 - Diretor");
        int numero = sc.nextInt();

        switch (numero){
            case 1:
                System.out.println("Nome: ");
                gerente.setNome(sc.next());
                System.out.println("Salario: ");
                gerente.setSalario(sc.nextInt());
                System.out.println("Departamento: ");
                gerente.setDepartamento(sc.next());
                gerente.dados();
            case 2:
                System.out.println("Nome: ");
                diretor.setNome(sc.next());
                System.out.println("Salario: ");
                diretor.setSalario(sc.nextInt());
                System.out.println("Quantas ações ele possui: ");
                diretor.setAcoes(sc.nextInt());
                diretor.dados();
        }



    }
}