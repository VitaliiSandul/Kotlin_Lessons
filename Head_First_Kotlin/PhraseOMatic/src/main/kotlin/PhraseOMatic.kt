fun main(){
//    val wordArray1= arrayOf("24/7","multi-tier","dynamic","pervasive")
//    val wordArray2= arrayOf("empowered","leveraged","aligned","targeted")
//    val wordArray3= arrayOf("process","paradigm","solution","portal","vision")
//
//    val arraySize1 = wordArray1.size
//    val arraySize2 = wordArray2.size
//    val arraySize3 = wordArray3.size
//
//    val rand1 = (Math.random() * arraySize1).toInt()
//    val rand2 = (Math.random() * arraySize2).toInt()
//    val rand3 = (Math.random() * arraySize3).toInt()
//
//    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
//    println(phrase)
//
//
//
//    var x = 42
//    var value = "Value of x is $x"
//
//    var myArray = arrayOf(1, 2, 3)
//    var arraySize = "myArray has ${myArray.size} items"
//    var firstItem = "The first item is ${myArray[0]}"
//
//    var result = "myArray is ${if (myArray.size > 10) "large" else "small"}"
//    println(result)

    val fruit = arrayOf("Apple","Banana","Cherry","Blueberry","Pomegranate")
    val index = arrayOf(1,3,4,2)

    var x =0
    var y: Int

    while (x<4){
        y=index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}