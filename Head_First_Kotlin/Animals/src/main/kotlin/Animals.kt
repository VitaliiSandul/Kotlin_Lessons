//open class Animal{
//    open val image = ""
//    open val food = ""
//    open val habitat = ""
//    var hunger = 10
//
//    open fun makeNoise(){
//        println("The animal is making a noise")
//    }
//
//    open fun eat(){
//        println("The animal is eating")
//    }
//
//    open fun roam(){
//        println("The Animal is roaming")
//    }
//
//    fun sleep(){
//        println("The animal is sleeping")
//    }
//}

abstract class Animal: Roamable{
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()
    abstract fun eat()

    override fun roam(){
        println("The Animal is roaming")
    }

    fun sleep(){
        println("The animal is sleeping")
    }
}