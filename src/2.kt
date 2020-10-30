fun main() {

    var f1 = Fraction1()
    f1.numerator = 3F
    f1.denominator = 4F

    var f2 = Fraction1()
    f2.numerator = 3F
    f2.denominator = 4F
    println(f1 == f2)
    var numerator: Float = 4F
    var denominator: Float = 8F
    var usg = 1
    var temp = denominator
    for (i in denominator.toInt() downTo 0) {
        if (denominator.toInt() % temp.toInt() == 0 && numerator.toInt() % temp.toInt() == 0) {
            usg = temp.toInt()
            break
        }
        temp -= 1
    }
    print("მრიცხველი: ")
    println(numerator.toInt() / usg)
    print("მნიშვნელი: ")
    println(denominator.toInt() / usg)
}

class Fraction1 {
    var numerator: Float = 0F
    var denominator: Float = 1F

    override fun equals(other: Any?): Boolean {
        if (other is Fraction1) {
            if (numerator * other.denominator == denominator * other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator / $denominator"
    }

    fun Sum() {
        var a = 1
        var b = 2
        return println("$a + $b")
    }

    fun Division () {
        var a = 10
        var b = 5
        return println(a/b)
    }

    fun Multiplication() {
        var a = 3
        var b = 5
        return println(a*b)
    }
}
