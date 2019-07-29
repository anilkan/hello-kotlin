package xyz.anilkan.kotlin

fun main() {
    sayHello()
}

fun sayHello() {
    val a = notRandomNumber()
    println("Hello Kotlin !")
    println("My first number is $a, square of my first number is ${a * a}")

    val b = randomNumberNull()
    if (b != null) // randomNumberNull null değer döndürebildiğinde b değerini kullanmadan önce null kontrolü yapmak zorundayız.
        println("My second number is $b, square of my second number is ${b * b}")
    else
        println("My second number is null !")
}

fun notRandomNumber(): Int {
    return 3
}

fun randomNumberNull(): Int? {
    return null
}