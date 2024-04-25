fun main() {
    val importantTask1 = ImportantTask("cleaning the room", "should be done today", "Aya")
    println( importantTask1.user )
    println("-" .repeat(15))
    println( importantTask1.title  )
    println( importantTask1.description)
    println("-" .repeat(15))
    importantTask1.priority = 4
    println("-" .repeat(15))
    importantTask1.completed = true






}