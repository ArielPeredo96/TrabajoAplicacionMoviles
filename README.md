## Requerimientos Funcionales
1. La aplicación debe permitir ingresar los datos del vehículo (marca, modelo, cilindrada, combustible, capacidad).
2. El cálculo del costo de despacho debe realizarse automáticamente en función de las reglas de negocio.

## Requerimientos No Funcionales
1. La aplicación debe ser compatible con dispositivos móviles y ejecutarse en una JVM.
2. El código debe ser documentado y fácil de mantener.


Memoria actualizada
Perfecto, aquí tienes un ejemplo de cómo podría quedar tu archivo README.md, incluyendo las historias de usuario junto con los demás elementos:

markdown
Copiar código
# Proyecto Distribuidora de Alimentos

## Descripción
Aplicación para calcular los costos de despacho basados en las reglas de negocio de una distribuidora de alimentos. Los usuarios pueden registrarse a través de cuentas Gmail y realizar compras que automáticamente calculan el costo de despacho.

## Instalación
1. Descargar e instalar JDK 8 desde [aquí](https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.html).
2. Compilar y ejecutar el programa como se detalla en la sección **Instrucciones de Compilación**.

## Instrucciones de Compilación
1. Guarda el archivo `DistribuidoraApp.java` en tu sistema.
2. Abre una terminal y compila el archivo con:
   ```bash
   javac DistribuidoraApp.java
Ejecuta el programa con:
bash
Copiar código
java DistribuidoraApp
Requerimientos Funcionales
La aplicación debe permitir a los usuarios ingresar información sobre el vehículo y calcular los costos de despacho.
El cálculo debe seguir las reglas de negocio según el monto de la compra.
Requerimientos No Funcionales
La aplicación debe ser compatible con dispositivos móviles.
El código debe ser fácil de mantener y estar bien documentado.
Historias de Usuario
Historia de Usuario 1:
Como cliente, quiero ingresar los datos de mi compra para que la aplicación calcule el costo del despacho automáticamente.

Criterios de aceptación:

La aplicación debe permitir ingresar la marca, modelo, y cilindrada del vehículo.
Debe calcular el costo de despacho según las reglas de negocio.
Historia de Usuario 2:
Como dueño de la distribuidora, quiero que el sistema registre los pedidos y los cálculos de despacho para mejorar la eficiencia del servicio al cliente.

Criterios de aceptación:

La aplicación debe registrar la información de compra y calcular el costo de despacho automáticamente.
