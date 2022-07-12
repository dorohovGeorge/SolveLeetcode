fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    return (left..right).filter { checkDividing(it) }
}

private fun checkDividing(num: Int): Boolean {
    var tmp = num
    val repeat = num.toString().length

    repeat((0 until repeat).count()) {
        if (tmp % 10 == 0) return false
        if (num % (tmp % 10) != 0) return false
        tmp /= 10
    }

    return true
}
