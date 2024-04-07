### Máquinas Virtuales (VM):

- **Aislamiento**: Las VMs proporcionan un aislamiento completo, ya que ejecutan un sistema operativo completo independiente del host.
  
- **Recurso Intensivo**: Las VMs pueden consumir más recursos, porque cada una tiene su propio sistema operativo y una cantidad significativa de recursos dedicados.
  
- **Arranque Más Lento**: El arranque de una VM es más lento, puesto que implica iniciar un sistema operativo completo.
  
- **Hypervisor**: Las VMs se ejecutan en un hipervisor, que gestiona y asigna recursos para cada máquina virtual.

### Contenedores:

- **Aislamiento Ligero**: Los contenedores comparten el mismo kernel del sistema operativo del host, lo que proporciona un aislamiento más ligero.
  
- **Eficiencia de Recursos**: Los contenedores son más eficientes en términos de recursos, ya que comparten el mismo sistema operativo y solo incluyen las bibliotecas y dependencias necesarias.
  
- **Arranque Rápido**: Los contenedores tienen un arranque rápido, por el hecho de que no requieren iniciar un sistema operativo completo.
  
- **Docker, Containerd, etc.**: Docker es una de las tecnologías de contenedores más populares, y otras implementaciones incluyen containerd, rkt, etc.


# Docker: Guía Completa

## Introducción a Docker

Docker es una plataforma de código abierto que permite desarrollar, desplegar y ejecutar aplicaciones dentro de contenedores. Los contenedores permiten empaquetar una aplicación con todas sus dependencias en una única unidad, asegurando que esta se ejecute de manera rápida y fiable en cualquier entorno.

## Instalación de Docker

Para instalar Docker, sigue los pasos según tu sistema operativo:

- **Linux**: Consulta la documentación oficial de Docker para obtener instrucciones específicas para tu distribución.

- **Windows**: Descarga e instala Docker Desktop desde [el sitio oficial de Docker](https://www.docker.com/products/docker-desktop).

- **Mac**: Descarga e instala Docker Desktop desde [el sitio oficial de Docker](https://www.docker.com/products/docker-desktop).

## Uso Básico de Docker

### Comandos Principales

- `docker pull <nombre_de_la_imagen>`: Descarga una imagen desde Docker Hub o un registro de imágenes.

- `docker run <nombre_de_la_imagen>`: Ejecuta un contenedor basado en la imagen especificada.

- `docker ps`: Muestra los contenedores en ejecución.

- `docker images`: Lista las imágenes descargadas en tu sistema.

### Crear y Ejecutar Contenedores

Para crear y ejecutar un contenedor:

1. Descarga una imagen con el comando `docker pull`.

2. Ejecuta un contenedor con el comando `docker run`.

Por ejemplo:

```bash
docker pull nginx
docker run -d -p 8080:80 nginx
```

Un ejemplo de dockerfile:
```dockerfile
FROM node:14

WORKDIR /app

COPY package.json .
RUN npm install

COPY . .

EXPOSE 3000

CMD ["node", "app.js"]

```
# Imágenes Docker

## ¿Qué es una imagen Docker?

Una imagen Docker es un paquete ligero y autónomo que contiene todo lo necesario para ejecutar una aplicación: código, entorno de ejecución, bibliotecas, dependencias y configuraciones. Se puede considerar como una instantánea del sistema de archivos que forma la base de un contenedor.

## Creación de una imagen Docker

Para crear una imagen Docker, necesitas definir un archivo llamado Dockerfile que especifique los pasos necesarios para configurar el entorno de la aplicación. Aquí hay un ejemplo básico de un Dockerfile para una aplicación web en Node.js:

```Dockerfile
# Usa la imagen base de Node.js
FROM node:14

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo package.json al directorio de trabajo
COPY package.json .

# Instala las dependencias
RUN npm install

# Copia el resto de los archivos al directorio de trabajo
COPY . .

# Expone el puerto 3000
EXPOSE 3000

# Comando para ejecutar la aplicación
CMD ["node", "app.js"]
```

Ejemplo de construir una imagen:
```bash
docker build -t mi-aplicacion .
```

Ejemplo de uso de una imagen:
```bash
docker run -d -p 8080:3000 mi-aplicacion
```