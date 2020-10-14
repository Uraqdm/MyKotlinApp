fun main () {
    val sentence = Sentence()

    println("Enter some sentence, please")
    sentence.newSentence = readLine().toString()
    sentence.doTestTask()
}