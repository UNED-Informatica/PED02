<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tarea de Programación: Mi Primer Programa</title>
</head>
<body>
    <h1><strong>Tarea de Programación: Mi Primer Programa</strong></h1>

    <p>Este documento describe la solución a la tarea de programación presentada, los pasos realizados y las decisiones tomadas para cumplir con los criterios establecidos.</p>

    <h2>Quick Access</h2>
    <p>Para ejecutar los programas, puede hacerlo de dos maneras:</p>
    <ul>
        <li><strong>Opción 1:</strong> Abrir una terminal y ejecutar el script correspondiente a su sistema operativo:
            <ul>
                <li><strong>Windows:</strong> Ejecute <code>Programa1.bat</code> o <code>Programa2.bat</code> desde la terminal de comandos.</li>
                <li><strong>Linux:</strong> Ejecute <code>./Programa1.sh</code> o <code>./Programa2.sh</code> desde una terminal.</li>
                <li><strong>macOS:</strong> Ejecute <code>./Programa1.sh</code> o <code>./Programa2.sh</code> desde una terminal.</li>
            </ul>
        </li>
        <li><strong>Opción 2:</strong> Haga clic en los archivos proporcionados en las carpetas respectivas de su sistema operativo:
            <ul>
                <li><a href="windows/Programa1.bat">Programa1.bat</a> (Windows)</li>
                <li><a href="windows/Programa2.bat">Programa2.bat</a> (Windows)</li>
                <li><a href="linux/Programa1.sh">Programa1.sh</a> (Linux)</li>
                <li><a href="linux/Programa2.sh">Programa2.sh</a> (Linux)</li>
                <li><a href="macos/Programa1.sh">Programa1.sh</a> (macOS)</li>
                <li><a href="macos/Programa2.sh">Programa2.sh</a> (macOS)</li>
            </ul>
        </li>
    </ul>
    <hr>

    <h2>A. Tarea</h2>
    <h3>Descripción</h3>
    <p>El objetivo de la tarea es que el alumno cree dos programas básicos en un lenguaje de programación permitido (C, Java, Modula, Pascal). Los programas deben ser ejecutables en una ventana de <strong>Windows</strong>, <strong>MS-DOS</strong>, o <strong>navegador web</strong>.</p>

    <ol>
        <li><strong>Programa 1:</strong> Mostrar datos personales del alumno y un saludo.</li>
        <li><strong>Programa 2:</strong> Pedir dos números al usuario, calcular el máximo y mostrar el resultado.</li>
    </ol>

    <h3>Pasos Específicos del Programa 2</h3>
    <ol>
        <li>Dar la bienvenida al programa.</li>
        <li>Pedir al usuario dos números.</li>
        <li>Calcular el número mayor.</li>
        <li>Mostrar el número mayor.</li>
        <li>Imprimir un mensaje de despedida.</li>
    </ol>
    <hr>

    <h2>B. Reflexiones Preliminares</h2>

    <h3>B.1. Criterios</h3>
    <p>Se establecieron los siguientes criterios para la solución:</p>
    <ul>
        <li><strong>Simple:</strong> Fácil de ejecutar sin requerir configuraciones o abrir terminales.</li>
        <li><strong>Portable:</strong> Todo contenido debe estar en un solo archivo o carpeta sin necesidad de instalación adicional.</li>
        <li><strong>Cross-Platform:</strong> La solución debe funcionar en diferentes sistemas operativos.</li>
        <li><strong>Acceso con Doble Click:</strong> Los programas deben abrirse fácilmente.</li>
    </ul>

    <h3>B.2. Lenguaje</h3>
    <table border="1">
        <thead>
            <tr>
                <th>Lenguaje</th>
                <th>Pros</th>
                <th>Contras</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><strong>C</strong></td>
                <td>Alta eficiencia, compilación directa a binarios ('.exe').</td>
                <td>No es multiplataforma nativa; requiere recompilación para cada sistema operativo.</td>
            </tr>
            <tr>
                <td><strong>Java</strong></td>
                <td>Multiplataforma, facilidad para empaquetar en '.jar'.</td>
                <td>Requiere <strong>JRE</strong> para ejecutar, el empaquetado con JRE aumenta el tamaño del archivo.</td>
            </tr>
        </tbody>
    </table>
    <hr>

    <h2>C. Solución</h2>

    <h3>C.1. Organización de la Carpeta Solución</h3>
    <p>La carpeta de entrega contiene lo siguiente:</p>
    <pre>
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
    </pre>

    <h3>C.2. Explicación de las Carpetas JRE</h3>
    <p>Las carpetas <code>jre-windows</code>, <code>jre-linux</code>, y <code>jre-macos</code> contienen un entorno de ejecución de Java (JRE) preconfigurado para cada sistema operativo. Esto asegura que los programas puedan ejecutarse incluso si el sistema del usuario no tiene Java instalado.</p>
    <hr>

    <footer>
        <p>Este archivo es el punto de inicio de la documentación del proyecto.</p>
    </footer>
</body>
</html>