package logicadenegocio;

import datos.*;

public class CuentaDeAhorrosFactory implements CuentaFactory {

    @Override
    public CuentaBancaria crearCuenta() {
        return new CuentaDeAhorros(0.05); // Suponiendo que el constructor de CuentaDeAhorros requiere una tasa de interés
    }
}

