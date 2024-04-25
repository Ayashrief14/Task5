fun main() {
    println("user name please : ")
    val importantTask1 = ImportantTask("cleaning the room", "should be done today", readln())
    println("what is the name of the task ?")
    importantTask1.title = readln()
    println(" what is the description of the task ?")
    importantTask1.description = readln()
    println("what is the priority of this task ? (number )")
    val taskPriority = readln().toInt()
    println("did you completed the task (true or false ?")
    val taskCompleted = readln().toBoolean()



    println( importantTask1.user )
    println("-" .repeat(15))
    println( importantTask1.title  )
    println( importantTask1.description)
    println("-" .repeat(15))
    importantTask1.priority = taskPriority
    println("-" .repeat(15))

    importantTask1.completed = taskCompleted
