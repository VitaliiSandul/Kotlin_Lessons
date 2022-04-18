class Vehicle : Roamable {
    override val velocity: Int = 20

    override fun roam() {
        println("The Vehicle is roaming")
    }

}