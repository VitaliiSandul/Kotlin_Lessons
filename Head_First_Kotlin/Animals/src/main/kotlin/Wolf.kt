class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooow!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}