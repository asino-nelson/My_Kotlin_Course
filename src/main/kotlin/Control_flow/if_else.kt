package Control_flow

fun main() {

    var age = 99


    if (age < 18){
        println("Sorry!!Not eligible to vote")
    }else if(age >= 18 && age <80 ){
        println("You are eligible to vote")
    }else{
        println("Too old to vote")
    }

}