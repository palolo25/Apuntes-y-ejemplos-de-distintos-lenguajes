console.log('activo');

document.querySelector('#dolar').addEventListener('click',function(){
    obtenerDatos();
});

function obtenerDatos(){
    console.log('diste click')
    let url = `https://mindicador.cl/api/euro`

    const api = new XMLHttpRequest();
    api.open('GET',url,true);
    
    api.send();

    api.onreadystatechange = function() {
        if (this.status == 200 && this.readyState == 4) {
            if (this.responseText.trim() !== '') {
                let datos = JSON.parse(this.responseText);
                console.log(datos);
            } else {
                console.error("La respuesta está vacía");
            }
        }
    }
}