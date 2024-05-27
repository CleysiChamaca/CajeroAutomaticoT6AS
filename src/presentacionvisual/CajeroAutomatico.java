package presentacionvisual;

import java.util.List;

import datos.CuentaBancaria;
import logicadenegocio.*;

public class CajeroAutomatico {
    private CuentaBancaria cuenta;
    private List<OperacionesCajero> operaciones;

    public CajeroAutomatico(CuentaBancaria cuenta, List<OperacionesCajero> operaciones) {
        this.cuenta = cuenta;
        this.operaciones = operaciones;
    }

    public void ejecutarOperacion(int indice, double cantidad) {
        if (indice >= 0 && indice < operaciones.size()) {
            operaciones.get(indice).ejecutar(cuenta, cantidad);
        } else {
            System.out.println("Operación no válida");
        }
    }
}
