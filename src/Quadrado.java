public class Quadrado extends Formulas{
    private double lado;


    public Quadrado(float lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularAreaForma(){
        return Math.pow(lado,2);
    }

    @Override
    public double calcularPerimetroForma(){
        return lado * 4;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "/n" +
                "lado=" + lado +
                '}';
    }
}
