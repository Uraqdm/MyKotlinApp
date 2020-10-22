object Sentence{
    private lateinit var words: List<String>
    private lateinit var wordsCollection: Map<String, Int>

    fun doTestTask(){
        println("Enter some sentence, please")
        println()
        this.toWords()
        this.sort()
        println()
        println("Done!")
    }

    //Введенное предложение преобразую в массив строк
    private fun  toWords(){
        words = readLine().toString().split(" ").toList()
        println("Task 1")
        println("Sentence converted to list of words")
        this.printList(words)
    }

    // Сортировка массива
    private fun sort() {
        println("Task 2")
        println("Sorted list of words")
        this.printList(words.sorted())
    }


    // Вывод списка
    private fun printList(value:List<String>){
        value.forEach(::println)
    }

    // Вывод Map
    private fun printMap(value: Map<String, Int>) {
        value.forEach{
            println("${it.key} ${it.value}")
        }
    }
}
