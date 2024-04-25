import kotlin.properties.Delegates

 open class Task(title : String, description : String,  user: String, ) {
    var completed : Boolean by Delegates.observable(false){property, oldValue, newValue ->
        println("Task completed")
        println("True")
    }
      val user : String by lazy {"user is $user \n $user \n $user " }

}