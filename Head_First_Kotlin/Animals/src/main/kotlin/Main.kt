fun main(){
    val w = Wolf()
    w.makeNoise()
    w.roam()
    w.sleep()

    val animal: Animal = Wolf()
    animal.eat()

    println("-----------------------------------------")

    val animals = arrayOf(Hippo(),
                            Wolf(),
                            Lion(),
                            Cheetah(),
                            Lynx(),
                            Fox())

    for (item in animals) {
        item.roam()
        item.eat()
    }

    println("-----------------------------------------")

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    println("-----------------------------------------")

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.eat()
        }
    }
}