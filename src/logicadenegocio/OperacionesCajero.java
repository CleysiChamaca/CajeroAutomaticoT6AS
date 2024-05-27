package logicadenegocio;

import datos.*;

public interface OperacionesCajero {
    void ejecutar(CuentaBancaria cuenta, double cantidad);
}

