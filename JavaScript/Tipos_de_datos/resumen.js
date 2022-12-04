  //Esto es un comentario, se ignora por el intérprete JS
        /*
        Esto son varias líneas
        de comentarios
        */

        // Para mostrar valores en js podemos usar la funcion 'alert' o usar logs
        //alert("Es mejor evitar alerts");
        console.log("Esto es un poco mejor que los alerts, f12 para verlos");

        // Variables
        //-----------
        //Podemos guardar cualquier valor

        //Las variables solo pueden estar formadas por letras, números, 
        //y los símbolos $ (dolar) y _ (guion bajo).
        //El primer caracter NO puede ser un número.

        //6 Tipos básicos-> enteros, decimales, cadenas de texto, booleanos, arrays y objetos
        //Si no ponemos ninguna palabra delante de la variable, estamos creando una variable global
        //este tipo de variables no tiene declaración.
        numero1 = 1;
        //En JS las varibles globales no se declaran
        numero1 = 2;
        numero2 = 1.5;
        texto1 = 'hola';
        texto2 = "Adios";
        boolean1 = true;
        boolean2 = false;
        array = [];
        objeto = new Date();

        //Si queremos escribir comillas dentro
        texto3 = "Una frase con 'comillas simples' dentro";
        texto4 = 'Una frase con "comillas dobles" dentro';

        //De la siguiente forma también podemos hacerlo
        //Con el carácter '\' podemos escribir caracteres especiales
        texto5 = 'Una frase con \'comillas simples\' dentro';
        texto6 = "Una frase con \"comillas dobles\" dentro";

        //también podemos hacer varias líneas de texto ("`" es el caracter a la derecha de la letra 'P')
        /*texto7 = ```
        Podemos escribir 
        varias líneas 
        de esta manera
        ```;*/

        //La consola la podemos ver pulsado f12 en el navegador que usemos, una vez
        //hayamos cargado la pagina
        console.log(numero1);
        console.log(numero2);
        console.log(texto1);
        console.log(texto2);
        console.log(boolean1);
        console.log(boolean2);
        console.log(texto3);
        console.log(texto4);
        console.log(texto5);
        console.log(texto6);
        //console.log(texto7);

        //Como JS es un lenguaje NO TIPADO, podemos guardar cualquier valor en una variable
        console.log("JS ES NO TIPADO:")
        numero1 = "esto es un numero"
        console.log(numero1)
        numero1 = true
        console.log(numero1)

        //podemos concatenar a un String
        console.log("Vamos a concatenar la variable numero2: " + numero2)
        //podemos expandir variables creando la cadena con el acento grave 
        //("`" es la letra a la derecha de la 'P' :))
        //y dentro de la cadena usar "${NOMBRE_VARIABLE}"
        console.log(`Vamos a expandir la variable numero2: ${numero2}`)

        //podemos user la palabra reservada "var" para declarar variables, en este caso su ámbito
        //es el de la función, si no ponemos nada el ámbito será global
        var dato = 5;//En este caso, no estamos declarando la variable dentro de ninguna función
                    //por lo tanto, tambien sera global
        var dato = 7;//aquí no estamos creando la variable de nuevo, estamos redefiniéndola
        var movida;//podemos dejar variables sin definir, el valor será ’undefined’
        console.log(movida);

        //’null’ es un tipo de valor en JS, ‘null’ indica ausencia de valor
        var referencia = null;
        console.log(referencia)

        //podemos reasignar valores de distinto tipo
        referencia = 7;
        referencia = "Siete";
        referencia = true;

        //OJO con operaciones imposibles
        /* NaN (Not a Number*/
        var numero1 = "cadena";   
        var numero2 = 2;
        console.log("Resultado de division: " + numero1/numero2);//muestra el valor ‘NaN’

        //alguna función interesante para saber si es un número
        //podemos comprobar los tipos que guarda una variable
        console.log(isNaN(texto1));//pregunta si es NO es un numero - true
        console.log(isNaN(numero2));//false

        //Hay otros dos tipos especiales en las variables
        //’undefined’, cuando no le asignamos ningún valor

        //la palabra reservada 'typeof' sirve para averguar cual es el tipo que estamos guardando
        if(typeof dato == "number"){
            console.log("el dato es un numero");
        }
        if(typeof movida == 'undefined'){
            console.log("La movida es undefined");
        }

        //En la últimas versiones de JS podemos encontrar un nuevo tipo de alcance 
        //Este tipo de alcance seria el de bloque '{}' y lo podemos declarar con la palabra
        //reservada 'let'. Es equivalente al ambito de las varibles de Java
        //Recomendación, usar este tipo de alcance en JS
        let num1 = 5;
        let txt1 = "otro texto";
        //con let NO se puede redefinir una variable
        let v1 = 9;
        //let v1 = 7; //esto daría un error
        v1 = 11;

        //también desde las últimas versiones constantes con la palabra reservada 'const'
        //no se puede cambiar su valor
        const PI = 3.1416;
        console.log(PI);

        //AMBITO de las variables
        console.log("=========== AMBITO ==============")
        function pruebaVar(){
            //las variables que no tienen declaración
            //(no tienen ni 'var' ni 'let') son de ámbito global
            variable1 = "Esta variable es global"
            //las variables con var su ámbito es el de función
            var variable2 = "El ámbito de esta variable es de ESTA función"
            console.log(variable1)
            console.log(variable2)
            
            if(2 > 1){
                var variable3 = "Harry potter es un muggle"
            }
            
            console.log(variable3)//nótese que llevo un buen rato sin poner ";" :) :)
        }//Aqui mueren las variables variable2 y variable3.

        pruebaVar()
        console.log(variable1)
        //Esta de aquí daría error ya que no tiene alcance
        //console.log(variable2)

        //LET es básicamente como en java
        //el ámbito de LET es el de bloque
        console.log("========= LET=========")
        function pruebaLet(){
            let var1 = 10
            if(true){
                let var2 = 20
                console.log("var1: " + var1)
                console.log("var2: " + var2)
            }//aqui muere var2
            console.log("var1: " + var1)
            //console.log("var2: " + var2) //CASCA!! Esta fuera de su ambito
        }//aquí muere var1

        //Esto también cascaraía
        //console.log(var1)

        pruebaLet()

        /*
        RESUMEN DEL ALCANCE DE LAS VARIABLES
        *************
        Si no ponemos nada, será global, la pongamos donde la pongamos -> dentro del script, dentro de 
        una función o de un bloque. Podrá ser cambiado su valor
        Si ponemos var:
        -Dentro de un script, será global
        -Dentro de una función, será legible dentro de la función, entera
        -Dentro de un bloque, será legible dentro de la función, entera
        -Podrá ser cambiado su valor
        Si ponemos let (es como en java):
        -Dentro de un script, será global
        -Dentro de una función, será legible dentro de la función y de los bloques "hijos"
        -Dentro de un bloque, será legible solamente dentro del propio bloque
        -Podrá ser cambiado su valor
        Si ponemos const:
        -Dentro de un script, será global
        -Dentro de una función, será legible dentro de la función y de los bloques "hijos"
        -Dentro de un bloque, será legible solamente dentro del propio bloque
        -No podrá ser cambiado su valor
        *************
        */