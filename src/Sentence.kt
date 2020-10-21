class Sentence{
    private var _newSentence = "the quick brown fox jumps over the lazy dog"
    var newSentence
        get() = _newSentence
        set(value) {
            if (!value.trimMargin().isNullOrEmpty()) {
                _newSentence = value
            }
        }

    private  var _words: MutableList<MyWord> = mutableListOf()
    var words
        get() = _words
        set(value) {
            _words = value
        }

    fun doTestTask(){
        this.toWords()
        this.findUnique()
        this.sort()
        this.printing()
    }

    private fun  toWords(){
        var tempWord = ""
        this.newSentence += ' '
        for (char in this.newSentence){
            if (char != ' '){
                tempWord += char
            }
            else{
                this.words.plusAssign(( MyWord(tempWord)))
                tempWord = ""
            }
        }
    }

    private fun sort() {
        for (i in 0 until this.words.size) {
            for (j in 0 until this.words.size) {
                if (words[i].count > words[j].count){
                    val tmp = words[i]
                    words[i] = words[j]
                    words[j] = tmp
                }
                else if (words[i].word < words[j].word && words[i].count == words[j].count) {
                    val tmp = words[i]
                    words[i] = words[j]
                    words[j] = tmp
                }
            }
        }

    }

    private fun findUnique(){
        var temp: MutableList<MyWord> = mutableListOf()
        for (i in 0 until this.words.size) {
            for (j in 0 until this.words.size) {
                if (this.words[i].word == this.words[j].word && i!=j) {
                    this.words[i].count++
                    temp.add(this.words[i])
                }
            }
        }
        for (i in 0 until temp.size){
            if(temp[i].word == this.words[i].word){
                this.words.removeAt(i)
            }
        }
    }

    private fun printing(){
        for(element in words){
            println("${element.word} ${element.count}")
        }
    }

    constructor()
}
