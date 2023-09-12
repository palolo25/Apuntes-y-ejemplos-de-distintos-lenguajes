let horaDia = 9;

if(horaDia >= 6 && horaDia <= 11){
    console.log("Buenos dias")
}
else if(horaDia >= 12 && horaDia <=18){
    console.log("Buenas tardes")
}
else if(horaDia >= 19 && horaDia <=24){
    console.log("Buenas noches")
}
else if(horaDia >= 0 && horaDia <=6){
    console.log("Durmiendo")
}
else{
    console.log("Hora no valida")
}