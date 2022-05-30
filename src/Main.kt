
fun main() {
    var names = arrayOf("Java", "Kotlin", "Android")
    for(name  in names) {
        print("$name  ")
    }
    println()

    var codes = arrayOf(100, 200, 300, 400)
    for(code in codes) {
        print("$code  ")
    }
    println()

    //var marks = Array<Int>(10, {index -> index + 5} )
    var marks = Array<Int>(10) {index -> index + 5 }

    for(mark in marks) {
        print("$mark  ")
    }
    println()

    for(i in 0..marks.size-1) {
        print("${marks[i]}  ${marks.get(i)} -- ")
    }
    println()

    var values = IntArray(10) {index -> index}
    for(i in values) {
        print("$i  ")
    }
    println()

    println("1 + 1 = ${1+1}")
}

fun main3() {
    var num = 0b1011
    println("num = $num")

    var long : Long = 100.toLong()

   /* var ch1 = '\u1234'
    var ch2 = '\u983'
    println("ch1 = $ch1 ch2 = $ch2")*/

}

fun add(n1 : Int, n2 : Int) : Int {
    return n1 + n2
}

fun addSingleLine(n1 : Int, n2 : Int) =  n1 + n2

fun main2() {
    var res = add(10, 20)
    println("res = $res")
    res = addSingleLine(10, 20)
    println("res = $res")
    println("100 + 200 = ${addSingleLine(100, 200)}")

    var data = 100
    println("data = $data data + 1 = ${data + 1} ")
}


fun main1() {
    println("Hello Kotlin!")

    var i : Int = 0
    val j : Int = 20

    println("i = " + i)
    println("j =  " + j)

    i++
    //j++

    println("i = $i ") //String templates
    println("j = $j")

    var name : String = "Vishal Jagtap"
    var company = "BitCode"
    println("$name works at $company")

    //type inference
    var code = 100
    var studentName = "XYZ"
    var d = 12.12
    var f = 12.12F


}