fun main (){
    val employees = readLine()!!.toInt()
    val workhour=readLine()!!.toInt()
    val amountperhour=readLine()!!.toDouble()

    val salary= workhour*amountperhour

    println("NUMBER = $employees")
    println("SALARY = U$ %.2f".format(salary))


}