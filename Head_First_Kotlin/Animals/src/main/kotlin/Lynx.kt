class Lynx: Feline(){
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "savanah"

    override fun makeNoise() {
        println("Lynx Rar! Rar!")
    }

    override fun eat() {
        println("The Lynx is eating $food")
    }
}