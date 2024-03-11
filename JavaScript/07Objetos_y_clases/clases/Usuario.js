class Usuario {
    constructor(username, password) {
      this.username = username;
      this.password = password;
      this.isAuthenticated = false;
    }
  
    autenticar(password) {
      if (password === this.password) {
        this.isAuthenticated = true;
        return `¡Hola, ${this.username}! Has iniciado sesión.`;
      } else {
        return 'La contraseña es incorrecta.';
      }
    }
  
    cerrarSesion() {
      this.isAuthenticated = false;
      return 'Has cerrado sesión.';
    }
  }
  
  const usuario1 = new Usuario('juanito123', 'contraseña123');
  console.log(usuario1.autenticar('contraseña123')); // Salida: ¡Hola, juanito123! Has iniciado sesión.
  console.log(usuario1.cerrarSesion()); // Salida: Has cerrado sesión.
  