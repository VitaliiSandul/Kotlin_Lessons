fun main(){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)

//    for (i in options.indices){
//        println(options[i])
//    }

//    for (x in 1..100) println(x)
//    for (x in 1..100) println(x)
//    for (x in 15 downTo 1) println(x)
//    for (x in 1..100 step 2) println(x)
//    for (item in optionsParam) {
//        println("$item is an item in the array")
//    }
//    for (index in optionsParam.indices) {
//        println("Index $index has item ${optionsParam[index]}")
//    }
//    for ((index, item) in optionsParam.withIndex()) {
//        println("Index $index has item $item")
//    }


}

fun getGameChoice(optionsParam:Array<String>) =
    optionsParam[(Math.random()*optionsParam.size).toInt()]

//fun getGameChoice(optionsParam:Array<String>):String{
//    val tmp = optionsParam[(Math.random()*optionsParam.size).toInt()]
//
//    optionsParam[2]="sss"
//    return tmp
//}



fun getUserChoice(optionsParam: Array<String>):String{
    var isValidChoice = false
    var userChoice = ""
    //Выполнять цикл, пока пользователь не введет допустимый вариант
    while (!isValidChoice) {
        //Запросить у пользователя его выбор
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}


fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Определить результат
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
    //Вывести результат
    println("You chose $userChoice. I chose $gameChoice. $result")
}