/**
 * Calcula el precio base de la furgoneta, el que paga pa comprarla,
 * en funcion del numero (solo hay 2 opciones).
 * @return lo que devuelve es el numero que se suma a precio base, osea que
 * se sumaran 20000 al precio base si introduces 2.
 */
fun calcularPreuBase():Int{
    var opcio: Int
    do {
        println("Introduce ${CYAN_BRIGHT}1$RESET o ${PURPLE_BRIGHT}2$RESET")
        opcio=llegirInt()
    }while (opcio !in 1..2)
    if (opcio==2) return 20000
    return 0
}

/**
 * Aqui se calcula el precio tras su uso.
 * @param kilometres es la distancia que ha introducido el usuario,
 * el cual se usa para saber cuanto restar.
 * @param precioFurgo es el parametro base, el qual se devuelve una vez restado lo necesario.
 * @param edad es el nuevo parametro gracias al cual se sabe cuanto se devalua el precio/km
 * @return
 */
fun calcularPreuActual(kilometres: Double, precioFurgo: Int, edad : Int):Double{
    var resultat:Double
    var divisor = 0.00001
    if (edad in 6..10) divisor = 0.00002
    else if (edad>10) divisor= 0.00004
    resultat=precioFurgo-precioFurgo*(kilometres*divisor)/100
    if (kilometres > 5000 && kilometres < 10000) resultat-=200
    else if (kilometres > 10000) resultat-=300

    return resultat
}