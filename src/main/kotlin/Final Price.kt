fun main(){
    val newPrice = finalPrice(20_000.0)
    println(newPrice)
}

fun finalPrice(buyingPrice:Double, discount:Double = 0.2){
    val sellingPrice = buyingPrice - (buyingPrice * discount)
    println("The selling price is $sellingPrice")
}