
### Opción 2: Clic Directo
Haga clic en los archivos proporcionados en las carpetas respectivas de su sistema operativo:

- **Windows**:
- [windows/Programa1.bat](windows/Programa1.bat)
- [windows/Programa2.bat](windows/Programa2.bat)
- **Linux**:
- [linux/Programa1.sh](linux/Programa1.sh)
- [linux/Programa2.sh](linux/Programa2.sh)
- **macOS**:
- [macos/Programa1.sh](macos/Programa1.sh)
- [macos/Programa2.sh](macos/Programa2.sh)

### Descargar los Archivos
Puede descargar los archivos completos del proyecto desde el repositorio oficial de GitHub:
[Repositorio GitHub](https://github.com/UNED-Informatica/PED02)

---

## A. Tarea

### Descripción
El objetivo de la tarea es que el alumno cree dos programas básicos en un lenguaje de programación permitido (**C, Java, Modula, Pascal**). Los programas deben ser ejecutables en una ventana de **Windows**, **MS-DOS**, o **navegador web**.

1. **Programa 1**: Mostrar datos personales del alumno y un saludo.
2. **Programa 2**: Pedir dos números al usuario, calcular el máximo y mostrar el resultado.

### Pasos Específicos del Programa 2
1. Dar la bienvenida al programa.
2. Pedir al usuario dos números.
3. Calcular el número mayor.
4. Mostrar el número mayor.
5. Imprimir un mensaje de despedida.

---

## B. Reflexiones Preliminares

### B.1. Criterios
Se establecieron los siguientes criterios para la solución:
- **Simple**: Fácil de ejecutar sin requerir configuraciones o abrir terminales.
- **Portable**: Todo contenido debe estar en un solo archivo o carpeta sin necesidad de instalación adicional.
- **Cross-Platform**: La solución debe funcionar en diferentes sistemas operativos.
- **Acceso con Doble Click**: Los programas deben abrirse fácilmente.

### B.2. Lenguaje
Se compararon las siguientes opciones:

| **Lenguaje** | **Pros**                                                                                  | **Contras**                                                                                      |
|--------------|------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------|
| **C**        | Alta eficiencia, compilación directa a binarios (`.exe`).                                | No es multiplataforma nativa; requiere recompilación para cada sistema operativo.              |
| **Java**     | Multiplataforma, facilidad para empaquetar en `.jar`.                                     | Requiere **JRE** para ejecutar, el empaquetado con JRE aumenta el tamaño del archivo.          |
| **Modula**   | Diseñado para programas educativos y simples.                                             | Poco soporte actual; compiladores y entornos limitados.                                        |
| **Pascal**   | Fácil de leer y usar, especialmente con herramientas como Free Pascal Compiler (FPC).     | Menos flexible para integrar en proyectos modernos, no multiplataforma nativo.                |

Se eligió **Java** debido a su capacidad multiplataforma y facilidad para empaquetar como un único archivo ejecutable.

**Nota**: Una solución en Python habría sido mucho más sencilla, ya que es más fácil de leer, escribir y ejecutar. Sin embargo, Python no está entre los lenguajes permitidos para esta tarea.

---

## C. Solución

### C.1. Organización de la Carpeta Solución
La carpeta de entrega contiene lo siguiente:
Carpeta Principal/
├── java/
│   ├── PED02_01.jar       # Programa 1 empaquetado en formato JAR
│   ├── PED02_02.jar       # Programa 2 empaquetado en formato JAR
├── windows/
│   ├── Programa1.bat      # Archivo bat para Windows
│   ├── Programa2.bat      # Archivo bat para Windows
├── linux/
│   ├── Programa1.sh       # Script para Linux
│   ├── Programa2.sh       # Script para Linux
├── macos/
│   ├── Programa1.sh       # Script para macOS
│   ├── Programa2.sh       # Script para macOS
├── jre-windows/           # JRE para Windows
├── jre-linux/             # JRE para Linux
├── jre-macos/             # JRE para macOS
├── dev/
│   ├── PED02_01/
│   │   ├── PED02_01.java
│   │   ├── PED02_01.class
│   │   ├── MANIFEST.MF
│   ├── PED02_02/
│   │   ├── PED02_02.java
│   │   ├── PED02_02.class
│   │   ├── MANIFEST.MF

### C.2. Explicación de las Carpetas JRE
Las carpetas `jre-windows`, `jre-linux`, y `jre-macos` contienen un entorno de ejecución de Java (JRE) preconfigurado para cada sistema operativo. Esto asegura que los programas puedan ejecutarse incluso si el sistema del usuario no tiene Java instalado.
Los archivos del código fuente para el Java (JRE) se descargaron de [adoptium.net](https//:adoptium.net).
---

Este archivo sirve como punto de partida para entender y ejecutar la solución de la tarea.