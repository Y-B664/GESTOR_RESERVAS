# GESTOR_RESERVAS
# Gestión de Reservas para Peluquería

## Cómo se ejecuta

Para ejecutar el proyecto, abre el archivo **`App.java`** y ejecútalo desde tu IDE o desde la terminal. Esta clase es el punto de entrada de la aplicación y se encarga de iniciar el flujo principal del programa, llamando a las demás clases según la opción seleccionada por el usuario.

## Problema que resuelve

Este proyecto fue desarrollado para ayudar a una peluquería a gestionar sus reservas de forma organizada. Antes de contar con este sistema, podían presentarse situaciones como:

* Agendar dos clientes a la misma hora.
* Perder el control de los horarios disponibles durante el día.
* No llevar un registro claro de las reservas realizadas.
* Desconocer cuánto dinero se facturó al finalizar la jornada.

La aplicación centraliza toda esta información y permite administrar las citas de manera sencilla desde una interfaz por consola.

## Organización del código

El proyecto está organizado en cuatro clases principales, cada una con una responsabilidad específica:

### `App.java`

Es el punto de entrada de la aplicación. Se encarga de iniciar el programa, controlar el flujo principal y coordinar la comunicación entre las demás clases.

### `Menu.java`

Contiene toda la lógica relacionada con la interfaz por consola. Su responsabilidad es mostrar el menú principal y permitir que el usuario seleccione una de las siguientes opciones:

* Agendar una reserva.
* Listar reservas.
* Cancelar una reserva.
* Ver el reporte del día.
* Buscar reservas por cliente.
* Editar la hora de una reserva.
* Consultar horarios disponibles.
* Mostrar el servicio más solicitado.

### `Operaciones.java`

Contiene la lógica de negocio del sistema. En esta clase se implementan todas las funcionalidades principales relacionadas con la administración de las reservas, como:

* Registrar nuevas citas.
* Listar las reservas existentes.
* Cancelar una reserva.
* Editar el horario de una cita.
* Buscar reservas por nombre del cliente.
* Mostrar los horarios disponibles.
* Generar el reporte del día.
* Identificar el servicio más solicitado.

Además, incluye métodos auxiliares necesarios para el correcto funcionamiento de cada operación.

### `Validador.java`

Centraliza todas las validaciones del sistema para garantizar la integridad de los datos ingresados por el usuario. Entre sus funciones se encuentran:

* Validar que la hora ingresada sea correcta.
* Verificar que un horario no se encuentre ocupado.
* Comprobar que los datos numéricos sean enteros válidos.
* Evitar el ingreso de cadenas vacías.
* Validar que el servicio seleccionado exista.
* Validar que el nombre del cliente sea válido.
* Verificar si existen reservas registradas antes de ejecutar operaciones como listar, cancelar, editar o generar reportes.
