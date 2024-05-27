package presentacionvisual;

import logicadenegocio.*;
public class ObservadorSaldo implements Observer {
    @Override
    public void update(double nuevoSaldo) {
        System.out.println("Saldo actual: " + nuevoSaldo);
    }
}

