/*Read three values (variables A, B and C), which are the three student's grades.
 Then, calculate the average, considering that grade B has weightA has weight 2,  3 and the grade C has weight 5.
Consider that each grade can go from 0 to 10.0, always with one decimal place.*/

fun main (){

    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()
    val C = readLine()!!.toDouble()

    val weightA=2
    val weightB=3
    val weightC=5
    val average=(A*weightA+B*weightB+C*weightC)/10

    println("MEDIA = %.1f".format(average))


}