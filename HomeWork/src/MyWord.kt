class MyWord {
    private lateinit var _word:String
    var word
        get() = _word
        set(value) {
            this._word = value
        }

    private var _count = 1
    var count
        get() = _count
        set(value){
            this._count = value
        }

    constructor()
    constructor(value: String){
        this._word = value
    }

}