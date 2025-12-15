# Instrucciones de Compilación y Ejecución

## Requisitos
- Java JDK 8 o superior instalado
- Terminal o línea de comandos

## Compilación

Desde la carpeta `src/semana01`, ejecuta:

```bash
javac StreamContent.java Main.java
```

O desde la raíz del proyecto:

```bash
javac src/semana01/StreamContent.java src/semana01/Main.java
```

## Ejecución

Desde la carpeta `src/semana01`, ejecuta:

```bash
java Main
```

O desde la raíz del proyecto:

```bash
java -cp src semana01.Main
```

## Salida Esperada

El programa mostrará la información de 5 contenidos de StreamFlix:
- STR-001: Stranger Things (Ciencia Ficción)
- STR-002: The Crown (Drama Histórico)
- STR-003: Breaking Bad (Thriller)
- STR-004: Nuestro Planeta (Documental)
- STR-005: La Casa de Papel (Acción)

