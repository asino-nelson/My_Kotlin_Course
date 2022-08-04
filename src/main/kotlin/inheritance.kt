fun main(){
    val dog = Dog()
    val human = Human()
    val superhero = SuperHero()
    val spiderman = spiderMan()
    println(dog.eating())
    println(human.eating())
    println(superhero.eating())
    println(superhero.saveTheWorld())
    println(spiderman.saveTheWorld())

}

open class Animal(){
    open fun eating() = "Animal is eating"
}

class Dog: Animal(){
    override fun eating() = "Dog is eating"
}

open class Human: Animal(){
    override fun eating()= "Humans love eating"
}

open class SuperHero: Human(){
    open fun saveTheWorld()="Super Hero saved the World"
}

class spiderMan:SuperHero(){
    override fun saveTheWorld() = "Spiderman is saving the whole city from bad people"
}