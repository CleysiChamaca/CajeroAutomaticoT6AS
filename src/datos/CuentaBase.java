package datos;
import logicadenegocio.*;
import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBase implements CuentaBancaria {
    protected double saldo;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
        notifyObservers();
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            notifyObservers();
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(saldo);
        }
    }
}

