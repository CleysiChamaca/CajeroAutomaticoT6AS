package logicadenegocio;
import datos.*;
public class ConsultaSaldo extends OperacionBase {
    @Override
    public void ejecutar(CuentaBancaria cuenta, double cantidad) {
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}

