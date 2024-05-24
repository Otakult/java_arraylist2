package Classes;
import Interfaces.Forma;
public class Circulo implements Forma{
    private double raio;
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return 3.14*raio*raio;
    }
}