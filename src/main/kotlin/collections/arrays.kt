package collections

fun main() {

    val names = arrayListOf<String>(
        "Nelson",
        "Wilson",
        "David"
    )
    names.add("Favor")
    names.get(2)
    names.set(1, "Willy")

    for (name in names){
        println(name)
    }


    var months = arrayOf("January", "February", "March" )
    for (month in months){
        println(month)
    }
}

