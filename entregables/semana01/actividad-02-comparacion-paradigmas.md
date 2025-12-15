# Actividad 2: Comparación de Paradigmas de Programación

**Estudiante:** Juan David Villada Valderrama  
**Ficha:** 3228973A  
**Fecha:** Semana 01

---

## Paradigmas de Programación

### Programación Estructurada

La programación estructurada se basa en el uso de funciones, procedimientos y estructuras de control (secuencia, selección, iteración). Los datos y las funciones están separados, y se utilizan variables globales o se pasan parámetros entre funciones.

**Características:**
- Separación entre datos y funciones
- Uso de variables globales o locales
- Funciones que operan sobre datos externos
- Código más difícil de mantener cuando crece
- No hay encapsulación de datos

### Programación Orientada a Objetos (POO)

La programación orientada a objetos organiza el código en clases que encapsulan datos (atributos) y comportamientos (métodos) relacionados. Los objetos son instancias de clases que interactúan entre sí.

**Características:**
- Encapsulación: datos y métodos juntos en clases
- Reutilización de código mediante clases
- Modularidad: cada clase representa un concepto
- Facilita el mantenimiento y la extensión
- Modela mejor el mundo real

---

## Ejemplo: Manejo de Información de un Contenido

### Enfoque 1: Programación Estructurada

En programación estructurada, los datos se almacenan en variables separadas y las funciones operan sobre estos datos:

```c
// Variables globales para almacenar datos de un contenido
char contentCode[20];
char title[100];
char genre[50];
int duration;
int releaseYear;

// Función para inicializar un contenido
void inicializarContenido(char codigo[], char titulo[], char genero[], int duracion, int anio) {
    strcpy(contentCode, codigo);
    strcpy(title, titulo);
    strcpy(genre, genero);
    duration = duracion;
    releaseYear = anio;
}

// Función para mostrar información
void mostrarInformacion() {
    printf("Código: %s\n", contentCode);
    printf("Título: %s\n", title);
    printf("Género: %s\n", genre);
    printf("Duración: %d minutos\n", duration);
    printf("Año: %d\n", releaseYear);
}

// Función principal
int main() {
    inicializarContenido("STR-001", "Stranger Things", "Ciencia Ficción", 50, 2016);
    mostrarInformacion();
    return 0;
}
```

**Problemas de este enfoque:**
- Si queremos manejar múltiples contenidos, necesitamos arrays o estructuras complejas
- Las variables globales pueden causar conflictos
- No hay encapsulación: cualquier función puede modificar los datos
- Difícil de mantener cuando el programa crece
- No representa claramente la relación entre datos y operaciones

---

### Enfoque 2: Programación Orientada a Objetos

En POO, los datos y las operaciones se agrupan en una clase:

```java
// Clase que encapsula datos y comportamientos
public class StreamContent {
    // Atributos (datos)
    private String contentCode;
    private String title;
    private String genre;
    private int duration;
    private int releaseYear;
    
    // Constructor (inicializa el objeto)
    public StreamContent(String contentCode, String title, String genre, 
                        int duration, int releaseYear) {
        this.contentCode = contentCode;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }
    
    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Código: " + contentCode);
        System.out.println("Título: " + title);
        System.out.println("Género: " + genre);
        System.out.println("Duración: " + duration + " minutos");
        System.out.println("Año: " + releaseYear);
    }
    
    // Métodos adicionales (comportamientos)
    public void reproducir() {
        System.out.println("Reproduciendo: " + title);
    }
    
    public String getContentCode() {
        return contentCode;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        // Crear múltiples objetos fácilmente
        StreamContent contenido1 = new StreamContent("STR-001", "Stranger Things", 
                                                      "Ciencia Ficción", 50, 2016);
        StreamContent contenido2 = new StreamContent("STR-002", "The Crown", 
                                                      "Drama Histórico", 60, 2016);
        
        contenido1.mostrarInformacion();
        contenido2.mostrarInformacion();
    }
}
```

**Ventajas de este enfoque:**
- **Encapsulación**: Los datos y métodos están juntos en la clase
- **Múltiples instancias**: Fácil crear varios objetos del mismo tipo
- **Reutilización**: La clase se puede usar en diferentes partes del programa
- **Mantenibilidad**: Cambios en la clase afectan a todos los objetos
- **Modelado del mundo real**: Representa mejor entidades del dominio
- **Control de acceso**: Los atributos pueden ser privados, protegiendo los datos

---

## Comparación Directa

| Aspecto | Programación Estructurada | Programación Orientada a Objetos |
|---------|---------------------------|----------------------------------|
| **Organización** | Funciones y variables separadas | Clases que agrupan datos y métodos |
| **Datos** | Variables globales o locales | Atributos dentro de clases |
| **Operaciones** | Funciones independientes | Métodos dentro de clases |
| **Múltiples instancias** | Requiere arrays o estructuras complejas | Crear objetos es simple |
| **Encapsulación** | No existe | Sí, datos y métodos juntos |
| **Reutilización** | Copiar y pegar código | Herencia y composición |
| **Mantenimiento** | Difícil en proyectos grandes | Más fácil y organizado |
| **Modelado** | No representa bien el mundo real | Modela entidades del dominio |

---

## Conclusión

La programación orientada a objetos ofrece una forma más natural y organizada de modelar problemas del mundo real, especialmente en dominios complejos como una plataforma de streaming. Permite crear múltiples objetos del mismo tipo de manera sencilla, mantiene los datos y comportamientos relacionados juntos, y facilita el mantenimiento y la extensión del código.

En el contexto de StreamFlix, POO permite representar claramente entidades como contenidos, usuarios, perfiles y planes de suscripción, cada una con sus propias características y comportamientos, facilitando el desarrollo y mantenimiento de la plataforma.

