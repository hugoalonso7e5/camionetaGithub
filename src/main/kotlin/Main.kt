import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Funcion principal. Es la base del programa a partir del cual te calcula el precio de tu furgoneta
 * @author Hugo Alonso
 */
fun main() {
    var precioFurgo=73490
    val precioFinal:Double
    println("Hola Don Usuario que tal estas\n" +
            "El caso es que qué furgoneta tienes, una (1)Volkswagen Grand California Normal\n" +
            "o una (2)Volkswagen Grand California Camper Full Equip?\n" +
            "${CYAN}1) Tengo una ${CYAN_BRIGHT}Volkswagen Grand California Normal\n" +
            "${PURPLE}2) Tengo una ${PURPLE_BRIGHT}Volkswagen Grand California Camper Full Equip$RESET")

    precioFurgo+=calcularPreuBase()

    println("Vale entiendo no esta nada mal la verdad.\n" +
            "Hace cuantos años la tienes??")

    val edad = llegirInt()

    println("Vale entiendo\n" +
            "Sabiendo que tu furgoneta cuesta $YELLOW_BOLD_BRIGHT$precioFurgo$RESET, cuantos ${WHITE_BOLD_BRIGHT}kilometros$RESET has recorrido?")

    val kilometres = llegirDouble()

    precioFinal=calcularPreuActual(kilometres, precioFurgo,edad)

    println("Vale entiendo\n" +
            "el caso")

    println("${YELLOW}Tu furgoneta vale la friolera de $RESET$YELLOW_BOLD_BRIGHT${BigDecimal(precioFinal).setScale(2, RoundingMode.FLOOR)}$RESET")
    println("asique aqui tienes tu furgoneta pintada\n" +
            RED_BOLD +
            " ================\\\n" +
            " |----------||@  \\\\   ___\n" +
            " |____|_____|||_/_\\\\_|___|_\n" +
            "<|  ___\\    ||     | ____  |\n" +
            "<| /    |___||_____|/    | |\n" +
            "||/  O  |__________/  O  |_||\n" +
            "   \\___/            \\___/\n" +
            "brum brum")
}