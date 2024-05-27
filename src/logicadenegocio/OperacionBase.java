package logicadenegocio;

import datos.*;
public class OperacionBase implements OperacionesCajero {
    @Override
    public void ejecutar(CuentaBancaria cuenta, double cantidad) {
        // Por defecto, no realiza ninguna acción
    }
}

