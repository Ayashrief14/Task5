import kotlin.properties.Delegates

class ImportantTask( var title: String, var description : String, user : String) :Task(title,description, user) {
    var priority : Int by Delegates.vetoable(3){property, oldValue, newValue ->
        if (newValue > 0){
            println("The priority has changed from $oldValue to $newValue" )
            return@vetoable true
        }else{
            println("The priority hasn't changed")
            return@vetoable false
        }





    }
}