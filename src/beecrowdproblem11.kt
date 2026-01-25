fun main() {


    val radius = readLine()!!.toDouble()
    val pi = 3.14159
    val volume = (4.0 / 3.0) * pi * radius * radius * radius
    println("VOLUME = %.3f".format(volume))
}