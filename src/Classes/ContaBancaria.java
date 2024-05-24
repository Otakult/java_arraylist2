package Classes;

public class ContaBancaria {
    private int id;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }


}
