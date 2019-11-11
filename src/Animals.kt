
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
    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables){
        item.roam()
        if (item is Animal){
            item.eat()
        }
    }
    }
class Vet{
    fun giveShot(animal:Animal){
        animal.makeNoise()
    }
}
class Vehicle: Roamable{
    override fun roam(){
        println("The Venicle is roaming")
    }
}
interface Roamable {
    fun roam()
}
abstract class Animal: Roamable {
    abstract val image : String
    abstract val food : String
    abstract val habitat : String
    val hunger:Int = 10
    abstract fun makeNoise()
    abstract fun eat()
    override fun roam(){
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
abstract class Canie : Animal(){
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


abstract class Feline(){
}