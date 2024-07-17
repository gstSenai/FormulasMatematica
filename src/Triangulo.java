public class Triangulo extends Formulas{
    private double lado1;
    private double lado2;
    private double base;

    public Triangulo(double lado1, double lado2, double base){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularAreaForma(){
        if(this.lado1 == this.lado2 && this.lado1 != this.base && this.lado2 != this.base){
            double h;
            double baseDividida = base/2;
            h = Math.sqrt(Math.pow(lado1,2) - Math.pow(baseDividida,2));
            return (base * h)/2;
        }
        if(this.lado1 == this.lado2 && this.lado2 == this.base){
            return (Math.sqrt(3)/4) * (Math.pow(lado1,2));
        }
        if(this.lado1 != this.lado2 && lado1 != this.base && this.lado2 != this.base){
            double semiPerimetro = (lado1 + lado2 + base)/2;
            return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) *
                    (semiPerimetro - lado2) * (semiPerimetro - base));
        }
        return 0;
    }

    @Override
    public double calcularPerimetroForma(){
        if(this.lado1 == this.lado2 && this.lado1 != this.base && this.lado2 != this.base){
            return base + (2 * lado1);
        }
        if(this.lado1 == this.lado2 && this.lado2 == this.base){
            return 3 * lado1;
        }
        if(this.lado1 != this.lado2 && lado1 != this.base && this.lado2 != this.base){
            return lado1 + lado2 + base;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", base=" + base +
                '}';
    }
}
