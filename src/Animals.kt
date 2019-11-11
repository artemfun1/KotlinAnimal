
fun main() {
    val animal = arrayOf(Hippo(),Wolf())
    for (item in animal) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
    }

class Vet{
    fun giveShot(animal:Animal){
        animal.makeNoise()
    }
}
open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger:Int = 10

    open fun makeNoise(){
        println("The Animals is making a noise")
    }
    open fun eat(){
        println("The Animals is eating")
    }
    open fun roam(){
        println("The Animals is roaming")
    }
    fun sleep(){
        println("The Animals is sleeping")
    }
}
class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"
    override fun makeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat(){
        println("The Hippo is eating $food")
    }
}
open class Canie : Animal(){
    override fun roam(){
        println("The Canine is roaming")
    }
}
class Wolf : Canie(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"
    override fun makeNoise() {
        println("Hooooowl!")
    }
    override fun eat() {
        println("The Wolf is eating $food")
    }
}


class Feline(){

}

class Canine(){

}
