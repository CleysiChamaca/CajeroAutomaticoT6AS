package logicadenegocio;

import datos.*;

public class ResumenDecorator extends OperacionDecorator {
    public ResumenDecorator(OperacionesCajero operacionDecorada) {
        super(operacionDecorada);
    }

    @Override
    public void ejecutar(CuentaBancaria cuenta, double cantidad) {
        super.ejecutar(cuenta, cantidad);
        System.out.println("Resumen de la operación:");
        System.out.println("Saldo actual: " + cuenta.consultarSaldo());
    }
}
