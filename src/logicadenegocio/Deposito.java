package logicadenegocio;
import datos.*;

public class Deposito extends OperacionBase {
    @Override
    public void ejecutar(CuentaBancaria cuenta, double cantidad) {
        cuenta.depositar(cantidad);
    }
}
