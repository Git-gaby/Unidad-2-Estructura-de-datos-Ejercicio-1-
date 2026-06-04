# Ejercicio 1 - Organización de contenedores de utilería

## Descripción

Este proyecto corresponde a la solución del ejercicio "Organización de contenedores de utilería para evento" propuesto en el taller de estructuras de datos lineales.

La situación plantea un depósito con una única puerta de acceso, donde cada nuevo contenedor que ingresa queda delante de los anteriores. Debido a esta restricción física, el último contenedor almacenado es el primero que puede ser retirado.

## Estructura de datos utilizada

Para modelar este comportamiento se utilizó una **pila (Stack)**, ya que implementa el principio:

**LIFO (Last In, First Out)**

Lo anterior permite representar correctamente la forma en que se almacenan y retiran los contenedores dentro del depósito.

## Información registrada por cada contenedor

Cada contenedor almacena los siguientes datos:

- Código del contenedor.
- Descripción del contenido.
- Área responsable.
- Peso aproximado.
- Estado (Almacenado o Retirado).

## Funcionalidades implementadas

El programa permite:

- Registrar nuevos contenedores.
- Consultar el contenedor disponible para retiro.
- Retirar contenedores.
- Mostrar contenedores almacenados.
- Mostrar historial de contenedores retirados.
- Consultar la cantidad de contenedores almacenados.
- Evitar retiros cuando el depósito está vacío.

## Tecnologías utilizadas

- Java
- Stack (`java.util.Stack`)
- Scanner (`java.util.Scanner`)

## Estructura del proyecto

```
Ejercicio1/
│
├── Contenedor.java
└── Deposito.java
```

## Ejecución

1. Compilar los archivos Java.

```bash
javac *.java
```

2. Ejecutar el programa.

```bash
java Deposito
```

3. Utilizar el menú interactivo para gestionar los contenedores.

## Autor(es)

Gabriel Jaime Gómez Restrepo 
