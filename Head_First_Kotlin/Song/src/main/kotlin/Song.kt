class Song(val title:String, val artist:String){

    fun play(){
        println("Playing the song $title by $artist")
    }

    fun stop(){
        println("Stopped playing $title")
    }
}

class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean) {
    fun playTopHat(){
        if(hasTopHat) println("ding ding ba-da-bing!")
    }

    fun playSnare(){
        if(hasSnare) println("bang bang bang!")
    }
}

fun main(){
//    val songOne = Song("The Mesopotamians", "The mighy be Giants")
//    val songTwo = Song("Going Underground", "The Jam")
//    val songThree = Song("Make Me Smile", "Steve Harley")
//
//    songTwo.play()
//    songTwo.stop()
//    songThree.play()

    val d = DrumKit(true, true)
    d.playTopHat()
    d.playSnare()

    d.hasSnare = false
    d.playTopHat()
    d.playSnare()

}

//-------------------------------------------------------------

class Dog(val name: String,
          weight_param: Int,
          breed_param: String) {
    init {
        print("Dog $name has been created. ")
    }
    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    init {
        println("The breed is $breed.")
    }
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight / 2.2
    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

fun main(args: Array<String>) {
    val myDog = Dog("Fido", 70, "Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("My dog enjoys $item")
    }
    val dogs = arrayOf(Dog("Kelpie", 20, "Westie"), Dog("Ripper", 10, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
}