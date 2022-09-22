  
# Comandos de git   
  
  # Git config --list --show-origin:
  - ## Rutas de acceso a la configuración de git
  # Git config --list:
  - ## Muestra la lista de configuración de git
  # Git init: 
  - ## inicializar el repositorio
  # Git status: 
  - ## Visualizar cambios
  # Git add . : 
  - ## Agregar los cambios de la carpeta en la que nos encontramos agregar todo
  # Git add nombre_de_archivo.extensión: 
  - ## agregar el archivo al repositorio
  # Git commit -m “Mensaje”:
  - ## Agregamos los cambios para el repositorio
  # Git log nombre_de_archivos.extensión:
  - ## Histórico de cambios con detalles
  # Git push: 
  - ## Envía a otro repositorio remoto lo que estamos haciendo
  # Git pull:
  - ## Traer del repositorio remoto a nuestro local
  # Git log archivo.extensión: 
  - ## Muestra la historia del archivo
  # Git checkout: 
  - ## Traer cambios realizados
  # Git rm --cached archivo.extensión: 
  - ## Se utiliza para devolver el archivo que se tiene en ram. Cuando escribimos git add, lo devuelve a estado natural mientras está en staging. Elimina los archivos de nuestro repositorio local y del área de staging, pero los mantiene en nuestro disco duro. Básicamente le dice a Git que deje de trackear el historial de cambios de estos archivos, por lo que pasaran a un estado untracked.
  # Git rm --force archivo.extensión: 
  - ## Elimina los archivos de Git y del disco duro. Git siempre guarda todo, por lo que podemos acceder al registro de la existencia de los archivos, de modo que podremos recuperarlos si es necesario (pero debemos usar comandos más avanzados).
  # Git reset --soft:
  - ## Borramos todo el historial y los registros de Git pero guardamos los cambios que tengamos en Staging, así podemos aplicar las últimas actualizaciones a un nuevo commit.

  # Git reset --hard:
  - ## Borra todo, absolutamente todo. Toda la información de los commits y del área de staging se borra del historial.

  # Git reset HEAD:
  - ## Este es el comando para sacar archivos del área de staging. No para borrarlos ni nada de eso, solo para que los últimos cambios de estos archivos no se envíen al último commit, a menos que cambiemos de opinión y los incluyamos de nuevo en staging con git add, por supuesto.

# Comandos de la terminal
  # Ls: 
  - ## Listado de carpetas en donde me encuentro. Es decir, como emplear dir en windows.
  # Pwd:
  - ## Ubicación actual en la que te encuentras
  # Mkdir: 
  - ## Make directory nueva carpeta
  # Touch archivo.extensión: 
  - ## Crear archivo vacío
  # Cat archivo.extensión:
  - ## Muestra el contenido del archivo
  # History: 
  - ## Historial de comandos utilizados durante esa sesión
  # Rm archivo.extensión: 
  - ## Eliminación de archivo
  # Comando --help: 
  - ## Ayuda sobre el comando