# Audio Player Application

Audio Player Application es una aplicación básica para gestionar y mostrar audios como canciones y podcasts. Ofrece funcionalidades para interactuar con una lista de audios, mostrar títulos, y gestionar audios favoritos. Este proyecto está diseñado para ser extensible y fácil de usar.

## Características

- Gestión de canciones y podcasts.
- Incremento de reproducciones y "me gusta".
- Listado de audios con detalles como título, calificación y reproducciones.
- Mantenimiento de una lista de favoritos basada en calificaciones.
- Fácil expansión para agregar más tipos de audios.
Para ejecutar el proyecto, asegúrate de tener instalado Java. Luego, puedes utilizar los siguientes comandos:

## Estructura del Proyecto

El proyecto incluye los siguientes componentes:

### Clases principales

1. **Audio.java**  
   Clase base que define las propiedades y métodos comunes para cualquier tipo de audio.  
   **Propiedades**:  
   - `title`: Título del audio.  
   - `totalPlay`: Total de reproducciones.  
   - `totalLikes`: Total de "me gusta".  
   - `calification`: Calificación del audio (1-5).  

   **Métodos**:
   - `like()`: Incrementa el número de "me gusta".
   - `play()`: Incrementa el contador de reproducciones.
   - Métodos abstractos y heredados para personalizar comportamiento según el tipo de audio.

2. **Song.java**  
   Representa una canción con propiedades específicas como artista, álbum y género.  
   **Propiedades adicionales**:  
   - `artist`: Nombre del artista.  
   - `album`: Nombre del álbum.  
   - `genre`: Género de la canción.  

   **Método sobrescrito**:
   - `getCalification()`: Devuelve una calificación calculada según los "me gusta".

3. **Podcast.java**  
   Representa un podcast con detalles como presentador y descripción.  
   **Propiedades adicionales**:  
   - `presenter`: Nombre del presentador.  
   - `description`: Descripción del podcast.  

   **Método sobrescrito**:
   - `getCalification()`: Devuelve una calificación basada en reproducciones.

4. **Favorite.java**  
   Clase para gestionar una lista de audios favoritos.  
   **Método principal**:
   - `addFavorite(Audio audio)`: Añade un audio a favoritos si cumple los criterios de calificación.

5. **Interface.java**  
   Interfaz que define los métodos clave para mostrar y gestionar audios.  
   **Métodos**:
   - `showMenu()`
   - `showTitle(Audio[] audios)`
   - `showList(Audio[] audios)`
   - `insertAudio(Audio audio)`

6. **Main.java**  
   Punto de entrada de la aplicación, donde se ejecutan ejemplos de uso de las clases y se muestra el menú interactivo.

## Requisitos Previos

- **Java 17** o superior instalado en tu máquina.
- Configurar correctamente las variables de entorno de Java (JAVA_HOME).

## Instalación

1. Clona este repositorio en tu máquina:
   ```bash
   git clone https://github.com/tuusuario/audio-player-application.git
   cd audio-player-application
2. Compila los archivos del proyecto:
   ```bash
   javac -cp "libs/*:." src/com/challenge/audioplayer/**/*.java -d out
## Ejecución
   
1. Ejecuta la aplicación desde el directorio raíz del proyecto:
   ```bash
   java -cp "libs/*:out" com.challenge.audioplayer.main.Main
## Ejemplos de Uso

1. **Reproducir un audio**  
   El método `play()` incrementa el contador de reproducciones para un audio.

2. **Agregar a Favoritos**  
   Usa el método `addFavorite(audio)` para añadir audios con alta calificación a la lista de favoritos.

3. **Listar audios disponibles**  
   Utiliza `showList(audios)` para mostrar una lista detallada de audios.
