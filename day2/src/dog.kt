class dog(val name : String, weight_param: Int, breed_param: String) {
    var activity = arrayOf("walks")
    var breed = breed_param.toUpperCase()
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight / 2.2


    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }
    init{
        println("dog name ${name} has been created")
    }
}