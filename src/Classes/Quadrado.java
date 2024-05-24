package Classes;
import Interfaces.Forma;
public class Quadrado implements Forma{
    private double ladoMedida;
    public Quadrado(double ladoMedida) {
        this.ladoMedida = ladoMedida;
    }

    public double calcularArea() {
        return ladoMedida*ladoMedida;
    }
}