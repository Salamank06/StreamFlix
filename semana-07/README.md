# Semana 07: Paquetes y Excepciones - StreamFlix

## Información del Estudiante
- **Nombre**: Santiago Salamanca
- **Ficha**: 3228973A
- **Dominio**: StreamFlix - Plataforma de Streaming
- **Fecha**: Diciembre 2024

## Descripción del Proyecto

Sistema de gestión de catálogo para StreamFlix que permite agregar, buscar y gestionar contenido audiovisual (películas, series, documentales) con validaciones robustas mediante excepciones personalizadas y manejo de errores apropiado.

## Estructura de Paquetes

```
com.streamflix/
├── modelo/          - Clases del dominio (Content, Movie, Series, Documentary, Interfaces)
├── servicio/        - Lógica de negocio (GestorCatalogo)
├── excepciones/     - Excepciones personalizadas
└── Main.java        - Punto de entrada del programa
```

## Excepciones Personalizadas

### 1. ContenidoInvalidoException
- **Tipo**: Checked (extends Exception)
- **Cuándo se lanza**: Cuando se intenta agregar contenido con datos inválidos
- **Casos**:
  - Contenido nulo
  - Código vacío o con formato incorrecto
  - Título vacío
  - Duración menor o igual a cero
  - Código duplicado
  - Capacidad máxima alcanzada

### 2. ContenidoNoEncontradoException
- **Tipo**: Checked (extends Exception)
- **Cuándo se lanza**: Cuando se busca contenido que no existe en el catálogo
- **Casos**:
  - Código de búsqueda vacío
  - Contenido no encontrado con el código proporcionado

## Cómo Ejecutar

### Desde terminal:
```bash
cd semana-07
javac -d bin src/com/streamflix/**/*.java src/com/streamflix/*.java
java -cp bin com.streamflix.Main
```

### Compilación alternativa:
```bash
cd semana-07/src
javac -d ../../bin com/streamflix/**/*.java com/streamflix/*.java
cd ../..
java -cp bin com.streamflix.Main
```

## Funcionalidades Implementadas

- [x] Organización en paquetes (com.streamflix.*)
- [x] 2 excepciones personalizadas (ContenidoInvalidoException, ContenidoNoEncontradoException)
- [x] Validaciones con excepciones en GestorCatalogo
- [x] Try-catch en Main para manejo de excepciones
- [x] Finally para limpieza de recursos
- [x] 10 casos de prueba en Main (5 exitosos, 5 con errores)

## Salida Esperada

```
=== Sistema de Gestión - Semana 07 ===

--- Caso 1: Operación Exitosa ---
✅ Contenido agregado: Película: Inception dirigida por Christopher Nolan (Rating: 8.8/10)
✅ Contenido agregado: Serie: Stranger Things creada por The Duffer Brothers (4 temporadas)
✅ Contenido agregado: Documental: Nuestro Planeta narrado por David Attenborough - Tema: Naturaleza (Original StreamFlix)
✅ Contenidos agregados exitosamente

--- Caso 2: Código Inválido ---
❌ Error esperado: El código debe tener formato XXX-### (ejemplo: MOV-001)

...
```

## Cambios Aplicados desde Semana 06

1. **Reorganización**: Código movido de estructura de carpetas a paquetes Java estándar
2. **Excepciones**: Creadas 2 excepciones personalizadas (checked)
3. **Validaciones**: Agregadas validaciones robustas en GestorCatalogo con throw
4. **Manejo de errores**: Try-catch en Main para todas las operaciones críticas
5. **Servicio**: Creada clase GestorCatalogo para gestionar el catálogo

## Decisiones de Diseño

- **Checked vs Unchecked**: Se usaron excepciones checked (extends Exception) porque representan errores de negocio que el cliente debe manejar explícitamente
- **Paquete excepciones**: Separado para facilitar mantenimiento y reutilización
- **Validaciones**: Implementadas en GestorCatalogo porque centraliza la lógica de negocio y validaciones
- **Formato de código**: Validación de formato XXX-### para códigos de contenido

## Referencias

- Documentación Oracle Java: Paquetes y Excepciones
- Convenciones de nombres de paquetes Java
- Principios de manejo de excepciones

---

**Versión**: 1.0  
**Semana**: 07  
**Estado**: ✅ Completo

