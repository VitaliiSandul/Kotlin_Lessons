typealias DoubleConversation = (Double) -> Double

//fun convert(x: Double,
//            converter: (Double) -> Double): Double{
//    val result = converter(x)
//    println("$x is converted to $result")
//    return result
//}

fun convert(x: Double,
            converter: DoubleConversation): Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String):DoubleConversation{
    if (str=="CentigrateToFarengate"){
        return {it*1.8+32}
    }
    else if (str=="KgsToPounds"){
        return {it*2.204623}
    }
    else if (str=="PoundsToUSTons"){
        return {it/2000.0}
    }
    else{
        return {it}
    }
}

fun combine(lambda1: DoubleConversation,
            lambda2: DoubleConversation):DoubleConversation{
    return {x:Double -> lambda2(lambda1(x))}
}


data class Grocery(val name: String, val category: String,
                   val unit: String, val unitPrice: Double)

fun search(list:List<Grocery>, criteria:(g: Grocery) -> Boolean){
    for (l in list){
        if (criteria(l)){
            println(l.name)
        }
    }
}

fun convertFive(converter: (Int) -> Double): Double{
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun unless( condition: Boolean, code: () -> Unit){
    if(!condition){
        code()
    }
}


fun main(){
//    var addFive = {x:Int -> x+5}
//    println("Pass 6 to addFive: ${addFive(6)}")
//
//    var addInts = {x:Int, y:Int -> x+y}
//    val result = addInts.invoke(6,7)
//    println("Pass 6, 7 to addInts: $result")
//
//    val intLambda: (Int,Int) -> Int = {x,y -> x*y}
//    println("Pass 10, 11 to intLambda: ${intLambda(10,11)}")
//
//    val addSeven: (Int) -> Int = {it + 7}
//    println("Pass 12 to addSeven: ${addSeven(12)}")
//
//    val myLambda: () -> Unit = { println("Hi!")}
//    myLambda()

//    convert(20.0){ it*1.8 + 32 }
//    convertFive { it*1.8 + 32 }
//
//
//    val options = arrayOf("Red","Amber","Green")
//    var crossWalk = options[(Math.random() * options.size).toInt()]
//    if (crossWalk == "Green"){
//        println("Walk!")
//    }
//    unless(crossWalk == "Green"){
//        println("Stop!")
//    }

    //Преобразовать 2.5 кг в фунты
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")
    //Определить два лямбда-выражения для преобразований
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")
    //Два лямбда-выражения преобразуются в одно новое
    val kgsToUSTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)
    //Использовать новое лямбда-выражение для преобразования
    // 17,4 кг в американские тонны
    val value = 17.4
    println("$value kgs is ${convert(value, kgsToUSTonsLambda)} US tons")

    println("---------------------------------------------")
    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "lb", 3.0),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0),
        Grocery("Bagels", "Bakery", "Pack", 1.5),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0),
        Grocery("Ice cream", "Frozen", "Pack", 3.0))
    println("Expensive ingredients:")
    search(groceries) {i: Grocery -> i.unitPrice > 5.0}
    println("All vegetables:")
    search(groceries) {i: Grocery -> i.category == "Vegetable"}
    println("All packs:")
    search(groceries) {i: Grocery -> i.unit == "Pack"}
}