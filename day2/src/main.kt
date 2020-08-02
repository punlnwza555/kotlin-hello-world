fun main(args: Array<String>){
    var mydog = dog("Fido", 70, "Mixed")

    myDog.bark()

    myDog.weight = 75

    println("Weight in Kgs is ${myDog.weightInKgs}")

    myDog.weight = -2

    println("Weight is ${myDog.weight}")

    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")

    for (item in myDog.activities) {

        println("My dog enjoys $item")
    }
}