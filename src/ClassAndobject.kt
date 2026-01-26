import kotlin.time.TimeSource

class Student(var name:String,var roll:Int, var marks:Double) {
    fun display(){
        println("Name : $name")
        println("Roll: $roll")
        println("Marks: $marks")
    }
}

fun main (){


    print("Enter the name: ")
    val name = readLine()!!.toString()
    print("Enter the roll: ")
    val roll = readLine()!!.toInt()
    print("Enter the marks: ")
    val marks = readLine()!!.toDouble()

    val details = Student(name,roll,marks)
    details.display()

}