import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        Moto moto = new Moto();
        
        
        System.out.println("Escolha a opção correspondente ao seu veiculo\nOpção 1 moto\nOpção 2 carro ");
        int numero = sc.nextInt();
        switch(numero == 1){
            case 1:
                System.out.println("Informe a marca do veiculo:");
                moto.getMarca(sc.next());
                System.out.println("Informe o modelo do veiculo:");
                moto.getMarca(sc.next());
                System.out.printIn("Informe a cilindrada:")
                moto.getCilindrada(sc.next())
            case 2:
                System.out.println("Informe a marca do veiculo:");
                carro.getMarca(sc.next());
                System.out.println("Informe o modelo do veiculo:");
                carro.getMarca(sc.next());
                System.out.printIn("Informe a quantidade de portas:");
                carro.getPortas(sc.next())
        };
        
    }
}
