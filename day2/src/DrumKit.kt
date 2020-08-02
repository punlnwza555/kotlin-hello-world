class DrumKit (var hasTopHat: Boolean, var hasSnare: Boolean){
    fun playTopHat(){
        if (hasTopHat) println("ding ding ba-da-bing!")
    }
    fun playSnare(){
        if (hasTopHat) println("bang bang bang!")
    }
}