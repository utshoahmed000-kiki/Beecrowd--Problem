class Student1{
               var name: String
               var roll: Int
               var marks: Double

               constructor(name: String,roll: Int,marks: Double){
                   this.name = name
                   this.roll = roll
                   this.marks=marks

               }
    fun display (){
        println("studnt name: $name")
        println("roll: $roll")
        println("marks: $marks")
    }


}
fun main (){
    print("Enter the name: ")
    val name = readLine()!!.toString()
    print("Enter the roll: ")
    val roll = readLine()!!.toInt()
    print("Enter the marks: ")
    val marks = readLine()!!.toDouble()
    val student1 = Student1(name, roll, marks)
    student1.display()

}