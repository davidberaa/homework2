fun main () {

    class point {
        var x: Int = 5
        var y: Int = 10

        override fun toString(): String {
            return x.toString()
            return y.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (other is point) {
                if (x == y) {
                    return true
                }
            }
            return false
        }
    }

    fun SymmetricTowardsY() {
        var x = 1
        var y = 2
        x = -x
        return println("სიმეტრიული Y ღერძის მიმართ არის $x, $y")
    }
}