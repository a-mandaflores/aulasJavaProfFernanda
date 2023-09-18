public class Carro extends Veiculo{
    private int qtdPortas;
    
    public void setPortas(int portas){
        this.qtdPortas = portas;
    }
    
    public int getPortas(){
        return qtdPortas;
    }
    
    public String imprimirDetalhes(){
        
        System.out.println("A marda do veiculo é: ", getMarca);
        System.out.println("A marda do veiculo é: ", getMarca);
        System.out.println("Ela tem ", this.qtdPortas, " portas");
    }
}