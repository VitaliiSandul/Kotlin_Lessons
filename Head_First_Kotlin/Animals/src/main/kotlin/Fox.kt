class Fox: Canine(){
    override val image = "fox.jpg"
    override val food = "rabbits"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Wooooof!")
    }

    override fun eat() {
        println("The fox is eating $food")
    }
}