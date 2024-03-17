def listarTerminos(**terminos):
    for llave, valor in terminos.items():
        print(f'{llave}: {valor}')
        

listarTerminos(IDE = 'Integrated Development Enviorament', PK = 'Primary Key')
listarTerminos(DBMS = 'Database Management System')