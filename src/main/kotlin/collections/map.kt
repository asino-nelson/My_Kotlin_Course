package collections

fun main() {


    //  MAPOF
    var myMap = mapOf<Int ,String>(
        7 to "Durant",
        23 to "LeBron",
        30 to "Curry",
        11 to "Kyrie"
    )
    println(myMap.get(30))
    for (person in myMap){
        println(person)
    }


    //  MUTABLEMAPOF
    var mutMap = mutableMapOf<String, Int>(
        "Durant" to 7,
        "LeBron" to 23,
        "Curry" to 30
    )
    mutMap.put("Chris Paul" ,3)

    for (players in mutMap){
        println(players)
    }


    //  HASHMAP
    var mutMap2 = HashMap<Int , String>()
    mutMap2.put(30, "Messi")

    for (legends in mutMap2){
        println(legends)
    }

    //  HASHMAPOF
    var mutMap3 = hashMapOf<Int , String>()
    mutMap3.put(7, "Ronaldo")

    for (element in mutMap3){
        println(element)
    }

}