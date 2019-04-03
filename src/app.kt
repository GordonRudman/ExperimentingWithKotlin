open class Animal(val id: Int, var name : String, val home : Address) {}
class Dog(id : Int, name : String, home : Address, val breed: String) : Animal(id, name, home)
{
    override fun toString(): String
    {
        return "$name is a $breed and lives at $home"
    }
}

fun main(args: Array<String>)
{
    val roversHome = Address("Apartment 21", "Somewhere road", "The burbs", "Metropolis")

    var rover = Dog(1, "Rover", roversHome, "Beagle")

    println(args.size)
    args.forEach { println(it) }

    var nonNullableString : String = "Must be assigned before use - checked at compile time"
    var nonNullableString1 = "Must be assigned before use - checked at compile time"

    println(nonNullableString)
    println(nonNullableString1)

    var nullableString : String? = null
    println(nullableString ?: "nothing to see here")

    println(roversHome)

    println(rover)
    println("Name: " + rover.name)
}