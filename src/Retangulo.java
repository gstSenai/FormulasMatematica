public class Retangulo extends Formulas{
    private double lado1;
    private double lado2;


    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularAreaForma(){
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetroForma(){
        return 2 * (lado1 + lado2);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "lado1=" + lado1 + "/n" +
                "lado2=" + lado2 +
                '}';
    }
}
