# 1.7-Annotations

## Nivel 1
### Exercici 1
Crea una jerarquía de objetos con tres clases: Trabajador, Trabajador Online y Trabajador Presencial.

La clase Trabajador tiene los atributos nombre, apellido, precio/hora, y el método calcularSou() que recibe por parámetro el número de horas trabajadas y lo multiplica por el precio/hora. Las clases hijas deben sobreescribirlo, empleando @Override.

Desde el main() de la clase Principal, realiza las invocaciones necesarias para demostrar el funcionamiento de la anotación @Override.

En los trabajadores presenciales, el método para calcular su sueldo, recibirá por parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora, más el valor de un atributo static llamado gasolina que añadiremos en esta clase.

En los trabajadores online, el método para calcular su sueldo recibirá por parámetro el número de horas trabajadas al mes. A la hora de calcular el sueldo se multiplicará el número de horas trabajadas por el precio/hora y se le sumará el precio de la tarifa plana de Internet, que será una constante de la clase Trabajador Online.



### Exercici 2
Añade a las clases hijas algunos métodos obsoletos (deprecated), y utiliza la anotación correspondiente. Invoca desde una clase externa los métodos obsoletos, suprimiendo mediante la correspondiente anotación los “warnings” para ser obsoletos.

---- 

## Nivel 2

### Ejercicio 1
Crea una anotación personalizada que debe permitir serializar un objeto Java en un archivo JSON. La anotación debe recibir el directorio donde se colocará el archivo resultante.


---- 

## Nivel 3

### Ejercicio 1
Añade la posibilidad de que la anotación creada en el nivel anterior sea registrada por la Virtual Machine en tiempo de ejecución. Demuestra que se ejecuta la lectura de la anotación utilizando  Java Reflection.
