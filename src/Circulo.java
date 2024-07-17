public class Circulo extends Formulas{
    private double π = 3.14f;
    private double raio;

    public Circulo(double raio, double diametro) {
        this.raio = raio;
    }

    public double getπ() {
        return π;
    }

    public void setπ(float π) {
        this.π = π;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public double calcularAreaForma(){
        return π * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetroForma(){
        return π * 2 * raio;
    }

    public double Raio(double diametro){
        return raio = diametro/2;
    }

    public double Diametro(){
        return raio * 2;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "π=" + π + "\n" +
                "raio=" + raio + "\n" +
                '}';
    }
}
