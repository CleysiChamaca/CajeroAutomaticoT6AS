package logicadenegocio;

import datos.*;

// Implementación del decorador para imprimir una confirmación después de cada operación
public class ConfirmacionDecorator extends OperacionDecorator {
    public ConfirmacionDecorator(OperacionesCajero operacionDecorada) {
        super(operacionDecorada);
    }

    @Override
    public void ejecutar(CuentaBancaria cuenta, double cantidad) {
        super.ejecutar(cuenta, cantidad);
        System.out.println("Operación realizada con éxito.");
    }
}

