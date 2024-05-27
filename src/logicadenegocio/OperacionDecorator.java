package logicadenegocio;

import datos.*;
public abstract class OperacionDecorator implements OperacionesCajero {
    protected OperacionesCajero operacionDecorada;

    public OperacionDecorator(OperacionesCajero operacionDecorada) {
        this.operacionDecorada = operacionDecorada;
    }

    @Override
    public void ejecutar(CuentaBancaria cuenta, double cantidad) {
        operacionDecorada.ejecutar(cuenta, cantidad);
    }
}

