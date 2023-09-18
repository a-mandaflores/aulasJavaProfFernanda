public class Gerente extends Funcionario{
    private String departamento;
    private double bonus = 10;
    private double salarioBonus;


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int calcBonus) {
        this.bonus = calcBonus;
    }

    public double addBonus(){
        double calculando = bonus / 100;
        double somar = getSalario() * calculando;
        this.salarioBonus = somar + getSalario();
        return salarioBonus;
    }

    public void dados(){
        System.out.println("Funcionario: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Departamento: " + departamento);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salario com bonus: " + addBonus());


    }


}
