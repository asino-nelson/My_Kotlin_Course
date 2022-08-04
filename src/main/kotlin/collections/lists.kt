package collections

fun main(){

    //  .get() method
    //  listOf is immutable in nature
    val hobbies = listOf<String>("Coding", "Drawing", "Playing basketball", "Reading")
    println( hobbies.get(2))

    val numbers = listOf<Int>(1,2,4,5,6)
    println(numbers.get(3))



    //  .set() , .add() method ---- can only be used in mutable lists
    //  mutableListOf is mutable in nature
    val favMeals = mutableListOf<String>("Potatoes", "Sushi", "Biscuits")
    favMeals.set(2,"Mangoes")
    favMeals.add("Soda")
    println( favMeals.get(0))

    for (meal in favMeals){
        println(meal)
    }


    val marks = mutableListOf<Int>(70, 30, 89)
    marks.set(1, 58)

    for (score in marks){
        println(score)
    }

}
