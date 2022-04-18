class Lion: Feline(){
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "savanah"

    override fun makeNoise() {
        println("Roar!")
    }

    override fun eat() {
        println("The lion is eating $food")
    }
}