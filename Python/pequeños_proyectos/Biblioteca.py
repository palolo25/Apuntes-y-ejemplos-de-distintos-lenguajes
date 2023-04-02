class Autor:
    def __init__(self, nombre, apellidos)  -> None:
        self.Nombre = nombre
        self.Apellidos = apellidos
    def MostrarAutor(self):
        print("Autor: ",self.Nombre," ",self.Apellidos)

class Libro:
    def __init__(self, titulo, isbn) -> None:
        self.Titulo = titulo
        self.ISBN = isbn
    def AñadirAutor(self, autor):
        self.Autor = autor
    def MostrarLibro(self):
        print("-----Libro-----")
        print("Titulo: ",self.Titulo)
        print("ISBN: ", self.ISBN)
        self.Autor.MostrarAutor()
        print("----------------")
    def ObtenerTitulo(self):
        return self.Titulo

class Biblioteca:
    def __init__(self) -> None:
        self.listaLibros = []
    def NumeroLibros(self):
        return len(self.listaLibros)
    def AñadirLibros(self,libro):
        self.listaLibros = self.listaLibros + [libro]
    def MostrarBiblioteca(self):
        print("################################")
        posicionaborrar = 0
        encontrado = False
        titulo = input("Escriba el title del libro que quiere borrar: ")
        for item in self.listaLibros:
            if item.ObtenerTitulo() == titulo:
                encontrado = True
                break
            posicionaborrar += 1
        if encontrado:
            del self.listaLibros[posicionaborrar]
            print("Libro borrado correctamente")
        else:
            print("Libro no encontrado")

    def MostrarMenu(self):
        print("""
        --- BIBLIOTECA ---

        1. Añadir libro
        2. Mostrar biblioteca
        3. Borrar libro
        4. Número de libros
        5. Salir
                """)

    def AñadirLibroABiblioteca(self):
        titulo = input("Introduzca el nombre del libro: ")
        isbn = input("Introduzca el ISBN del libro: ")
        autornombre = input("Escriba el nombre del autor: ")
        autorapellidos = input("Escribra el apellido del autor: ")
        autor = Autor(autornombre,autorapellidos)
        libro = Libro(titulo,isbn)
        libro.AñadirAutor(autor)
        self.AñadirLibros(libro)

    def MostrarBiblioteca(self):
        for item in self.listaLibros:
            item.MostrarLibro()

    def BorrarLibro(self):
        print("Borrar libro")
    
    def NumeroLibros(self):
        print("El numero de libros en la biblioteca es: ", self.NumeroLibros())

fin = False
biblioteca = Biblioteca()

while not fin:
    biblioteca.MostrarMenu()
    opcion = int(input("Seleccione la opcion: "))
    
    if(opcion == 1):
        biblioteca.AñadirLibroABiblioteca()
    elif(opcion == 2):
        biblioteca.MostrarBiblioteca()
    elif(opcion == 3):
        biblioteca.BorrarLibro()
    elif(opcion == 4):
        biblioteca.NumeroLibros()
    elif(opcion == 5):
        fin = true