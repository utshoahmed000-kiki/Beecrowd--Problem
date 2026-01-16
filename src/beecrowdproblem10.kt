fun main (){
    val input1 = readLine()!!.split(" ")
    val a = input1[0].toInt()
    val b = input1[1].toInt()
    val e = input1[2].toDouble()

    val input2 = readLine()!!.split(" ")
    val c = input2[0].toInt()
    val d = input2[1].toInt()
    val f = input2[2].toDouble()


    val totalPrice=(b*e)+(d*f)
    println("VALOR A PAGAR: R$ %.2f".format(totalPrice))


}