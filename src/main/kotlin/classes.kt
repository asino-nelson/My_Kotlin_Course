fun main(){
    val customer1 = Customer("Nelson", 4_000)

    customer1.Balance()

}


open class Customer(val name: String, var amountPaid :Int){

    fun Balance(){

        var itemPrice = 2_000
        var balance = amountPaid - itemPrice

        println("Dear $name your balance is $balance")

    }

}

