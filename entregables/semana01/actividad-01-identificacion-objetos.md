# Actividad 1: Identificación de Objetos del Dominio

**Estudiante:** Juan David Villada Valderrama  
**Ficha:** 3228973A  
**Fecha:** Semana 01

---

## Objetos Identificados en StreamFlix

### Objeto 1: Contenido Audiovisual (StreamContent)

**¿Qué es?**  
Una película, serie, documental o contenido original disponible en la plataforma de streaming. Representa cualquier elemento audiovisual que los usuarios pueden ver.

**Características (Atributos):**
- `contentCode`: Código único identificador del contenido (ej: STR-001)
- `title`: Título del contenido
- `genre`: Género al que pertenece (Ciencia Ficción, Drama, Acción, etc.)
- `duration`: Duración en minutos
- `releaseYear`: Año de lanzamiento
- `rating`: Clasificación por edades (G, PG, PG-13, R, etc.)
- `director`: Nombre del director o creador
- `description`: Sinopsis del contenido
- `isOriginal`: Indica si es contenido original de StreamFlix

**Comportamientos (Métodos):**
- `reproducir()`: Inicia la reproducción del contenido
- `pausar()`: Pausa la reproducción actual
- `calificar()`: Permite al usuario calificar el contenido
- `agregarAFavoritos()`: Añade el contenido a la lista de favoritos
- `recomendar()`: Genera recomendaciones basadas en este contenido
- `mostrarInfo()`: Muestra la información completa del contenido

---

### Objeto 2: Usuario/Suscriptor (Subscriber)

**¿Qué es?**  
Una persona que tiene una cuenta activa en StreamFlix y puede acceder al contenido mediante una suscripción.

**Características (Atributos):**
- `subscriberId`: Identificador único del suscriptor
- `name`: Nombre completo del usuario
- `email`: Correo electrónico de la cuenta
- `subscriptionPlan`: Tipo de plan (Individual, Familiar, Premium)
- `registrationDate`: Fecha de registro en la plataforma
- `isActive`: Estado de la suscripción (activa/inactiva)
- `profiles`: Lista de perfiles asociados a la cuenta

**Comportamientos (Métodos):**
- `iniciarSesion()`: Autentica al usuario en la plataforma
- `cerrarSesion()`: Cierra la sesión actual
- `cambiarPlan()`: Modifica el plan de suscripción
- `crearPerfil()`: Crea un nuevo perfil de usuario
- `verHistorial()`: Muestra el historial de visualización
- `gestionarPerfiles()`: Administra los perfiles de la cuenta

---

### Objeto 3: Perfil de Usuario (UserProfile)

**¿Qué es?**  
Un perfil individual dentro de una cuenta de suscriptor que permite personalización y recomendaciones específicas para cada usuario.

**Características (Atributos):**
- `profileId`: Identificador único del perfil
- `profileName`: Nombre del perfil (ej: "Juan", "Niños")
- `avatar`: Imagen de perfil seleccionada
- `ageRestriction`: Restricción de edad para el contenido
- `language`: Idioma preferido
- `watchHistory`: Historial de contenidos vistos
- `favorites`: Lista de contenidos favoritos
- `watchlist`: Lista de contenidos para ver después

**Comportamientos (Métodos):**
- `seleccionarPerfil()`: Activa este perfil para navegación
- `agregarAFavoritos()`: Añade contenido a favoritos
- `agregarAWatchlist()`: Añade contenido a la lista de ver después
- `verRecomendaciones()`: Muestra recomendaciones personalizadas
- `filtrarContenido()`: Filtra contenido según preferencias
- `actualizarPreferencias()`: Modifica las preferencias del perfil

---

### Objeto 4: Plan de Suscripción (SubscriptionPlan)

**¿Qué es?**  
Un tipo de suscripción que define las características, beneficios y precio del servicio que el usuario puede contratar.

**Características (Atributos):**
- `planId`: Identificador del plan
- `planName`: Nombre del plan (Individual, Familiar, Premium)
- `price`: Precio mensual del plan
- `maxProfiles`: Número máximo de perfiles permitidos
- `videoQuality`: Calidad de video disponible (SD, HD, 4K)
- `simultaneousStreams`: Número de reproducciones simultáneas
- `features`: Lista de características incluidas

**Comportamientos (Métodos):**
- `mostrarDetalles()`: Muestra información completa del plan
- `calcularPrecioAnual()`: Calcula el precio anual con descuento
- `compararPlanes()`: Compara características con otros planes
- `validarLimites()`: Verifica si se cumplen los límites del plan
- `actualizarPrecio()`: Modifica el precio del plan

---

### Objeto 5: Reproducción/Sesión de Visualización (PlaybackSession)

**¿Qué es?**  
Una sesión activa de visualización de contenido, que rastrea el progreso y estado de reproducción de un usuario.

**Características (Atributos):**
- `sessionId`: Identificador único de la sesión
- `content`: Contenido que se está reproduciendo
- `profile`: Perfil que está viendo el contenido
- `currentTime`: Tiempo actual de reproducción (en segundos)
- `totalDuration`: Duración total del contenido
- `playbackSpeed`: Velocidad de reproducción (1x, 1.5x, 2x)
- `subtitleLanguage`: Idioma de subtítulos activos
- `audioLanguage`: Idioma de audio seleccionado
- `startTime`: Hora de inicio de la sesión
- `isPaused`: Estado de pausa

**Comportamientos (Métodos):**
- `iniciarReproduccion()`: Comienza a reproducir el contenido
- `pausar()`: Pausa la reproducción
- `reanudar()`: Reanuda la reproducción desde donde se pausó
- `adelantar()`: Avanza en el contenido
- `retroceder()`: Retrocede en el contenido
- `cambiarVelocidad()`: Modifica la velocidad de reproducción
- `cambiarSubtitulos()`: Cambia el idioma de los subtítulos
- `guardarProgreso()`: Guarda el progreso de visualización
- `finalizarSesion()`: Cierra la sesión y guarda el progreso

---

## Resumen

Los 5 objetos principales identificados son:
1. **StreamContent** - Representa el contenido audiovisual
2. **Subscriber** - Representa al usuario/suscriptor
3. **UserProfile** - Representa un perfil individual dentro de una cuenta
4. **SubscriptionPlan** - Representa los diferentes planes de suscripción
5. **PlaybackSession** - Representa una sesión activa de visualización

Estos objetos forman la base del modelo de dominio de StreamFlix y permiten representar las interacciones principales entre usuarios, contenido y la plataforma.

