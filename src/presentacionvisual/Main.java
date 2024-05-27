package presentacionvisual;
import logicadenegocio.*;
import datos.*;
import java.util.List;
import java.util.ArrayList;
// Clase principal del programa
public class Main {
    public static void main(String[] args) {
        // Crear una lista de operaciones disponibles en el cajero automático
        List<OperacionesCajero> operaciones = new ArrayList<>();
        operaciones.add(new ResumenDecorator(new ConsultaSaldo()));
        operaciones.add(new ConfirmacionDecorator(new Retiro()));
        operaciones.add(new ConfirmacionDecorator(new Deposito()));

        // Crear una cuenta de ahorros usando Abstract Factory
        CuentaFactory cuentaFactory = new CuentaDeAhorrosFactory();
        CuentaBancaria cuentaBancaria = cuentaFactory.crearCuenta();

        // Agregar un Observer para la cuenta bancaria
        Observer observadorSaldo = new ObservadorSaldo();
        cuentaBancaria.addObserver(observadorSaldo);

        // Crear una instancia de CajeroAutomatico
        CajeroAutomatico cajeroAutomatico = new CajeroAutomatico(cuentaBancaria, operaciones);

        // Simular operaciones en el cajero automático
        cajeroAutomatico.ejecutarOperacion(0, 0); // Consultar saldo
         cajeroAutomatico.ejecutarOperacion(1, 500); // Retirar 500
        cajeroAutomatico.ejecutarOperacion(2, 1000); // Depositar 1000
    }
}