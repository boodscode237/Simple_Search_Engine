fun main() {
    // put your code here
    val magicNumber = readln().toInt()
    when {
        magicNumber < 10 -> println("1")
        magicNumber in 10..99  -> println("2")
        magicNumber in 100..999 -> println("3")
        else -> println("4")
    }
}