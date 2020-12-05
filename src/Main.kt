fun main(args: Array<String>){
    menu()
}
fun menu(){
    do{
        val menuPrincipal = """
        Bienvenido a la Pizzeria
    Seleccione el menu que quisiera ver
    
    1.- Menu con Carne
    2.- Menu Vegetariano
    3.- Salir
    """.trimIndent()

        println(menuPrincipal)
        val option = readLine()

        when (option){
            "1" -> showMenuCarne()
            "2" -> showMenuVegetariano()
            "3" -> { println("Vuelva Pronto"); break }
            else -> println("Ingrese un dato valido")
        }
    }while(true)
}

fun showMenuVegetariano() {
    do {
        val menuVege = """
            Seleccione la pizza vegetariana que va a llevar

       1.- Pizza con tomate, calabacín y espinacas
       2.-Pizza vegetariana con mozzarella
       3.- Pizza con rúcula
       4.- Volver al Menu Principal
            
        """.trimIndent()

        println(menuVege)
        val optionV = readLine()

        when (optionV){
            "1" -> { println(" Una Pizza con tomate, calabacin y espinacas a la orden \n" +
                    "Gracias por su compra\n"); break}
            "2" -> {println("Una Pizza vegetariana con mozzarella enseguida \n" +
                    "Vuelva pronto \n"); break}
            "3" -> {println("Pizza con rucula a la orden \n" +
                    "Felices fiestas\n"); break}
            "4" -> { println("Regresando al menu principal \n"); menu()}
            else -> println("Ingrese un dato valido")
        }

    }while(true)
}


fun showMenuCarne(){
    do{
        val menuVege = """
            Seleccione la pizza vegetariana que va a llevar

       1.- Pizza de Peperoni
       2.-Pizza a la Mexicana
       3.- Pizza Hawaiana
       4.- Volver al Menu Principal
            
        """.trimIndent()

        println(menuVege)
        val optionV = readLine()

        when (optionV){
            "1" -> {println(" Una Pizza de Peperoni a la orden \n " +
                    "Gracias por su Preferencia \n"); break}
            "2" -> {println("Una Pizza a la mexicana si señor \n " +
                    "Vuelva Pronto :D \n"); break}
            "3" -> {println("Pizza Hawaiana enseguida \n" +
                    "Esperemos que le guste \n"); break}
            "4" -> { println("Regresando al menu principal \n"); menu()}
            else -> println("Ingrese un dato valido")
        }
    }while(true)
}