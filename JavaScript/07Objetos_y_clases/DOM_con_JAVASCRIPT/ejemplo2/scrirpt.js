// getElementById
var elementoById = document.getElementById("miId");
elementoById.innerHTML = "¡Cambiado por getElementById!";

// getElementsByClassName
var elementosByClass = document.getElementsByClassName("miClase");
for (var i = 0; i < elementosByClass.length; i++) {
  elementosByClass[i].style.fontWeight = "bold";
}

// getElementsByTagName
var elementosByTag = document.getElementsByTagName("p");
for (var j = 0; j < elementosByTag.length; j++) {
  elementosByTag[j].style.color = "green";
}

// querySelector
var elementoQuery = document.querySelector("#miPadre p");
elementoQuery.innerHTML = "¡Cambiado por querySelector!";

// querySelectorAll
var elementosQueryAll = document.querySelectorAll(".miClase");
elementosQueryAll.forEach(function(elemento) {
  elemento.style.backgroundColor = "yellow";
});

// createElement y appendChild
var nuevoElemento = document.createElement("p");
nuevoElemento.innerHTML = "Nuevo párrafo";
document.getElementById("contenedor").appendChild(nuevoElemento);

// innerHTML
var elementoInnerHTML = document.getElementById("miElemento");
elementoInnerHTML.innerHTML = "<p>Nuevo contenido</p>";

// addEventListener
var eventoBoton = document.getElementById("eventoBoton");
eventoBoton.addEventListener("click", function() {
  alert("¡Evento de clic!");
});