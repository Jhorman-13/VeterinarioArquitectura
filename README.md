# Sistema de Gestión para Veterinaria Canina 

Software de escritorio diseñado para gestionar de manera centralizada y eficiente los procesos de una veterinaria canina. Permite a los empleados y administradores registrar y consultar información vital de las mascotas (salud, alergias, cuidados), administrar los datos de contacto de los dueños, y llevar un control estructurado de las citas y facturación, todo a través de una interfaz gráfica intuitiva.

## Principales características 
Las principales características del software son:
* Conexión a la base de datos a través de usuario y contraseña.
* La capacidad de consultar,crear,modificar, actualizar y eliminar los registros de de las base de datos.
* Impresión de informes.
* Diseño minimalista enfocado para que la experiencia de usuario sea fácil e intuitiva.

* Pasos Básicos para Ejecutar
Clonar el repositorio: Descarga el código fuente en tu equipo local.

Configurar la Base de Datos:

Abre tu gestor de MySQL (ej. phpMyAdmin o MySQL Workbench).

Ejecuta el script SQL proporcionado en la carpeta /database para crear las tablas (Dueno, Mascota, Cita, etc.).

Configurar credenciales: Modifica la clase de conexión o el archivo properties con tu usuario y contraseña local de MySQL.

Compilar e Iniciar: Abre el proyecto en tu IDE (NetBeans, IntelliJ o Eclipse), actualiza las dependencias de Maven y ejecuta la clase principal (Main.java o App.java).

## Tecnologías utilizadas
* Java
* JavaFX
* MySQL
* JUnit
* Jasper Reports
* Dependencias Maven
* Javahelp
* Netbeans 
* Scene Builder
* Adobe XD

## Arquitectura de software
* MVC (modelo-vista-controlador)

## Diagrama UML de la base de datos
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/diagrama.png" width="500" height="300" alt="Diagrama UML de la base de datos">

## Arquitectura del Sistema (Modelo C4)
C1 - Contexto: Muestra la interacción entre los Empleados/Administradora, el Dueño de la Mascota y el Sistema de Peluquería Canina, apoyado por un servicio de correo externo (SMTP).

C2 - Contenedores: Detalla la separación entre el Frontend (Vista), el Servidor Backend (Controladores/Lógica) y la Base de Datos (Modelo).

C3 - Componentes: Ilustra la relación interna del Backend (Controlador de Seguridad, Citas, Mascotas, Servicio de Reglas y la Capa DAO).

C4 - Clases: Diagrama UML que estructura las entidades principales (Dueno, Mascota, Cita) y los patrones de diseño (Singleton y State).

## Vista de la aplicación
#### Inicio
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/inicio.png" width="400" height="300" alt="Ventana de inicio con la selección de perfil de la aplicación">

#### Login
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/login.png" width="400" height="300" alt="Vetana del login del director">

#### Tablas
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/tablas.png" width="400" height="300" alt="Ventana con las tablas de la aplicación">

#### Listado mascotas
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/listado.png" width="400" height="300" alt="Ventana con el listado de mascotas">

#### Eliminar mascotas
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/eliminar.png" width="400" height="300" alt="Ventana mascota para eliminar registro de la base de datos">

#### Añadir mascotas
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/añadir.png" width="400" height="300" alt="Ventana añadir mascota">

#### Modificar mascotas
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/modificar.png" width="400" height="300" alt="Ventana modificar datos de la mascota seleccionada">

#### Buscar mascotas
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/buscar.png" width="400" height="300" alt="Ventana buscar mascota en la base de datos">

#### Informe Mascota
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/informe.png" width="300" height="100" alt="Informe mascota">

#### Factura cita de un cliente
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/facturagenerada.png" width="400" height="300" alt="Factura cita de cliente">

#### Menú
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/menu1.png" width="400" height="300" alt="Menú de la aplicación">

#### Menú Ayuda
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/menu2.png" width="400" height="300" alt="Menú de la aplicación ayuda">

#### Ayuda
<img src="https://github.com/nuriadevs/Intelipet/blob/main/src/main/resources/img/ayuda.png" width="400" height="300" alt="Menú de la aplicación">

## Agradecimientos
¡Muchas gracias por haber llegado hasta aquí!. :four_leaf_clover:


