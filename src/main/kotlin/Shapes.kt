import kotlin.math.PI
import kotlin.math.pow

//We are going to write a program that outputs the area of a rectangle and a circle

fun main(){
    val rectangle = Shapes.Rectangle()
    val circle = Shapes.Circle()

    println("The area of the rectangle is ${rectangle.area()}")
    println("The area of the circle is ${circle.area()}")


}

open class Shapes(
    val length:Double?,
    val width:Double?,
    val radius:Double?
){
    class Rectangle:Shapes(length = 20.0, width = 30.0,null){
         fun area(){
            val len = length
            val wid = width
            val areaOfRectangle = len?.times(wid!!)
             println(areaOfRectangle)
        }
    }
    class Circle:Shapes(null,null,radius = 14.0){
         fun area(){
             val rad = radius
             val areaOfCircle = rad!!.pow(2)* PI
             println(areaOfCircle)
         }
    }
}

