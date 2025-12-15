# Semana 06: Abstracción e Interfaces

## Dominio
StreamFlix - Plataforma de Streaming

## Descripción
Sistema de gestión de contenido audiovisual que utiliza abstracción mediante clases abstractas e interfaces para modelar diferentes tipos de contenido (películas, series, documentales) con capacidades compartidas como reproducción, calificación y recomendación.

## Clases Abstractas Implementadas

### Content
- **Propósito:** Representa el concepto general de contenido audiovisual en StreamFlix. Define la estructura común y el comportamiento base que todos los contenidos comparten.
- **Métodos abstractos:**
  - `mostrarInfo()`: Cada tipo de contenido muestra su información de manera específica
  - `calcularPrecio()`: Cada tipo calcula su precio según sus características
  - `obtenerDescripcion()`: Cada tipo genera su descripción única
- **Métodos concretos:**
  - `calcularDuracionEnHoras()`: Convierte duración de minutos a horas
  - `mostrarInformacionBasica()`: Muestra información común a todos los contenidos
- **Subclases:**
  - `Movie` (Película)
  - `Series` (Serie)
  - `Documentary` (Documental)

## Interfaces Implementadas

### Reproducible
- **Capacidad:** Define la capacidad de ser reproducido, pausado y detenido
- **Métodos:**
  - `iniciarReproduccion()`: Inicia la reproducción del contenido
  - `pausarReproduccion()`: Pausa la reproducción actual
  - `detenerReproduccion()`: Detiene completamente la reproducción
  - `estaReproduciendo()`: Verifica si está en reproducción
  - `obtenerTiempoActual()`: Obtiene el tiempo actual de reproducción
- **Implementada por:**
  - `Movie`
  - `Series`

### Calificable
- **Capacidad:** Define la capacidad de recibir calificaciones de usuarios
- **Métodos:**
  - `agregarCalificacion(double calificacion)`: Agrega una nueva calificación
  - `obtenerPromedioCalificaciones()`: Calcula el promedio de calificaciones
  - `obtenerNumeroCalificaciones()`: Obtiene el número total de calificaciones
  - `tieneCalificaciones()`: Verifica si tiene calificaciones
- **Implementada por:**
  - `Movie`
  - `Series`
  - `Documentary`

### Recomendable
- **Capacidad:** Define la capacidad de ser recomendado a usuarios según preferencias
- **Métodos:**
  - `esRecomendablePara(String generoPreferido)`: Verifica si es recomendable para un género
  - `calcularPuntuacionRecomendacion()`: Calcula una puntuación de recomendación
  - `obtenerRazonRecomendacion()`: Obtiene la razón por la que se recomienda
  - `esContenidoDestacado()`: Verifica si es contenido destacado
- **Implementada por:**
  - `Movie`
  - `Series`
  - `Documentary`

## Jerarquía de Clases

```
       <<abstract>>
         Content
           |
    +------+------+------+
    |      |      |      |
  Movie  Series Documentary
    |      |
    +-- implements Reproducible
    +-- implements Calificable
    +-- implements Recomendable
```

## Principios SOLID Aplicados

1. **SRP (Single Responsibility Principle):** Cada clase tiene una responsabilidad única:
   - `Content`: Define estructura común de contenido
   - `Movie/Series/Documentary`: Implementan comportamiento específico de su tipo
   - Interfaces: Definen capacidades específicas (reproducción, calificación, recomendación)

2. **OCP (Open/Closed Principle):** El sistema está abierto a extensión pero cerrado a modificación:
   - Se pueden agregar nuevos tipos de contenido extendiendo `Content` sin modificar código existente
   - Se pueden agregar nuevas interfaces sin afectar clases existentes

3. **LSP (Liskov Substitution Principle):** Las subclases pueden sustituir a la clase abstracta:
   - Cualquier instancia de `Movie`, `Series` o `Documentary` puede usarse donde se espera `Content`
   - Se mantiene el comportamiento esperado de los métodos abstractos

4. **ISP (Interface Segregation Principle):** Las interfaces son específicas y cohesivas:
   - `Reproducible` solo define métodos de reproducción
   - `Calificable` solo define métodos de calificación
   - `Recomendable` solo define métodos de recomendación
   - Las clases implementan solo las interfaces que necesitan

5. **DIP (Dependency Inversion Principle):** Dependemos de abstracciones:
   - El código usa referencias de tipo `Content` (abstracción) en lugar de tipos concretos
   - Los métodos aceptan interfaces como parámetros, no implementaciones concretas

## Compilación y Ejecución

```bash
# Compilar todas las clases
javac semana-06/abstractas/*.java
javac semana-06/interfaces/*.java
javac semana-06/implementaciones/*.java
javac semana-06/Main.java

# Ejecutar
java -cp semana-06 Main
```

## Salida Esperada

El programa muestra:
1. Polimorfismo con clase abstracta: Array de `Content` con diferentes subclases
2. Uso de interfaces: Demostración de `Reproducible`, `Calificable` y `Recomendable`
3. Múltiple implementación: Una clase implementando múltiples interfaces
4. ArrayList polimórfico: Colección de contenidos procesados polimórficamente

## Cambios Respecto a Semana 05

- **Content convertida en clase abstracta:** Ahora define métodos abstractos que deben ser implementados
- **Interfaces agregadas:** Se implementaron 3 interfaces para capacidades específicas
- **Múltiple implementación:** Las clases concretas implementan múltiples interfaces
- **Mejor separación de responsabilidades:** Cada interface define una capacidad específica
- **Mayor flexibilidad:** El sistema puede extenderse fácilmente con nuevos tipos o capacidades

## Mejoras Futuras

- Agregar más tipos de contenido (Podcast, LiveStream)
- Implementar más interfaces (Descargable, Compartible)
- Crear sistema de recomendaciones más sofisticado
- Agregar persistencia de calificaciones
- Implementar sistema de reproducción más avanzado con progreso guardado

