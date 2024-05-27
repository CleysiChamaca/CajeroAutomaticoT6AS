package datos;
import logicadenegocio.*;
public interface CuentaBancaria {
    void depositar(double cantidad);
    void retirar(double cantidad);
    double consultarSaldo();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}

