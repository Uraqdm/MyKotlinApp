object Sentence{
    private lateinit var words: List<String>
    private lateinit var wordsCollection: Map<String, Int>

    // Удобный метод, необходимый для работы с массивами и их вывода
    fun doTestTask(){
        println("Enter some sentence, please")
        println()
        this.toWords()
        this.sort()
        this.printUnique()
        this.countWords()
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

    //Вывод уникальных элементов списка слов
    private fun printUnique(){
        println("Task 3")
        println("Sorted list of unique words")
        this.printList(words.toSet().sorted())
    }

    //Считаю повторяющиеся слова
    private fun countWords(){
        println("Task 4")
        println("Add count on words")
        wordsCollection = words.sorted().groupingBy { it }.eachCount()
        this.printMap(wordsCollection)
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
