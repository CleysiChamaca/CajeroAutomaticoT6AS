package logicadenegocio;
import datos.*;

public class Retiro extends OperacionBase {
    @Override
    public void ejecutar(CuentaBancaria cuenta, double cantidad) {
        cuenta.retirar(cantidad);
    }
}

