# AppEdificaciones_Calidad

Aplicación Android desarrollada en Java (Gradle) para consultar edificaciones. Incluye el recorrido de la Basílica de Yanahuara, con datos de sus ambientes (vértices de habitaciones y puertas), galería de imágenes y reproducción de audio.

## Características

- Listado de edificaciones y pantalla de inicio.
- Vista de planta dibujada en canvas (`RoomView`) y galería de imágenes (`GalleryView`).
- Reproductor de audio como servicio (`AudioPlayerService`).
- Datos de la Basílica de Yanahuara en `app/src/main/assets/`.

## Estructura

- `app/src/main/java/com/example/appedificaciones/`: código fuente (actividades, `canvas/`, `controller/`, `fragments/`, `model/`, `utils/`).
- `app/src/main/assets/`: archivos de datos e imágenes.
- `app/src/androidTest/` y `app/src/test/`: pruebas.

## Tecnologías

Java, Android SDK y Gradle.

## Cómo ejecutarlo

1. Abre el proyecto en Android Studio.
2. Sincroniza Gradle.
3. Ejecuta la app en un emulador o en un dispositivo Android.
