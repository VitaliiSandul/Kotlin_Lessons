class Cheetah: Feline(){
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "savanah"

    override fun makeNoise() {
        println("Rar! Rar!")
    }

    override fun eat() {
        println("The Cheetah is eating $food")
    }
}