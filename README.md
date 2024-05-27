# CajeroAutomaticoT6AS
Tarea #6 de Arquitectura de Software la implementacion de un Cajero Automatico con operaciones Basicas
El cajero automático es una parte esencial de cualquier sistema bancario. A continuación se muestra la implementación de un cajero automático básico que gestiona las operaciones básicas de una cuenta bancaria qué son las de retirar (si es que hubiera), depositar y consultar saldo aplicando los patrones de diseño 
--------------------------------------------------------------------------------------------------------------------------------------
Proyecto realizado en Java, Para hacer correr solo se debe ejecutar la clase Main.java
--------------------------------------------------------------------------------------------------------------------------------------
Principios S.O.L.I.D aplicados
1. Single Responsibility Principle (SRP)
CuentaBancaria, CuentaBase,	  CuentaDeAhorros, ConfirmacionDecorator, ResumenDecorator, Retiro, Deposito, ConsultaSaldo, CajeroAutomatico, y ObservadorSaldo siguen SRP, ya que cada una de estas clases tiene una responsabilidad bien definida.
2. Open/Closed Principle (OCP)
CuentaBase y sus subclases (como CuentaDeAhorros) están abiertas para extensión (se pueden crear nuevas cuentas derivadas sin modificar CuentaBase).
OperacionDecorator permite extender la funcionalidad de las operaciones sin modificar las clases originales, siguiendo OCP.
CajeroAutomatico puede ser extendido con nuevas operaciones sin modificar su código, lo cual es positivo.
3. Liskov Substitution Principle (LSP)
Las clases CuentaDeAhorros, ConfirmacionDecorator, ResumenDecorator, Retiro, Deposito y ConsultaSaldo  cumplen con LSP, ya que extienden correctamente sus clases base o implementan interfaces sin alterar el comportamiento esperado.
4. Interface Segregation Principle (ISP)
CuentaBancaria y OperacionesCajero son interfaces bien definidas que se ajustan a ISP, ya que las clases que las implementan solo están obligadas a definir los métodos relevantes.
No hay interfaces muy grandes que obliguen a los clientes a depender de métodos que no usan.
5. Dependency Inversion Principle (DIP)
CajeroAutomatico depende de la abstracción CuentaBancaria y OperacionesCajero, no de implementaciones concretas, lo cual sigue el DIP.
Main depende de la abstracción CuentaFactory para crear cuentas, lo cual es una buena práctica. 
-----------------------------------------------------------------------------------------------------------------------------------------
Patrones de Diseño Aplicados
1.-Creational: Abstract Factory (para la implementación de CuentaFactory y CuentaDeAhorrosFactory).El patrón Abstract Factory se utiliza para crear familias de objetos relacionados sin especificar sus clases concretas. En el código, se usa para la creación de cuentas bancarias.
2.-Estructural:Decorator (para la implementación de OperacionDecorator, ConfirmacionDecorator, y ResumenDecorator).El patrón Decorator se utiliza para añadir comportamiento a objetos de manera dinámica sin alterar su estructura. Aquí, se utiliza para añadir funcionalidad adicional a las operaciones del cajero automático, como imprimir confirmaciones y resúmenes.
3.-Comportamiento: Observer (para la implementación de Observer y ObservadorSaldo).El patrón Observer permite que un objeto (sujeto) notifique a otros objetos (observadores) sobre cambios en su estado. Aquí, se utiliza para actualizar a los observadores cuando cambia el saldo de una cuenta bancaria.
----------------------------------------------------------------------------------------------------------------------------------------
Arquitectura de 3 capas
La Arquitectura seguida es el modelo de 3 capas que son las siguientes:
Datos, Logica del Negocio y Presentacion.
1.-En la capa de Datos estan las siguientes clases:
  -Cuentabancaria
  -CuentaBase
  -CuentaDe Ahorros

2.-En la Logica de Negocio estan las siguientes clases:
  -ConfirmacionDecorator
  -ConsultaSaldo
  -CuentaDeAhorrosFactory
  -CuentaFactory
  -Deposito
  -Observer
  -OperacionBase
  -OperacionDecorator
  -OperacionCajero
  -ResumenDecorator
  -Retiro

3.-En la capa de Presentacion estan las siguientes clases:
  -CajeroAutomatico
  -Main
  -ObservadorSaldo
