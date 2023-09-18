public class Moto extends Veiculo{
    private int cilindradas;
    
    public void setCilindradas(int cilindrada){
        this.cilindradas = cilindrada;
    }
    public int getCilindradas(){
        return cilindradas;
    }
    
    public String imprimirDetalhes(){
        System.out.println("A marda do veiculo é: ", getMarca);
        System.out.println("A marda do veiculo é: ", getMarca);
        System.out.println("Ela tem ", this.cilindradas, " cilindradas");
    }
    
8}