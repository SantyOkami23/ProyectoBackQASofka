# ProyectoBackQASofka
Proyecto de Back para el training QA de Sofka

Para ejecutar la aplicación solo es necesario clonar el repositorio, en caso de presentar problemas con el JDK, seleccionar la versión de JDK 19

Para inicializar la aplicación debe ejecutarse desde TerminalPolombiaApplication.java

La aplicación se basa en la interacción de dos clases principales, una clase Java llamada "RutaBus". Esta clase representa una ruta de autobús 
y contiene información sobre la ruta (ID, nombre de ruta, número de asientos disponibles, precio del boleto, horario), así como información del usuario 
(nombre, edad y número de cédula). 

La clase también incluye un constructor que permite crear un objeto de la clase con los detalles proporcionados, y un método llamado "disminuirAsientos" 
que disminuye el número de asientos disponibles en la ruta. Además, la clase tiene varios métodos "get" para recuperar la información sobre la ruta y el
usuario. Finalmente, hay una sobrecarga del método "toString" para imprimir una representación en cadena de un objeto de la clase "RutaBus".

También se cuenta con  una clase Java llamada "BoletoBus". Esta clase representa un boleto de autobús y contiene información sobre el boleto (ID y fecha). La clase
también incluye una lista de objetos "RutaBus", que se refiere a las diferentes rutas de autobús disponibles. La clase tiene un constructor que permite crear
un objeto de la clase con los detalles proporcionados, y varios métodos "get" y "set" para obtener y establecer los valores de los atributos "id" y "fecha". 
También hay un método "get" para recuperar la lista de objetos "RutaBus".

Cosas por mejorar: Pudo crearse una clase usuario o persona que contuviera los atributos  (nombre, edad y número de cédula), para así  no agrupar toda la información
en la clase  RutaBus

**Rutas para comprobar el funcionamiento de los EndPoints**

GET: Para mostrar las rutas disponibles y la informacion de las mismas 

http://localhost:8080/api/terminal/rest/mostrar/todo

POST: Para reservar los los boletos de cada usuraio y descontar los asientos disponibles

http://localhost:8080/api/terminal/boletos

Ejemplo Input

[
  {
        "id": "1",
        "nombreRuta": "RUTA 17 A",
        "totalAsientosDisponibles": 10,
        "precioBoleto": 3000,
        "horario": " 5 de la tarde",
        "nombreUsuario": "Pepito Perez",
        "edad": "18",
        "cedula": 293983
    },
     {
        "id": "1",
        "nombreRuta": "RUTA 17 A",
        "totalAsientosDisponibles": 10,
        "precioBoleto": 3000,
        "horario": " 5 de la tarde",
        "nombreUsuario": "Son Goku",
        "edad": "80",
        "cedula": 1234
    }

]

GET: para mostrar la información de los bolestos reservados

http://localhost:8080/api/terminal/boletos
