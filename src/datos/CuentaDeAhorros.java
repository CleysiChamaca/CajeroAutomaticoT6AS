package datos;

public class CuentaDeAhorros extends CuentaBase {
    private double tasaInteres;

    public CuentaDeAhorros(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
        notifyObservers();
    }
}

