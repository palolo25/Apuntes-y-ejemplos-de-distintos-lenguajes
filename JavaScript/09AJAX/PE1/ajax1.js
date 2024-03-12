console.log("Activo");

document.querySelector('#boton').addEventListener('click', traerDatos);

function traerDatos() {
    console.log('Funcion activada')

    const xhttp = new XMLHttpRequest();

    xhttp.open('GET', "fichero.txt", true);

    xhttp.send();

    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 || this.readyState == 200) {
           // console.log(this.responseText);
           document.querySelector('#respuesta').innerHTML = this.responseText;
        }
    }

}